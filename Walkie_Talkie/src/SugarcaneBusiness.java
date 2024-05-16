import java.util.Scanner;

public class SugarcaneBusiness {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int costOfOneGlass = 50;
            int numberOfGlass = sc.nextInt();
            int revenue = costOfOneGlass * numberOfGlass;
            int profit = revenue / 10;

                System.out.println(profit*3);

        }
        sc.close();

    }
}
