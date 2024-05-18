import java.util.Scanner;

public class ProblemsInYourToDoList {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int count =0,n = sc.nextInt();

                int noOfQuestion [] = new int[n];
                for (int i = 0; i < n; i++) {
                    noOfQuestion [i] = sc.nextInt();
                    if (noOfQuestion[i] >= 1000 )
                        count++;
                }
                System.out.println(count);



            }
            sc.close();

        }
}
