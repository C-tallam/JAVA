
import java.util.Scanner;


public class sum {
    public static void main(String[] args) {
        int a, b, result;
        //creating an object called obj
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value of a");
        a=obj.nextInt();
        System.out.println("enter the value of b");
         b=obj.nextInt();
         //close the object file
         obj.close();

         result= a + b;
         System.out.println(a + "+" + b + "=" + result);


    }

}