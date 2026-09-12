import java.util.Scanner;

public class lec4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;   // assume prime first

        if (n <= 1) {
            isPrime = false;   // 0 and 1 are not prime
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;  // found a divisor, so not prime
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}