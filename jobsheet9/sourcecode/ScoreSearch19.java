public class ScoreSearch19 {
    public static void main(String[] args) {
        int[] scores = {78, 65, 90, 55, 88, 72};
        int key = 90;
        boolean found = false;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == key) {
                System.out.println("Score " + key + " was found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Score " + key + " was not found.");
        }
    }
}
