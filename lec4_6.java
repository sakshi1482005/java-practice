import java.util.Scanner;

public class lec4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("Enter 1 to enter marks or 0 to exit! ");
            n = sc.nextInt();
            if (n == 1) 
            {
                System.out.println("Enter Students marks :");
                int marks = sc.nextInt();

            if(marks >= 90){
                System.out.println("This is good! ");
            }
            else if(marks >=60) {
                System.out.println("This is also Good");
            }
            else{
                System.out.println("This is Good as well");
            }
            }
        } while (n != 0);

    }

}
