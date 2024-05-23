import java.util.Scanner;

public class CarAndBike {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int timeTakenByBike = sc.nextInt();
            int timeTakenByCar= sc.nextInt();
            if(timeTakenByBike != timeTakenByCar)
                System.out.println((timeTakenByBike<timeTakenByCar)?"BIKE":"CAR");
            else
                System.out.println("SAME");

        }
        sc.close();

    }
}
