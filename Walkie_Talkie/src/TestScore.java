import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int noOfProblem = sc.nextInt();
            int marksForEachQuestion = sc.nextInt();
            int scoreReq = sc.nextInt();

            System.out.println((scoreReq % marksForEachQuestion ==0) ? "Yes": "No");

        }

        sc.close();
    }

}
