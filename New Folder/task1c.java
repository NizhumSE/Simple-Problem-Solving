// Task 1c)  For 5 numbers, find Average. //
import java.util.Scanner;
class task1c{
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int p = sc.nextInt();
    int q = sc.nextInt();
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(p);
    System.out.println(q);
    
    int sum = (x+y+z+p+q);
    System.out.println ("Total Value is " + sum);
    
    
    
    int avg = sum/5;
    System.out.println ("The Average Number is " + avg);
    
    
    
    
    
    
  }
  
}