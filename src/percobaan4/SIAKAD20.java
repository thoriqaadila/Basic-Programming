import java.util.Scanner;

public class SIAKAD20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[4][3];   // 4 mahasiswa (baris) x 3 mata kuliah (kolom)

        // Langkah 3 + 4: input nilai dengan nested loop dan rata-rata per mahasiswa
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter scores for student no. " + (i + 1));
            double totalPerStudent = 0;

            for (int j = 0; j < scores[i].length; j++) {
                System.out.print("Score for course " + (j + 1) + ": ");
                scores[i][j] = sc.nextInt();
                totalPerStudent += scores[i][j];
            }

            System.out.println("Average score: " + totalPerStudent / scores[i].length);
        }

        // Langkah 5: rata-rata per mata kuliah (jumlah kolom, dibagi jumlah mahasiswa)
        System.out.println("\n========================================");
        System.out.println("Average score of each course:");

        for (int j = 0; j < scores[0].length; j++) {
            double totalPerCourse = 0;

            for (int i = 0; i < scores.length; i++) {
                totalPerCourse += scores[i][j];
            }

            System.out.println("Course " + (j + 1) + ": " + totalPerCourse / scores.length);
        }
    }
}
