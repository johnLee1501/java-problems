package strings.easy;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        System.out.println( A.equals( new StringBuilder(A).reverse().toString())? "Yes" : "No" );

    }
}


/*
Sample Input
madam

Sample Output
Yes
*/

/*
for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - 1 - i)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
*/