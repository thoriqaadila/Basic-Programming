public class Numbers20Q5Q7 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // Pertanyaan 5 (Code 17): panjang tiap baris
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + myNumbers[i].length);
        }

        // Pertanyaan 7: mengganti baris pertama dengan array baru berukuran 7
        myNumbers[0] = new int[7];
        System.out.println("myNumbers.length    = " + myNumbers.length);
        System.out.println("myNumbers[0].length = " + myNumbers[0].length);
    }
}
