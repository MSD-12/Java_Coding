import java.util.Scanner;

public class ChefAndCandies {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int noOfChildren = sc.nextInt();
            int noOfChoclateHave= sc.nextInt();
            if(noOfChildren<=noOfChoclateHave)
            System.out.println(0);
            else
                System.out.println(((noOfChildren-noOfChoclateHave)+3)/4);

        }
        sc.close();

    }
}
