package main.systemDate;

import java.io.IOException;

/**
 * @author hongxii
 */
public class SystemTimeFix2 {

    public static void main(String[] args) {
        //String cmd = "powershell.exe  $PSVersionTable.PSVersion";
        String cmd = "powershell.exe  Start-Process powershell -Verb runAs 'Set-Date 2020-12-20'";
        try {
//            Runtime.getRuntime().exec(" cmd /c time 2020-12-20" );
            Runtime.getRuntime().exec(cmd );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
