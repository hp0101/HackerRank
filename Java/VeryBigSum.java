import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
    
        Long temp = Long.valueOf(0);
        for (Long each : ar) {
            temp += each;
        }
        
        return temp;
    }

}

public class VeryBigSum {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        // String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> ar = new ArrayList<>() {
            {
                add(Long.valueOf(1000000001));
                add(Long.valueOf(1000000002));
                add(Long.valueOf(1000000003));
                add(Long.valueOf(1000000004));
                add(Long.valueOf(1000000005));
            }
        };

        // for (int i = 0; i < arCount; i++) {
        //     long arItem = Long.parseLong(arTemp[i]);
        //     ar.add(arItem);
        // }
        

        long result = Result.aVeryBigSum(ar);
        System.out.println("Result=" + result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
