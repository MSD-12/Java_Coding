import java.util.Scanner;

public class WaterMixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int initialTemp = sc.nextInt();
            int desiredTemp = sc.nextInt();
            int hotWater = sc.nextInt();
            int coldWater = sc.nextInt();

            if (initialTemp == desiredTemp)
                System.out.println("YES");
            else if (desiredTemp > initialTemp)
                System.out.println(((desiredTemp - initialTemp) <= hotWater)? "YES" : "NO");
            else
                System.out.println(((initialTemp - desiredTemp) <= coldWater) ? "YES" : "NO");
        }
        sc.close();
    }
}
