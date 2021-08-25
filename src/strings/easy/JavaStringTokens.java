package strings.easy;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if (s.length() > 0) {
            String pattern = "[ !,?._'@]+";
            String[] tokens = s.split(pattern);
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }else{
            System.out.println(0);
        }
        scan.close();
    }
}

/*
Sample Input
He is a very very good boy, isn't he?

Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
*/