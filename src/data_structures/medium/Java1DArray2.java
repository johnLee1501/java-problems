package data_structures.medium;

import java.util.Scanner;

public class Java1DArray2 {
    public static boolean canWin(int leap, int[] game) {
        int i = 0;
        while (true) {
            if (i + 1 >= game.length || i + leap >= game.length) {
                return true;
            }
            if (game[i + leap] == 0) {
                i += leap;
            } else if (i > 0 && game[i + leap] != 0) {
                int j = i;
                boolean status = true;
                while (status) {
                    if (game[j - 1] == 0) {
                        j--;
                        if (game[j + leap] == 0) {
                            i = j + leap;
                            break;
                        } else if (j == 0) {
                            status = false;
                        }
                    } else {
                        status = false;
                    }
                }
            } else if (game[i + 1] == 0) {
                i++;
            } else {
                return false;
            }
        }
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

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}