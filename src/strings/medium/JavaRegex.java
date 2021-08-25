package strings.medium;

import java.util.Scanner;

class MyRegex {
    public String pattern = "^(([10]?\\d?\\d|[2][0-4]\\d|2[0-5][0-5]).){3}([10]?\\d?\\d|[2][0-4]\\d|2[0-5][0-5])$";
}

public class JavaRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
/*
String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;*/

/*
Sample Input
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

Sample Output
true
true
true
false
false
false
*/