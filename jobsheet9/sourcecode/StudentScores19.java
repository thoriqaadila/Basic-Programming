import java.util.Scanner;

public class StudentScores01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Enter the number of scores
        int n;
        do {
            System.out.print("Enter the number of student scores: ");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("The number must be greater than 0.");
            }
        } while (n <= 0);

        int[] scores = new int[n];
        int total = 0;

        // 2. Enter each score one by one
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            scores[i] = input.nextInt();
            total += scores[i];
        }

        // 3. Average
        double average = (double) total / scores.length;

        // 4. Highest and lowest
        int highest = scores[0];
        int lowest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) highest = scores[i];
            if (scores[i] < lowest) lowest = scores[i];
        }

        // 5. Display all scores with PASS/FAIL (PASS if > 70)
        System.out.println();
        System.out.println("===== STUDENT SCORE REPORT =====");
        for (int i = 0; i < scores.length; i++) {
            String status = (scores[i] > 70) ? "PASS" : "FAIL";
            System.out.println("Student #" + (i + 1) + ": " + scores[i] + " (" + status + ")");
        }
        System.out.println("--------------------------------");
        System.out.println("Average       : " + average);
        System.out.println("Highest score : " + highest);
        System.out.println("Lowest score  : " + lowest);
        input.close();
    }
}
