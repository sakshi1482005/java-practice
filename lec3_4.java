import java.util.Scanner;

public class lec3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int calci = sc.nextInt();

        switch (calci) {
            case 1:
                System.out.println("Addition is : " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction is : " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication is : " + (a * b));
                break;
            case 4:
                System.out.println("Modulo is : " + (a % b));
                break;
            default:
                System.out.println("Invalid");

        }

    }
}
