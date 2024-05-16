import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int noOfQuestion = sc.nextInt();
            int ansCorrect = sc.nextInt();
            int passingMarks = sc.nextInt();

            System.out.println(((ansCorrect * 3)- (noOfQuestion -ansCorrect) >= passingMarks)?"PASS":"FAIL");

        }
        sc.close();
    }
}
