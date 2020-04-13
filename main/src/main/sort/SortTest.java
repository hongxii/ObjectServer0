package main.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortTest {

    public static List<Integer> levels = new ArrayList();

    {
        levels.add(1);
        levels.add(3);
        levels.add(7);
        levels.add(9);
        levels.add(-1);
    }

    public static void main(String[] args) {
        List<int[]> levels = new ArrayList();

//        levels.add(new int[]{1,3});
//        levels.add(new int[]{3,3});
//        levels.add(new int[]{7,99});
//        levels.add(new int[]{7});
//        levels.add(new int[]{9,37});
//        levels.add(new int[]{7,-1});
//        levels.add(new int[]{7,77});
//        levels.add(new int[]{-1,3});


        levels.add(new int[]{6, 519_0000});
        levels.add(new int[]{6, 21_0000});
        levels.add(new int[]{6, 2_0000});
        levels.add(new int[]{14, 652_0000});


        levels.forEach(arr -> System.out.println(arr.length == 2 ? (arr[0] + "#" + arr[1]) : (arr[0] + "#")));
        System.out.println("=====");

        levels.sort((a, b) -> (b[0] - a[0]));
        levels.sort((a, b) -> {
            if (b[0] == a[0]) {
                if (b.length > 1 && a.length > 1) {
                    return b[1] - a[1];
                } else if (b.length > 1) {
                    return b[1];
                } else if (a.length > 1) {
                    return -a[1];
                }
            }
            return 0;//b[0] - a[0];
        });


        //int max = levels.stream().reduce(0, Math::max);
        levels.forEach(arr -> System.out.println(arr.length == 2 ? (arr[0] + "#" + arr[1]) : (arr[0] + "#")));
    }
}
