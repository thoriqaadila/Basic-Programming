import java.util.Arrays;

public class Numbers20 {
    public static void main(String[] args) {
        // Langkah 2: array 2 dimensi dengan panjang baris berbeda (jagged array)
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // Langkah 3: tampilkan tiap baris dengan Arrays.toString()
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
    }
}
