import java.util.Scanner;

public class Mahasena {
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            Scanner sc=new Scanner(System.in);
            int numberOfSoldier = sc.nextInt();
            if (1 <= numberOfSoldier && numberOfSoldier <= 100) {
                int [] noOfWeapon = new int [numberOfSoldier];
                int even = 0, odd=0;
                for (int i = 0; i<numberOfSoldier; i++){
                    noOfWeapon[i] = sc.nextInt();
                    if (noOfWeapon[i]%2 == 0)
                        even += 1;
                     else
                        odd += 1;

                }
                if(even>odd)
                    System.out.println("READY FOR BATTLE");
                else
                    System.out.println("NOT READY");
            }
            else
                System.out.println("soldier is not available");
        } catch(Exception e) {
        }
    }

}
