package main.datecontrol;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;


/**
 * @author hongxii
 */
public class DateTest {


    public static void main(String[] args) {

//        try {

        String dateStr = "2019/10/15 00:00:00";
        dateStr = dateStr.replace("/", "-");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(dateStr, formatter);

        System.out.println(dateTime);
        System.out.println(dateTime.toEpochSecond(ZoneOffset.of("+8")));

        /*} catch (DateTimeParseException e) {
            return;

        } catch (NullPointerException e) {

            return;
        }*/

        String date = "2019/10/15 0:00";
        String replace = date.replace("/", "-");
        System.out.println(replace);

        System.out.println("/");
        System.out.println("\\");


    }
}