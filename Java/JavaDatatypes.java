import java.util.*;
import java.io.*;

class JavaDatatypes {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                long x = sc.nextLong();
                System.out.println(x+" can be fitted in:");
                // 8-bit can store value from 0 to 255 (2^8 - 1) for non-negative numbers only. 
                // 8-bit can also store value from -128 (-1 x 2^7) to 127 (2^7 - 1) for both negative and non-negative numbers.
                if (x >= -128 && x <= 127) System.out.println("* byte"); // 8-bit
                if (x >= (-1 * Math.pow(2, 15)) && x <= (Math.pow(2, 15) - 1)) System.out.println("* short"); // 16-bit
                if (x >= (-1 * Math.pow(2, 31)) && x <= (Math.pow(2, 31) - 1)) System.out.println("* int"); // 32-bit
                if (x >= (-1 * Math.pow(2, 63)) && x <= (Math.pow(2, 63) - 1)) System.out.println("* long"); // 64-bit
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
