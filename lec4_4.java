import java.util.Scanner;
public class lec4_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 0;
        while(i<=n){
            if (i % 2 == 0) {
            System.out.println(i);
           }
           i++;
        }
    }
}
