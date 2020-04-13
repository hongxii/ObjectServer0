package main.string;

public class StringSplit {

    public static void main(String[] args) {
        String money = "30.000";
        System.out.println(money.indexOf("."));

        money = money.substring(0, money.indexOf("."));
        System.out.println(money);
        System.out.println(money.indexOf("."));

    }
}
