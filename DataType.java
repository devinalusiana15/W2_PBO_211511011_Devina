package variables;

import java.util.*;

public class DataType {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number : ");
       double number = sc.nextDouble();
       
       System.out.print( (long) + number + " can be fitted in: \n");
       if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE){
           System.out.println("* byte\n* short\n* int\n* long");
       }
       else if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE){
           System.out.println("* short\n* int\n* long");
       }
       else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE){
           System.out.println("* int\n* long");
       }
       else if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE){
           System.out.println("* long");
       }
       else{
           System.out.println(" Can't be fitted anywhere");
       }
    }
}