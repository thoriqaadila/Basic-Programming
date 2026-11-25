import java.util.Scanner;

public class AverageScoreArray19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] studentScores = new int[10];
        int total = 0;
        double average;

        // Step 4: input scores and accumulate the total
        for (int i = 0; i < studentScores.length; i++) {
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            studentScores[i] = input.nextInt();
            total += studentScores[i];
        }

        // Step 5: average
        average = (double) total / studentScores.length;
        System.out.println("Total score: " + total);
        System.out.println("Average: " + average);

        // Step 6: highest and lowest
        int highest = studentScores[0];
        int lowest = studentScores[0];
        for (int i = 1; i < studentScores.length; i++) {
            if (studentScores[i] > highest) highest = studentScores[i];
            if (studentScores[i] < lowest) lowest = studentScores[i];
        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);

        // Step 7: class grade category
        String category;
        if (average >= 85) {
            category = "EXCELLENT";
        } else if (average >= 70) {
            category = "GOOD";
        } else {
            category = "NEEDS IMPROVEMENT";
        }
        System.out.println("Class grade: " + category);
        input.close();
    }
}
