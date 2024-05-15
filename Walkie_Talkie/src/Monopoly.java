import java.util.Scanner;

public class Monopoly {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();
            if(p>q+r+s || q>r+s+p || r>p+q+s || s>q+r+p)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        sc.close();

    }
}
