import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {

        int counter = 0;
        for (int i = n; i > 0; i--) {
            counter++;
            // print white spaces
            for (int j = 0; j < n-counter; j++){
                System.out.print(" ");
            }
            // print symbols
            for (int k = 1; k <= counter; k++) {
                System.out.print("#");
            }
            // print a new line
            System.out.println("");

        }

    }

}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
