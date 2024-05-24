import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int numberOfCandies = sc.nextInt();
            int numberFriends = sc.nextInt();

            if((numberOfCandies%numberFriends)==0 && (numberOfCandies/numberFriends)%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }

}
