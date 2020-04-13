package main.interfaces;

/**
 * @author hongxii
 */
public interface ICondition {

    String PARAMS_EXCEPTION = "参数异常";

    int getMinLen();

    default int getTargetIndex() {
        return getMinLen() - 1;
    }

    String getRule();

    /**
     * check 角色
     */
    default boolean check(Integer target,Integer count) {

        if (target == null ) {
            return false;
        }

        if (count == null) {
            return  false;
        }

        boolean result;

        switch (getRule()) {
            case "<=":
                result = count <= target;
                break;
            case "<":
                result = count < target;
                break;
            case "==":
                result = count.equals(target);
                break;
            case "!=":
                result = !count.equals(target);
                break;
            case ">":
                result = count > target;
                break;
            case ">=":
                result = count >= target;
                break;
            default:
                result = false;
        }
        return result;
    }

}
