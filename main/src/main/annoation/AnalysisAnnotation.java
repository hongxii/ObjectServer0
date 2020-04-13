package main.annoation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hongxii
 */
public class AnalysisAnnotation {

    private static Map<String, Integer> mapCMDLevel = new HashMap<>();
    private static Map<String, Method> mapCMDMethod = new HashMap<>();
    private static ClassWithAnnotation handler = new ClassWithAnnotation();

    static {
        Class<? extends ClassWithAnnotation> clazz = handler.getClass();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(GM.class)) {
                GM annotation = method.getAnnotation(GM.class);
                Integer put = mapCMDLevel.put(annotation.cmd(), annotation.level());
                if (put != null) {
                    System.err.println("GmHandler含重复cmd：" + annotation.cmd());
                }
                mapCMDMethod.put(annotation.cmd(), method);
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            //Class<?> clazz = ClassWithAnnotation.class;
            Class<?> clazz = Class.forName("main.annoation.ClassWithAnnotation");


            Method[] methods = clazz.getMethods();
            boolean desctionExist = clazz.isAnnotationPresent(Goal.class);
            if (desctionExist) {
                Goal goal = clazz.getAnnotation(Goal.class);
                System.out.println("class's annotation value:" + goal.value());
                for (Method method : methods) {
                    if (method.isAnnotationPresent(GM.class)) {
                        GM annotation = method.getAnnotation(GM.class);
                        System.out.println("method's anntation value:" + annotation.cmd());

                        method.invoke(handler, "吼哈哈哈哈哈",1);

                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {

            String ret = "函数参数定义非法";
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

