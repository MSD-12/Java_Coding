import java.util.Scanner;

public class ChefLandGames {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result = 0;
        while (t-- > 0) {
            result = 0;
            int x[] = new int[4];
            for (int i = 0; i < 4; i++) {
                x[i] = sc.nextInt();
                result += x[i];
            }
            if (result != 0)
                System.out.println("OUT");
            else
                System.out.println("IN");

        }
        sc.close();

    }
}
