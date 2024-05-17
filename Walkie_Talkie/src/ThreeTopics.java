import java.util.Scanner;

public class ThreeTopics {

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            if(a>=1 && a<=10 && b>=1 && b<=10 && c>=1 && c<=10 && x>=1 && x<=10 ) {

                if (a == x || b == x || c == x)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
                System.out.println("NO");


        sc.close();

    }
}
