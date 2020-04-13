package main.collection;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

/**
 * @author hongxii
 */
public class ListMain {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(7);
        list2.add(8);
        list2.add(9);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

//        list.add(0, 9999);


        System.out.println(list);
        list.sort((a,b)->b-a);
        System.out.println(list);


        ArrayList<String> listStr = new ArrayList();
        listStr.add("1#1");
        listStr.add("1#2");
        listStr.add("1#3");
        listStr.add("2#1");
        listStr.add("2#2");
        listStr.add("2#3");

        System.out.println(listStr.contains("1#3"));
        System.out.println(listStr.contains("2#2"));
        System.out.println(listStr.contains("3#2"));




    }
}
