import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.DayOfWeek;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        // System.out.println(cal.get(cal.DAY_OF_WEEK)); // return 2
        // System.out.println(cal.getDisplayName(cal.DAY_OF_WEEK, cal.LONG, Locale.US)); // return Monday
        // System.out.println(cal.get(cal.MONTH)); // return 4
        
        // System.out.println(cal.get(cal.DAY_OF_WEEK + 1)); // return 3
        // cal.set(cal.get(cal.DAY_OF_WEEK), cal.get(cal.DAY_OF_WEEK) + 1); // SET cal.DAY_OF_WEEK to 3
        // System.out.println(cal.getDisplayName(cal.DAY_OF_WEEK, cal.LONG, Locale.US)); // return Saturday

        cal.set(year, (month-1), day);

        // System.out.println(cal.getTime()); // return Sun Jun 12 22:57:42 UTC 2022
        // System.out.println(cal.getDisplayName(cal.DAY_OF_WEEK, cal.LONG, Locale.US)); // return Sunday
        // System.out.println("cal.getDisplayName(cal.MONTH, cal.LONG, Locale.US) = " + cal.getDisplayName(cal.MONTH, cal.LONG, Locale.US)); // return June with cal.getDisplayName()
        // System.out.println("cal.get(cal.MONTH) = " + cal.get(cal.MONTH)); // return 5 with cal.get() 
        // System.out.println(cal.get(cal.YEAR)); // return 2022

        

        return cal.getDisplayName(cal.DAY_OF_WEEK, cal.LONG, Locale.US);
    }

}


public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = {"05", "16", "2022"};

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        System.out.println(res);

        // bufferedWriter.write(res);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
    
}


