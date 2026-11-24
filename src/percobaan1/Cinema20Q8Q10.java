public class Cinema20Q8Q10 {
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

        // Pertanyaan 8 (Code 9): penonton baris ke-3 dengan for
        System.out.println("Audience in row 3: ");

        for (int i = 0; i < audience[2].length; i++) {
            System.out.println(audience[2][i]);
        }

        // Pertanyaan 9 (Code 10): penonton baris ke-3 dengan foreach
        System.out.println("Audience in row 3 (foreach): ");

        for (String name : audience[2]) {
            System.out.println(name);
        }

        // Pertanyaan 10 (Code 11): penonton semua baris dengan String.join()
        for (int i = 0; i < audience.length; i++) {
            System.out.println("Audience in row " + (i + 1) + ": " + String.join(", ", audience[i]));
        }
    }
}
