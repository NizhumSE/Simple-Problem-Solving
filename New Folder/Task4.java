//Write a Java program which adds all numbers that are multiples of both 7 and 9 up to 600 //
 
  
public class Task4 {
    public static void main(String args[]) {
        // Print numbers divided by 7
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 600; i++) {
            if (i % 7 == 0)
                System.out.print(i + ", ");
        }

        // Print numbers divided by 5
        System.out.println("\n\nDivided by 9: ");
        for (int i = 1; i < 600; i++) {
            if (i % 9 == 0)
                System.out.print(i + ", ");
        }

        // Print numbers divided by both 3 and 5
        System.out.println("\n\nDivided by 7 & 9: ");
        for (int i = 1; i < 600; i++) {
            if (i % 7 == 0 && i % 9 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\n");
    }
}
