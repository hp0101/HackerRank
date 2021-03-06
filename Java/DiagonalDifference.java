import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        
        System.out.println("(width) arr.size()=" + arr.size());
        System.out.println("(length) arr.get(0).size() = " + arr.get(0).size());
        
        int length = arr.get(0).size();
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        int j = length - 1;
        
        for (int i = 0; i < length; i++) {
            firstDiagonalSum += arr.get(i).get(i);
            secondDiagonalSum += arr.get(i).get(j);
            j--;
        }
        
        return Math.abs(firstDiagonalSum - secondDiagonalSum);
    }

}

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>() {
            {
                add(new ArrayList<>() {
                    {
                        add(0);
                        add(1);
                        add(2);
                    }
                });
                add(new ArrayList<>() {
                    {
                        add(0);
                        add(1);
                        add(2);
                    }
                });
                add(new ArrayList<>() {
                    {
                        add(0);
                        add(1);
                        add(2);
                    }
                });
            }
        };

        // for (int i = 0; i < n; i++) {
        //     String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            // List<Integer> arrRowItems = new ArrayList<>();

            // for (int j = 0; j < n; j++) {
            //     int arrItem = Integer.parseInt(arrRowTempItems[j]);
            //     arrRowItems.add(arrItem);
            // }

            // arr.add(arrRowItems);
        // }

        int result = Result.diagonalDifference(arr);
        System.out.println("Result=" + result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
