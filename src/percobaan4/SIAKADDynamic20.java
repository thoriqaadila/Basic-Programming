import java.util.Scanner;

public class SIAKADDynamic20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pertanyaan 1: jumlah mahasiswa dan mata kuliah ditentukan saat program berjalan
        int numStudents;
        do {
            System.out.print("Enter the number of students: ");
            numStudents = sc.nextInt();
            if (numStudents <= 0) {
                System.out.println("The number must be greater than 0.");
            }
        } while (numStudents <= 0);

        int numCourses;
        do {
            System.out.print("Enter the number of courses: ");
            numCourses = sc.nextInt();
            if (numCourses <= 0) {
                System.out.println("The number must be greater than 0.");
            }
        } while (numCourses <= 0);

        int[][] scores = new int[numStudents][numCourses];

        // Semua loop memakai length, bukan angka tetap
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
