import java.util.Scanner;

public class ElectionInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int count = 0;
            int noOfPeople = sc.nextInt();
            int reqAge = sc.nextInt();
            int age[] = new int[noOfPeople];
            for (int i = 0; i < noOfPeople; i++) {
                age[i] = sc.nextInt();
                if (age[i] >= reqAge)
                    count += 1;

            }
                System.out.println(count);

        }

        sc.close();
    }
}
