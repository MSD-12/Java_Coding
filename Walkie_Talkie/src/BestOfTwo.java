import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            Integer A[] = new Integer[3];
            Integer B[] = new Integer[3];

            for (int i = 0; i < 3; i++)
                A[i] = sc.nextInt();

            for (int i = 0; i < 3; i++)
                B[i] = sc.nextInt();

            Arrays.sort(A,Collections.reverseOrder());
            Arrays.sort(B, Collections.reverseOrder());
            if ((A[0]+A[1]) == (B[0]+B[1]))
                System.out.println("Tie");
            else if ((A[0]+A[1]) > (B[0]+B[1]))
                System.out.println("Alice");
            else
                System.out.println("Bob");
        }
        sc.close();
    }
}
