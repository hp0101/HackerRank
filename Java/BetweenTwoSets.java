import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        
        // Sample input
        // 2 3 -> size of first array, size of second array
        // 2 4 -> [2, 4]
        // 16 32 96 -> [16, 32, 96]
        // There are 3 numbers: 4, 8, 16 because 4 % 2 = 0, 4 % 4 = 0, 16 % 4 = 0, 32 % 4 = 0, 96 % 4 = 0, etc...

        int aSize = a.size();
        int bSize = b.size();
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            boolean ok = true;
            for (int j = 0; j < aSize && ok; j++) {
                if (i % a.get(j) != 0) ok = false;
            }
            // 16 % 32 = 16
            // 32 % 16 = 0
            for (int k = 0; k < bSize; k++) {
                if (b.get(k) % i != 0) ok = false;
            }
            if (ok) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }

}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // int n = Integer.parseInt(firstMultipleInput[0]);

        // int m = Integer.parseInt(firstMultipleInput[1]);

        // String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = 2; // size of first array
        int m = 3; // size of second array

        // first array = [2, 4]
        List<Integer> arr = new ArrayList<>() {
            {
                add(2);
                add(4);
            }
        };

        // for (int i = 0; i < n; i++) {
        //     int arrItem = Integer.parseInt(arrTemp[i]);
        //     arr.add(arrItem);
        // }

        // String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // second array = [16, 32, 96]
        List<Integer> brr = new ArrayList<>() {
            {
                add(16);
                add(32);
                add(96);
            }
        };

        // for (int i = 0; i < m; i++) {
        //     int brrItem = Integer.parseInt(brrTemp[i]);
        //     brr.add(brrItem);
        // }

        int total = Result.getTotalX(arr, brr);
        System.out.println(total);

        // bufferedWriter.write(String.valueOf(total));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}