import java.util.Arrays;

public class Cinema20Discussion {
    public static void main(String[] args) {
        String[][] audience = new String[4][2];

        // 1) ELEMEN yang null: barisnya tetap ada, hanya isinya kosong
        audience[1][0] = "Candra";
        audience[1][0] = null;
        System.out.println("Setelah audience[1][0] = null -> audience[1].length = " + audience[1].length);

        // 2) BARIS yang null: objek array barisnya tidak ada
        audience[1] = null;
        try {
            System.out.println(audience[1].length);
        } catch (NullPointerException e) {
            System.out.println("Setelah audience[1] = null -> NullPointerException");
            System.out.println("Pesan: " + e.getMessage());
        }

        // 3) Menambah baris: panjang array tidak bisa berubah, harus membuat array baru
        String[][] bigger = Arrays.copyOf(audience, audience.length + 1);
        bigger[4] = new String[]{"Ira", "Joko"};
        System.out.println("length lama = " + audience.length + ", length baru = " + bigger.length);
    }
}
