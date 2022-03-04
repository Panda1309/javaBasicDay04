import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose what you want to do:");
        System.out.println("1. Addition\n 2. Subtraction\n 3.Multiplication\n 4. Division");
        int ch= sc.nextInt();
        switch (ch)
        {
            case 1-> {
                System.out.println("Enter two numbers");
                int num1= sc.nextInt();
                int num2= sc.nextInt();
                System.out.println("Addition of "+num1+ " and "+num2+ ": "+(num1+num2));
            }
            case 2->
                    {    System.out.println("Enter two numbers");
                        int num1= sc.nextInt();
                        int num2= sc.nextInt();
                        System.out.println("Subtraction of "+num1+ " and "+num2+ ": "+(num1-num2));
                    }
            case 3->
                    {
                        System.out.println("Enter two numbers");
                        int num1= sc.nextInt();
                        int num2= sc.nextInt();
                        System.out.println("Multiplication of "+num1+ " and "+num2+ ": "+(num1*num2));
                    }
            case 4->
                    {
                        System.out.println("Enter two numbers");
                        int num1= sc.nextInt();
                        int num2= sc.nextInt();
                        System.out.println("Division of "+num1+ " and "+num2+ ": "+(num1/num2));
                    }
            default -> System.out.println("Please select a number in between 1 and 4");

        }
    }
}
