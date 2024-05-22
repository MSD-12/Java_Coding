import java.util.Scanner;

public class CredCoins {
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            Scanner sc=new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- >0){
                int points = sc.nextInt();
                int noOfTxn = sc.nextInt();
                if (1<=points && points <=1000 && 1<=noOfTxn && noOfTxn <=1000) {

                        System.out.println((points*noOfTxn)/100);

                }
                else
                    System.out.println("NO");
            }
        } catch(Exception e) {
        }
    }

}
