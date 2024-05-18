import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int originalNumber = sc.nextInt();
            int reverseNumber = 0;
            while (originalNumber != 0){
                int lastNum = originalNumber%10;
//                System.out.println(" %   "+lastNum);
                reverseNumber = (reverseNumber * 10) + lastNum;
                originalNumber = originalNumber/10;
//                System.out.println("/  "+originalNumber);
            }
            System.out.println(reverseNumber);
        }
        sc.close();
    }
}
