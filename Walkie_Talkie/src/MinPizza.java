import java.util.Scanner;

public class MinPizza {
    public static void main(String[] args) throws java.lang.Exception
    {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int x = sc.nextInt();
                if (1 <= x && x <= 10 && 1 <= n && n <= 10) {
                        System.out.println((int)Math.ceil((double) (n*x)/4));

                }
            }

            sc.close();
        }
        catch (Exception e) {}

    }

}
