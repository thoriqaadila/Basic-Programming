import java.util.Scanner;
public class E3Q2 { public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter the number of students: ");
 int n = input.nextInt();
 int[] studentScores = new int[n];
 int total = 0, passed = 0;
 for (int i = 0; i < n; i++) {
  System.out.print("Enter the score for student #" + (i + 1) + ": ");
  studentScores[i] = input.nextInt();
  total += studentScores[i];
  if (studentScores[i] > 70) passed++;
 }
 double average = (double) total / n;
 int highest = studentScores[0], lowest = studentScores[0];
 for (int i = 1; i < n; i++) { if (studentScores[i] > highest) highest = studentScores[i]; if (studentScores[i] < lowest) lowest = studentScores[i]; }
 System.out.println("Total: " + total + ", Average: " + average + ", Highest: " + highest + ", Lowest: " + lowest + ", Passed: " + passed);
}}
