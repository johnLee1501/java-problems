package introduction;

import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for (int x = 0; x < n; x++) {
                sum += Math.pow(2, x) * b;
                System.out.printf("%s ", sum);
            }
            System.out.println();
        }
        in.close();
    }
}