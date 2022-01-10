import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class StaticInitializerBlock {

    private static int B;
    private static int H;
    private static Boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else
            flag = true;
    }

    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print("Area=" + area);
		}
		
	}//end of main
}
