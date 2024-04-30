//For 5 numbers, find Maximum.//
import java.util.Scanner;
class Number{
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
    int max = Integer.MIN_VALUE;
    if ( max < x ) {
      max = x;
    }
    if (max <y ) {
      max = y;
    }
    if (max <z ){
      max = z;
    }
    if (max <p ){
      max = p;
    }
    if (max <q ){
      max = q;
    }
    
    System.out.println ("Largest Value is " + max);
    
  }
}