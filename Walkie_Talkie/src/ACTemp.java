    import java.util.Scanner;

    public class ACTemp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int Alice = sc.nextInt(), Bob = sc.nextInt(), Charlie = sc.nextInt();
                if(Alice<Bob && Bob > Charlie)
                System.out.println("YES");
                else
                    System.out.println("NO");
            }
            sc.close();

        }
    }
