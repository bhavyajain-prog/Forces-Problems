import java.util.Scanner;

public class Forces118B {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(j);
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(j);
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
