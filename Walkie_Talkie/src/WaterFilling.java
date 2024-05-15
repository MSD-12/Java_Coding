import java.util.Scanner;

public class WaterFilling {
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            Scanner sc=new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- >0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                    System.out.println((a+b+c)<2?"Water filling time":"Not now");

sc.close();
            }
        } catch(Exception e) {
        }

    }

}
