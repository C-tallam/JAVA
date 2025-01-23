//caleb tallam
//CT101/G/19118/23


import java.util.Scanner;

public class bonuscalculator {
    public static void main(String[] args) {
        //create a scanner object for user input
        Scanner obj = new Scanner(System.in) ;
        //hard code the salary and years of services
        //prompt salary  amount from user
        System.out.print("enter your salary amount:");
        double salary = obj.nextDouble();
        //prompt for the years of services from user
        System.out.print("enter your years of service:");
        int yearsofservice =obj.nextInt();
        //printing the bonusn
        System.out.printf("the net bonus is:%.02f\n " ,bonus(salary,yearsofservice));


    

    }
    //computing the net bonus 
    static double bonus(double salary,int yearsofservice){
        double bonus;
        if (yearsofservice>10) {
            bonus= salary * 0.12;
        }
        else if (yearsofservice>=6&&yearsofservice<=10) {
            bonus=salary * 0.10;
        }
        else if(yearsofservice<6){
            bonus=salary * 0.08;
        }
        else {
            bonus=0.0;
        }
        return bonus;
    
    }
    }
