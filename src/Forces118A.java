// https://codeforces.com/problemset/problem/118/A

import java.util.Scanner;

public class Forces118A {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        while (sb.indexOf("a") != -1) {
            sb.deleteCharAt(sb.indexOf("a"));
        }
        while (sb.indexOf("e") != -1) {
            sb.deleteCharAt(sb.indexOf("e"));
        }
        while (sb.indexOf("i") != -1) {
            sb.deleteCharAt(sb.indexOf("i"));
        }
        while (sb.indexOf("o") != -1) {
            sb.deleteCharAt(sb.indexOf("o"));
        }
        while (sb.indexOf("u") != -1) {
            sb.deleteCharAt(sb.indexOf("u"));
        }
        while (sb.indexOf("y") != -1) {
            sb.deleteCharAt(sb.indexOf("y"));
        }
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isAlphabetic(sb.charAt(i))) {
                sb.insert(i++, '.');
            }
        }
        System.out.println(sb);
    }
}
