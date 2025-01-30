import java.util.Scanner;
public class calculatediscount2{
     public static   double  getDiscount(double amount) {
    double discount = 0;
    
        if(amount>5000){
            discount = amount * 0.01;
           
        }
        else if(amount>=1000&&amount<=5000){
            discount = amount * 0.05;
           
        }
        else if(amount<1000){
         
         System.out.println( "No Discount");
        }
        return discount;
       }
     public static void main(String[] args) {
        double discount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount");
        double amount=input.nextDouble();
        
//calling the method and passing one argument amount to the method
      discount = getDiscount(amount);
       System.out.println("The discount is = " + discount);

}
}