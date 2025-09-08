import java.util.Scanner;

public class Forces69A {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sumx = 0, sumy = 0, sumz = 0, n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sumx += sc.nextInt();
            sumy += sc.nextInt();
            sumz += sc.nextInt();
        }
        if (sumx == 0 && sumy == 0 && sumz==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
