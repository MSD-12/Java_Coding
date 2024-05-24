import java.util.Scanner;

public class BusSeatNumbering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int seatNumber = sc.nextInt();

            if(seatNumber>=1 && seatNumber<=10)
            System.out.println("Lower Double");
            else if (seatNumber>=11 && seatNumber<=15)
                System.out.println("Lower Single");
            else if (seatNumber>=16 && seatNumber<=25)
                System.out.println("Upper Double");
            else if (seatNumber>=26 && seatNumber<=30)
                System.out.println("Upper Single");

        }



        sc.close();
    }
}
