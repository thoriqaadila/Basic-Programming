import java.util.Arrays;
import java.util.Scanner;

public class CinemaWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        String name, choice;
        String[][] audience = new String[4][2];

        // Langkah 2: isi array memakai Scanner
        while (true) {
            System.out.print("Enter name: ");
            name = sc.nextLine();
            System.out.print("Enter row: ");
            row = sc.nextInt();
            System.out.print("Enter column: ");
            col = sc.nextInt();
            sc.nextLine();   // buang sisa newline di buffer

            audience[row - 1][col - 1] = name;

            System.out.print("Add another audience member? (y/n): ");
            choice = sc.nextLine();

            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Tambahan (bukan dari jobsheet): menampilkan isi array agar hasil input terlihat
        System.out.println(Arrays.deepToString(audience));
    }
}
