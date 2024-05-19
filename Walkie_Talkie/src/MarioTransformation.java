import java.util.Scanner;

public class MarioTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int mushroom = sc.nextInt();

            switch (mushroom%3) {
                case 0:
                    System.out.println("NORMAL");
                    break;
                case 1:
                    System.out.println("HUGE");
                    break;
                case 2:
                    System.out.println("SMALL");
            }
        }
        sc.close();
    }
}
