import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String firstTwoChars = s.substring(0, 2);
        String lastTwoChars = s.substring(8, 10);

        System.out.println("firstTwoChars=" + firstTwoChars);
        System.out.println("lastTwoChars=" + lastTwoChars);

        if (lastTwoChars.equalsIgnoreCase("AM")) {
            if (firstTwoChars.equalsIgnoreCase("12"))
                return "00" + s.substring(2, 8);
            else
                return s.substring(0, 8);
        }
        else {
            if (firstTwoChars.equalsIgnoreCase("12"))
                return s.substring(0, 8);
            else
                return  String.valueOf(Integer.parseInt(firstTwoChars) + 12) + s.substring(2, 8);
        }

    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String s = bufferedReader.readLine();

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String result = Result.timeConversion(s);

        System.out.println(result);

        // bufferedWriter.write(result);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
