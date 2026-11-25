import java.util.Scanner;

public class CinemaMenu20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];
        String choice;

        do {
            // Pertanyaan 2: menu
            System.out.println();
            System.out.println("===== CINEMA MENU =====");
            System.out.println("1. Enter audience data");
            System.out.println("2. Show the audience list");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            choice = sc.nextLine().trim();

            if (choice.equals("1")) {
                System.out.print("Enter name: ");
                String name = sc.nextLine().trim();

                boolean placed = false;
                while (!placed) {
                    // baca baris (hanya menerima angka)
                    System.out.print("Enter row (1-" + audience.length + "): ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Please enter a number: ");
                        sc.next();
                    }
                    int row = sc.nextInt();

                    // Pertanyaan 3: validasi nomor baris
                    if (row < 1 || row > audience.length) {
                        System.out.println("Row " + row + " does not exist. Valid rows: 1-" + audience.length + ".");
                        continue;
                    }

                    // baca kolom (hanya menerima angka)
                    System.out.print("Enter column (1-" + audience[row - 1].length + "): ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Please enter a number: ");
                        sc.next();
                    }
                    int col = sc.nextInt();
                    sc.nextLine();   // buang sisa newline

                    // Pertanyaan 3: validasi nomor kolom
                    if (col < 1 || col > audience[row - 1].length) {
                        System.out.println("Column " + col + " does not exist. Valid columns: 1-"
                                + audience[row - 1].length + ".");
                        continue;
                    }

                    // Pertanyaan 4: cek kursi sudah terisi
                    if (audience[row - 1][col - 1] != null) {
                        System.out.println("Seat (" + row + "," + col + ") is already taken by "
                                + audience[row - 1][col - 1] + ". Please choose another seat.");
                        continue;
                    }

                    audience[row - 1][col - 1] = name;
                    System.out.println(name + " is seated at (" + row + "," + col + ").");
                    placed = true;
                }

            } else if (choice.equals("2")) {
                // Pertanyaan 5: kursi kosong ditampilkan sebagai ***
                System.out.println();
                System.out.println("===== AUDIENCE LIST =====");
                System.out.printf("%-8s", "");
                for (int j = 0; j < audience[0].length; j++) {
                    System.out.printf("%-10s", "Col " + (j + 1));
                }
                System.out.println();

                for (int i = 0; i < audience.length; i++) {
                    System.out.printf("%-8s", "Row " + (i + 1));
                    for (int j = 0; j < audience[i].length; j++) {
                        String seat = (audience[i][j] == null) ? "***" : audience[i][j];
                        System.out.printf("%-10s", seat);
                    }
                    System.out.println();
                }

            } else if (!choice.equals("3")) {
                System.out.println("Invalid choice, please enter 1-3.");
            }
        } while (!choice.equals("3"));

        System.out.println("Goodbye!");
    }
}
