import java.util.Scanner;

public class IsScoreConsistent {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x1 = sc.nextInt();
            int y1= sc.nextInt();
            int x2 = sc.nextInt();
            int y2= sc.nextInt();
            if(x2<x1 || y2<y1)
                System.out.println("IMPOSSIBLE");
            else
                System.out.println("POSSIBLE");

        }
        sc.close();

    }
}
