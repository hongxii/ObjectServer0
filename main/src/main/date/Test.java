package main.date;

import java.time.LocalDateTime;

/**
 * @author hongxii
 */
public class Test {


    public static void main(String[] args) {

        int value = LocalDateTime.now().getDayOfWeek().getValue();
        System.out.println(value);

    }
}
