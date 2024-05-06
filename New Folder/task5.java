//Write a Java program which adds all numbers that are multiples of either 7 or 9 up to 600. Ensure that numbers like 63 are added only once in the sum. //

public class task5 {
    public static void main(String[] args) {
        int sum = 0;
        boolean[] added = new boolean[601]; // Array to track whether a number has been added
        
        // Iterate through numbers up to 600
        for (int i = 1; i <= 600; i++) {
            if ((i % 7 == 0 || i % 9 == 0) && !added[i]) { // Check if multiple of 7 or 9 and not already added
                sum += i; // Add the number to the sum
                // Mark all multiples of the current number as added to avoid duplicates
                for (int j = i; j <= 600; j += i) {
                    added[j] = true;
                }
            }
        }
        
        System.out.println("Sum of numbers that are multiples of either 7 or 9 up to 600: " + sum);
    }
}
