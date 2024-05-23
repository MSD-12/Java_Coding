import java.util.Scanner;

public class ChefAndNextGen {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int unitsNeedToGenerate = sc.nextInt();
            int forNumberOfYear = sc.nextInt();
            int amountOfHeliumOnMoon = sc.nextInt();
            int unitCanGenerateFrom1Gram = sc.nextInt();

            int needToSupply = unitsNeedToGenerate * forNumberOfYear ;
            int moonHaveTotalUnits = amountOfHeliumOnMoon * unitCanGenerateFrom1Gram ;

            if (moonHaveTotalUnits>=needToSupply)
                System.out.println("Yes");
            else
                System.out.println("NO");

        }
        sc.close();

    }
}
