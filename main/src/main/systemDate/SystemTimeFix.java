package main.systemDate;

import java.io.IOException;

/**
 * @author hongxii
 */
public class SystemTimeFix {

    public static void main(String[] args) {

        String[] params = {"fix", "2020", "12", "20", "20", "20", "20"};

        String cmd;
        String date = params[1] + "-" + params[2] + "-" + params[3];
        String time = params[4] + ":" + params[5] + ":" + params[6];

        try {
            cmd = " cmd /c date " + date;
            Runtime.getRuntime().exec(cmd);
            cmd = " cmd /c time " + time;
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
