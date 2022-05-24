import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here

    List<Integer> result = new ArrayList<Integer>(){
        {
            add(0); add(0);
        }
    };
    int tempHighest = scores.get(0);
    int tempLowest = scores.get(0);

    for (int i = 1; i < scores.size(); i++) {
        if (tempHighest < scores.get(i)) {
            tempHighest = scores.get(i);
            int count = result.get(0);
            count++;
            result.set(0, count);
        }
        else if (tempLowest > scores.get(i)) {
            tempLowest = scores.get(i);
            int count = result.get(1);
            count++;
            result.set(1, count);
        }
    }

    return result;
        
    }

}

public class BreakingTheRecords {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        // String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = 10;

        List<Integer> scores = new ArrayList<>() {
            {
                // 10 5 20 20 4 5 2 25 1
                add(10); add(5); add(20); add(20); add(4); add(5); add(2); add(25); add(1); 
                
            }
        };

        // for (int i = 0; i < n; i++) {
        //     int scoresItem = Integer.parseInt(scoresTemp[i]);
        //     scores.add(scoresItem);
        // }

        List<Integer> result = Result.breakingRecords(scores);
        System.out.println(result.toString());

        // for (int i = 0; i < result.size(); i++) {
        //     bufferedWriter.write(String.valueOf(result.get(i)));

        //     if (i != result.size() - 1) {
        //         bufferedWriter.write(" ");
        //     }
        // }

        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
