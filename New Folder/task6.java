//Write a Java program which adds all numbers that are multiples of either 7 or 9 but not both, up to 600. //

public class task6 {
    public static void main(String[] args) {
        int sum = 0;
        
        // Iterate through numbers up to 600
        for (int i = 1; i <= 600; i++) {
            if ((i % 7 == 0 || i % 9 == 0) && !(i % 7 == 0 && i % 9 == 0)) {
                // Check if the number is a multiple of either 7 or 9 but not both
                sum += i; // Add the number to the sum
            }
        }
        
        System.out.println("Sum of numbers that are multiples of either 7 or 9 but not both up to 600: " + sum);
    }
}
