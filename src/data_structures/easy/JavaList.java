package data_structures.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integerList.add(scan.nextInt());
        }
        int nQueries = scan.nextInt();
        for (int i = 0; i < nQueries; i++) {
            scan.nextLine();
            String operation = scan.nextLine();
            int index = scan.nextInt();
            if (operation.equals("Insert")) {
                int value = scan.nextInt();
                integerList.add(index, value);
            } else {
                integerList.remove(index);
            }
        }
        for (int i = 0; i < integerList.toArray().length; i++) {
            System.out.print(integerList.get(i) + " ");
        }
    }
}
/*Sample Input
5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output
0 1 78 12 23*/

/*import java.util.Scanner;
        import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            list.add(value);
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scan.next();
            if (action.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else { // "Delete"
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();


        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}*/
