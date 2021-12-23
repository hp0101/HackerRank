package Java;
import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                // string will always have 15 characters with trailing empty spaces filled out
                // integer will always have 3 digits with leading empty spaces fill with 0
                String format = "%-14s %03d %n";
                System.out.printf(format, s1, x);
            }
            System.out.println("================================");
    }
}
