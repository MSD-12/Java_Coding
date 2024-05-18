import java.util.Scanner;

public class NearestExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int seatNo = sc.nextInt();
            if(seatNo<51 && seatNo>0)
                System.out.println("Left");
            else
            System.out.println("Right");
        }
        sc.close();

    }

}
