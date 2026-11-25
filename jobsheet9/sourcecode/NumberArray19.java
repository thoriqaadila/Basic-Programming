import java.util.Arrays;

public class NumberArray01 {
    public static void main(String[] args) {
        // Step 2: create an int array with 4 elements
        int[] numbers = new int[4];

        // Step 3: fill each element
        numbers[0] = 5;
        numbers[1] = 13;
        numbers[2] = -7;
        numbers[3] = 17;

        // Step 4: display with a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Step 5: display with a foreach loop
        for (int number : numbers) {
            System.out.println(number);
        }

        // Step 5: display with Arrays.toString()
        System.out.println(Arrays.toString(numbers));
    }
}
