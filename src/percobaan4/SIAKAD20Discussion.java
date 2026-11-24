public class SIAKAD20Discussion {
    public static void main(String[] args) {
        int[][] scores = {
            {80, 75, 90},
            {70, 85, 65},
            {90, 95, 100},
            {60, 70, 80}
        };

        // BENAR: totalPerStudent dideklarasikan di dalam loop luar (di-reset tiap mahasiswa)
        System.out.println("Variabel DI DALAM loop luar (benar):");
        for (int i = 0; i < scores.length; i++) {
            double totalPerStudent = 0;
            for (int j = 0; j < scores[i].length; j++) {
                totalPerStudent += scores[i][j];
            }
            System.out.println("Student " + (i + 1) + ": " + totalPerStudent / scores[i].length);
        }

        // SALAH: total dideklarasikan di luar loop luar (tidak pernah di-reset)
        System.out.println();
        System.out.println("Variabel DI LUAR loop luar (salah):");
        double total = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            System.out.println("Student " + (i + 1) + ": " + total / scores[i].length);
        }
    }
}
