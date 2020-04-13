package main.interfaces;


/**
 * @author hongxii
 */
public class MainClassIn implements ICondition {

    @Override
    public int getMinLen() {
        return 8;
    }

    @Override
    public String getRule() {
        return "==";
    }

    public static void main(String[] args) {

        MainClassIn classIn = new MainClassIn();
        System.out.println(classIn.check(9, 9));
        System.out.println(classIn.getTargetIndex());
    }
}
