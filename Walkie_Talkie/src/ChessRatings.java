import java.util.Scanner;

public class ChessRatings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int currentRating = sc.nextInt();
            int reqRating = sc.nextInt();

            if(currentRating == reqRating || currentRating > reqRating)
                System.out.println(0);
            else
                System.out.println((reqRating - currentRating)%8==0?(reqRating - currentRating)/8:((reqRating - currentRating)/8)+1);
        }
        sc.close();
    }

}
