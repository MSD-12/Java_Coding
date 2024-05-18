import java.util.Scanner;

public class MiniCarRequired {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int noOfPeople = sc.nextInt();

            System.out.println((noOfPeople + 3) / 4);

        }

        sc.close();
    }
}
