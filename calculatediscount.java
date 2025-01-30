//A hardcoded program to get discount by initializing the discount
public class calculatediscount{
   
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
        
//hard code initializing the amount as the parameter in the method
       discount= getDiscount(5000);
       System.out.println("The Discount amount is: " + discount);
     }
}
