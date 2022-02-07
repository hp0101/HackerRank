import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {

        System.out.println(arr.toString());
        int size = arr.size();
        long min = (long) Float.POSITIVE_INFINITY;
        long max = (long) Float.NEGATIVE_INFINITY;

        long sum = Long.valueOf(0);


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    sum += arr.get(j);
                }
            }
            // System.out.println("Before Min-Max Sum=" + sum);

            if (sum < min) {
                min = sum;
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }
        System.out.println("Min=" + min);
        System.out.println("Max=" + max);
    }
}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>(){
            {
                add(2);
                add(2);
            }
        };

        // for (int i = 0; i < 5; i++) {
        //     int arrItem = Integer.parseInt(arrTemp[i]);
        //     arr.add(arrItem);
        // }

        Result.miniMaxSum(arr);

        // bufferedReader.close();
    }
}
