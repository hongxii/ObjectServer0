package main.systemDate;

import com.sun.jna.Native;
//import com.sun.jna.platform.win32.WinBase.SYSTEMTIME;
import com.sun.jna.win32.StdCallLibrary;

/**
 * @author hongxii
 * 需要jna包支持：通过C执行
 */
public class WindowsSetSystemTime {

    /**
     * Kernel32 DLL Interface. kernel32.dll uses the __stdcall calling
     * convention (check the function declaration for "WINAPI" or "PASCAL"), so
     * extend StdCallLibrary Most C libraries will just extend
     * com.sun.jna.Library,
     */
    /*public interface Kernel32 extends StdCallLibrary {

        boolean SetLocalTime(SYSTEMTIME st);

        Kernel32 instance = (Kernel32) Native.loadLibrary("kernel32.dll", Kernel32.class);

    }

    public boolean SetLocalTime(SYSTEMTIME st) {
        return Kernel32.instance.SetLocalTime(st);
    }

    public boolean SetLocalTime(short wYear, short wMonth, short wDay, short wHour, short wMinute, short wSecond , short wMilliseconds) {
        SYSTEMTIME st = new SYSTEMTIME();
        st.wYear = wYear;
        st.wMonth = wMonth;
        st.wDay = wDay;
        st.wHour = wHour;
        st.wMinute = wMinute;
        st.wSecond = wSecond;
        st.wMilliseconds=wMilliseconds;
        return SetLocalTime(st);
    }*/
}
