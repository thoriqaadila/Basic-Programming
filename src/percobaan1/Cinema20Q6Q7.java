public class Cinema20Q6Q7 {
    public static void main(String[] args) {
        String[][] audience = new String[4][2];

        audience[0][0] = "Amin";
        audience[0][1] = "Bena";
        audience[1][0] = "Candra";
        audience[1][1] = "Dela";
        audience[2][0] = "Eka";
        audience[2][1] = "Farhan";
        audience[3][0] = "Gisel";
        audience[3][1] = "Hana";

        // Pertanyaan 6 (Code 7): panjang tiap baris dengan for
        System.out.println(audience.length);

        for (int i = 0; i < audience.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + audience[i].length);
        }

        // Pertanyaan 7 (Code 8): panjang tiap baris dengan foreach
        System.out.println(audience.length);

        for (String[] rowAudience : audience) {
            System.out.println("Row length: " + rowAudience.length);
        }
    }
}
