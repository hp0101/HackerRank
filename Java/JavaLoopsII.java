import java.util.*;
import java.io.*;


public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        String s = "";
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                s = s + String.valueOf((int)(a + Math.pow(2,j) * b) + " ");
                a = (int) (a + Math.pow(2,j) * b);
            }
            s += "\n";
        }
        System.out.print(s);
        in.close();
    }
}
