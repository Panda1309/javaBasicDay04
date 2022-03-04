import java.util.Scanner;
public class Armstronginterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem, x, orgnum;
        System.out.println("Enter the interval in which you want to find armstrong number");
        int first = sc.nextInt();
        int last = sc.nextInt();
        for (x = first + 1; x < last; x++) {
            int sum = 0;
            orgnum = x;
            while (orgnum != 0) {
                rem = orgnum % 10;
                sum = sum + (rem * rem * rem);

                orgnum = orgnum / 10;
            }
            if (sum == x) {
                System.out.println(x);
            }
        }
    }
}
