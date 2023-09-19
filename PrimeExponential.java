import java.util.Scanner;

public class PrimeExponential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        System.out.print("Prime exponential of " + num + " is: ");
        for (int i = 2; i <= num; i++) {
            int count = 0;
            while (num % i == 0) {
                num = num / i;
                count++;
            }
            if (count > 0) {
                System.out.print("(" + i + "," + count + ")");
                if (num > 1) {
                    System.out.print(" , ");
                }
            }
        }

        sc.close();
    }
}