package main.npe;

import java.time.chrono.IsoEra;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author hongxii
 */
public class NPEDebug {

    private static void isE(Map<Integer, Integer> items) {
        if (items.isEmpty()) {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {


        List<Integer> days = new ArrayList<>();
        days.add(null);
        if (days.isEmpty()) {
            return;
        }
        days.sort(Integer::compareTo);

        isE(null);

    }
}
