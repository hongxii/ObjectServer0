function do_Action() {
    var myDate = new Date();
    var now_Hours = myDate.getHours();       //当前时
    var now_Minutes = myDate.getMinutes();     //当前分
    var now_day = myDate.getDay();         //今天周几

    if (now_day <= 6) {
        if (now_Hours == 9 && now_Minutes >= 10) {
            toast("正确的时间,开始行为");
            sleep(2000);
            var rand1 = Math.ceil(Math.random() * 10);//获取随机数

            toast(rand1);
            sleep(rand1 * 1000);						  //延迟执行秒数
            launchApp("钉钉");
            sleep(10 * 1000);						  //延迟执行秒数
            launchApp("微信");
        } else {
            toast("打卡时间不正确,5分钟后再次执行")
            sleep(5000)
            do_Action();
        }
    } else {
        log("非工作日")
    }
}

toast("")
do_Action();
