import java.util.Scanner;

public class PoliceAndTheif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int police = sc.nextInt();
            int theif = sc.nextInt();
                System.out.println(Math.abs(theif-police));
        }
        sc.close();
    }
}
