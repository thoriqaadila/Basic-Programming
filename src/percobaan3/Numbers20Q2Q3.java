import java.util.Arrays;

public class Numbers20Q2Q3 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // Pertanyaan 2: toString() dipanggil pada array 2 dimensi seutuhnya
        System.out.println(Arrays.toString(myNumbers));

        // Pertanyaan 3: deepToString()
        System.out.println(Arrays.deepToString(myNumbers));
    }
}
