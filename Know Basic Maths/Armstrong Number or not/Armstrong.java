
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int originalNum = n;

        int numberOfDigits = 0;
        int temp = n;

        // Count the number of digits
        while (temp != 0) {
            temp /= 10;
            numberOfDigits++;
        }

        int sum = 0;
        temp = n;

        // Calculate the sum of cubes of digits
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        // Check if it is an Armstrong number
        if (sum == originalNum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();


    }
}
