import java.util.Locale;
import java.util.Scanner;

public class Survey20 {
    public static void main(String[] args) {
        final int NUM_RESPONDENTS = 10;
        final int NUM_QUESTIONS = 6;

        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[NUM_RESPONDENTS][NUM_QUESTIONS];   // baris = responden, kolom = pertanyaan

        // 1. Simpan hasil survei ke array 2 dimensi (jawaban 1-5, divalidasi)
        for (int i = 0; i < survey.length; i++) {
            System.out.println("Respondent " + (i + 1));
            for (int j = 0; j < survey[i].length; j++) {
                int answer;
                do {
                    System.out.print("  Question " + (j + 1) + " (1-5): ");
                    while (!sc.hasNextInt()) {
                        System.out.print("  Please enter a number (1-5): ");
                        sc.next();
                    }
                    answer = sc.nextInt();
                    if (answer < 1 || answer > 5) {
                        System.out.println("  The answer must be between 1 and 5.");
                    }
                } while (answer < 1 || answer > 5);
                survey[i][j] = answer;
            }
        }

        // Tabel hasil survei
        System.out.println();
        System.out.println("===== SURVEY RESULTS =====");
        System.out.printf("%-14s", "");
        for (int j = 0; j < NUM_QUESTIONS; j++) {
            System.out.printf("%-5s", "Q" + (j + 1));
        }
        System.out.println();
        for (int i = 0; i < survey.length; i++) {
            System.out.printf("%-14s", "Respondent " + (i + 1));
            for (int j = 0; j < survey[i].length; j++) {
                System.out.printf("%-5d", survey[i][j]);
            }
            System.out.println();
        }

        // 2. Rata-rata tiap responden (jumlah baris / jumlah pertanyaan)
        int grandTotal = 0;
        System.out.println();
        System.out.println("===== AVERAGE PER RESPONDENT =====");
        for (int i = 0; i < survey.length; i++) {
            int totalPerRespondent = 0;
            for (int j = 0; j < survey[i].length; j++) {
                totalPerRespondent += survey[i][j];
            }
            grandTotal += totalPerRespondent;
            System.out.printf(Locale.US, "Respondent %d: %.2f%n", i + 1,
                    (double) totalPerRespondent / survey[i].length);
        }

        // 3. Rata-rata tiap pertanyaan (jumlah kolom / jumlah responden)
        System.out.println();
        System.out.println("===== AVERAGE PER QUESTION =====");
        for (int j = 0; j < survey[0].length; j++) {
            int totalPerQuestion = 0;
            for (int i = 0; i < survey.length; i++) {
                totalPerQuestion += survey[i][j];
            }
            System.out.printf(Locale.US, "Question %d: %.2f%n", j + 1,
                    (double) totalPerQuestion / survey.length);
        }

        // 4. Rata-rata keseluruhan
        System.out.println();
        System.out.println("===== OVERALL AVERAGE =====");
        System.out.printf(Locale.US, "Overall average: %.2f%n",
                (double) grandTotal / (NUM_RESPONDENTS * NUM_QUESTIONS));
    }
}
