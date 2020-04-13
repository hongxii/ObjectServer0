package main.string;

/**
 * @author hongxii
 */
public class StringTest {

    public static void main(String[] args) {

        String sid = "1_2_33";
        sid = sid.substring(sid.lastIndexOf("_") + 1);
        System.out.println(sid);

        String cmd = "@gm 1";
        System.out.println(cmd.substring(1));

    }
}
