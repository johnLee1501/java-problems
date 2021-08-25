package data_structures.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayList {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        List<List<String>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> row = Arrays.asList(bufferedReader.readLine().split(" "));
            arr.add(row);
        }
        int n_queries = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n_queries; i++) {
            String[] query = bufferedReader.readLine().split(" ");
            int row = Integer.parseInt(query[0]);
            int position = Integer.parseInt(query[1]);
            try {
                System.out.println(arr.get(row - 1).get(position));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}

/*
Sample Input
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output
74
52
37
ERROR!
ERROR!*/