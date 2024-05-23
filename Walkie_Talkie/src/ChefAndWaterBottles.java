import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChefAndWaterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int noOfBottle = sc.nextInt();
            int capacity = sc.nextInt();
            int tankCapacity = sc.nextInt();

            if(noOfBottle * capacity > tankCapacity)
                System.out.println(tankCapacity / capacity);
            else if (noOfBottle * capacity < tankCapacity)
                System.out.println(noOfBottle);
            else
                System.out.println(noOfBottle);
        }
        sc.close();
    }

}
