import java.util.Scanner;

public class DiscusThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println((b<a && c<=a)? a : (a<=b && c<=b)? b: c);
        }
        sc.close();
    }

}
