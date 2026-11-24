import java.util.Arrays;

public class Numbers20Discussion {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // 1) "Salinan" dengan penugasan biasa: hanya menyalin REFERENSI
        int[][] copy = myNumbers;
        copy[0][0] = 99;
        System.out.println("Assignment : myNumbers[0][0] = " + myNumbers[0][0]);
        myNumbers[0][0] = 0;   // kembalikan

        // 2) Salinan dalam (deep copy) dengan loop: tiap baris disalin
        int[][] deep = new int[myNumbers.length][];
        for (int i = 0; i < myNumbers.length; i++) {
            deep[i] = Arrays.copyOf(myNumbers[i], myNumbers[i].length);
        }
        deep[0][0] = 77;
        System.out.println("Deep copy  : myNumbers[0][0] = " + myNumbers[0][0] + ", deep[0][0] = " + deep[0][0]);

        // 3) clone() hanya salinan dangkal (shallow): baris-barisnya masih dipakai bersama
        int[][] cloned = myNumbers.clone();
        cloned[0][0] = 55;
        System.out.println("clone()    : myNumbers[0][0] = " + myNumbers[0][0] + ", cloned[0][0] = " + cloned[0][0]);

        cloned[1] = new int[]{1};   // mengganti baris di salinan saja
        System.out.println("clone()    : myNumbers[1].length = " + myNumbers[1].length
                + ", cloned[1].length = " + cloned[1].length);
    }
}
