package Java;
import java.util.Scanner;

public class stdinAndStdout2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        Double d = scan.nextDouble();
        // nextLine() will read the \n from nextDouble()
        String newLine = scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}