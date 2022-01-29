import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {

        DecimalFormat df = new DecimalFormat("0.000000");

        double pos = 0, neg = 0, zero = 0, total = 0;
        total = arr.size();

        for (Integer each : arr) {
            if (each < 0) neg++;
            if (each > 0) pos++;
            if (each == 0) zero++;
        }

        System.out.println(df.format(pos/total));
        System.out.println(df.format(neg/total));
        System.out.println(df.format(zero/total));
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        // String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // List<Integer> arr = new ArrayList<>();

        // for (int i = 0; i < n; i++) {
        //     int arrItem = Integer.parseInt(arrTemp[i]);
        //     arr.add(arrItem);
        // }

        List<Integer> arr = new ArrayList<>() {
            {
                add(1);
                add(1);
                add(0);
                add(-1);
                add(-1);
            }
        };

        System.out.println(arr.toString());

        Result.plusMinus(arr);

        // bufferedReader.close();
    }
}
