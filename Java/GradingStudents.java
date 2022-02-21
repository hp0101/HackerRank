import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    
        List<Integer> newArr = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) > 37 & (grades.get(i) % 5 == 3)) {
                newArr.add(grades.get(i) + 2);
            }
            else if (grades.get(i) > 37 & (grades.get(i) % 5 == 4)) {
                newArr.add(grades.get(i) + 1);
            }
            else {
                newArr.add(grades.get(i));
            }
        }

        return newArr;
    }
}

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>() {
            {
                add(4);
                add(73);
                add(67);
                add(38);
                add(33);
            }
        };

        // for (int i = 0; i < gradesCount; i++) {
        //     int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
        //     grades.add(gradesItem);
        // }

        List<Integer> result = Result.gradingStudents(grades);
            
        System.out.println(result);
        // for (int i = 0; i < result.size(); i++) {
        //     bufferedWriter.write(String.valueOf(result.get(i)));

        //     if (i != result.size() - 1) {
        //         bufferedWriter.write("\n");
        //     }
        // }

        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
