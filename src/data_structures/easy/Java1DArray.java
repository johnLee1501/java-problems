package data_structures.easy;

import java.util.Scanner;

public class Java1DArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }
        scan.close();
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

/*
Sample Input
5
10
20
30
40
50

Sample Output
10
20
30
40
50
*/