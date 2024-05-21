import java.util.Scanner;

public class FindingShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int noOfFriends = sc.nextInt();
            int leftShoes = sc.nextInt();
            if (leftShoes >= noOfFriends)
                System.out.println(noOfFriends);
            else
                System.out.println((noOfFriends-leftShoes)+ noOfFriends);
        }
        sc.close();
    }

}
