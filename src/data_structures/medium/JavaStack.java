package data_structures.medium;

import java.util.Scanner;

public class JavaStack {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            while(!input.equals(input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")));
            System.out.println(input.isEmpty());
        }

    }
}

/*Sample Input
{}()
({()})
{}(
[]

Sample Output
true
true
false
true*/