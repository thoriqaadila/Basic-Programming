import java.util.Scanner;
public class E4Q2 { public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Number of elements: ");
 int n = input.nextInt();
 int[] scores = new int[n];
 for (int i = 0; i < n; i++) { System.out.print("Score #" + (i + 1) + ": "); scores[i] = input.nextInt(); }
 System.out.print("Value to search: ");
 int key = input.nextInt();
 boolean found = false;
 for (int i = 0; i < scores.length; i++) { if (scores[i] == key) { System.out.println("Score " + key + " was found at index " + i); found = true; break; } }
 if (!found) System.out.println("The value you are looking for was not found: " + key + " is not in the array (checked " + scores.length + " elements).");
}}
