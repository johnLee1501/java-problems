package data_structures.medium;

import java.util.Scanner;

public class Java1DArray2 {
    private static boolean isSolvable(int leap, int[] game, int position) {
        // Base Cases
        if (position >= game.length) {
            return true;
        } else if (position < 0 || game[position] == 1) {
            return false;
        }

        game[position] = 1; // marks as visited

        // Recursive Cases
        return isSolvable(leap, game, position + leap) ||
                isSolvable(leap, game, position + 1) ||
                isSolvable(leap, game, position - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((isSolvable(leap, game, 0)) ? "YES" : "NO");
        }
        scan.close();
    }
}