package main.annoation;

/**
 * @author hongxii
 */
@Goal("this is a class with description annotation")
class ClassWithAnnotation {

    @GM(cmd = "this is a method with annotation", size = 5,desc = "测试开头")
    public void doSth(String aaa,int sd) {
        System.out.println(aaa+"|||"+sd);
        System.out.println("i have a annotation 我实现了");
    }
}

