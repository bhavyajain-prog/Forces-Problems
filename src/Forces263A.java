import java.util.Scanner;

public class Forces263A {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = -1, y = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int val = sc.nextInt();
                if (val == 1) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.println(Math.abs(x - 2) + Math.abs(y - 2));
    }
}
