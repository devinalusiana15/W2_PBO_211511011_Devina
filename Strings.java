package variables;
import java.util.*;

public class Strings {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first word: ");
    String first = sc.next();
    System.out.println("\nEnter second word: ");
    String second = sc.next();
    System.out.println("\n");
    
    System.out.println( first.length() + second.length());
    if (first.length() >= second.length())
    {
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    System.out.println( first.substring(0, 1).toUpperCase() + first.substring(1) 
            + " " + second.substring(0, 1).toUpperCase() + second.substring(1));
    }
}
