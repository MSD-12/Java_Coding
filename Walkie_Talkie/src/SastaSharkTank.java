import java.util.Scanner;

public class SastaSharkTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b > (a*2) )
                System.out.println("Second");
            else if (b<(a*2)) {
                System.out.println("First");
            }
            else
                System.out.println("ANY");
            }

        sc.close();
    }
}
