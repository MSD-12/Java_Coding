import java.util.Scanner;

public class ExpertSetter {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
                int x = sc.nextInt();
            int y = sc.nextInt();
            if (((double)x/2)<= y)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        sc.close();

    }
}
