package introduction;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        try {
            if (n < -100 || n > 100) {
                throw new Exception();
            }
            String s = String.valueOf(n);
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}
/*
String s = String.valueOf(n);
String s = Integer.toString(n);
String s = "" + n;
*/

/*
Sample Input 0

100
Sample Output 0

Good job
*/