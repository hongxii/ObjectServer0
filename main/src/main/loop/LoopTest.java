package main.loop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongxii
 */
public class LoopTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        int a = 10;
        if (a == 10) {


            for (int aa : list) {
                if (aa == 8) {
                    break;
                }
                System.out.println("aa="+aa);
            }
            System.out.println("OUT");
        }

        System.out.println("END");
    }
}
