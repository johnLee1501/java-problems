package introduction;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        for (int i = 1; scan.hasNext(); i++) {
            System.out.println(i + " " + scan.nextLine());
        }

    }
}

/*
   int i = 0;
   while(scan.hasNext()){
           i++;
           System.out.println(i + " " + scan.nextLine());
   }*/

/*

Sample Input

Hello world
I am a file
Read me until end-of-file.

Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.
*/