//For 5 numbers, find Maximum.//
import java.util.Scanner;
class task1b{
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
    int min = Integer.MAX_VALUE;
    if ( min > x ) {
      min = x;
    }
    if (min > y ) {
      min = y;
    }
    if (min > z ){
      min = z;
    }
    if (min > p ){
      min = p;
    }
    if (min > q ){
      min = q;
    }
    
    System.out.println ("Minimum Value is " + min);
  
  }

}