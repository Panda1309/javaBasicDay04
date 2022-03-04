import java.util.Scanner;

public class PrimeUsingFunction {
    public static void main(String[] args)
    {
        PrimeUsingFunction f=new PrimeUsingFunction();
        f.PrimeNumber();
    }
    static void PrimeNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range in which you want to print all prime numbers:");
        int first=sc.nextInt();
        int last= sc.nextInt();
        int i;
        System.out.println("All prime numbers in between "+first+" and "+last+" are:");
        for(int x=first+1;x<last;x++)
        {
            for(i=2;i<x;i++)
                if(x%i==0)
                    break;
            if(x==i)
                System.out.println(x);
        }
    }
}
