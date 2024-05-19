import java.util.Scanner;

public class MaximiseTheTastiness {
    static int getMaxScore(int x, int y){
        if (x > y)
            return x;
        else if (y > x)
            return y;
        else
            return x;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int max = getMaxScore(a, b) + getMaxScore(c, d);
            System.out.println(max);
        }
        sc.close();
    }

}
