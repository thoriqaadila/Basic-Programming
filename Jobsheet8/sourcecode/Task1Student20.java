import java.util.Scanner;

public class Task1Student20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n must be at least 1.");
        } else {
            int count = 0;   // counts every number printed

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                    if (j < i) {
                        System.out.print(" ");
                    }
                    count++;
                }
                System.out.println();
            }
            System.out.println("Total numbers printed: " + count);
        }
        sc.close();
    }
}
