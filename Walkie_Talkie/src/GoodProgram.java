import java.util.Scanner;

public class GoodProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            if (a%4 == 0 )
                System.out.println("Good");
            else
                System.out.println("Not Good");

        }

        sc.close();
    }
}
