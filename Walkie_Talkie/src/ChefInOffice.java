import java.util.Scanner;

public class ChefInOffice {

    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            Scanner sc=new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- >0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                //2≤X≤12
                //1≤Y<X1≤Y<X

                if (2 <= x && x <= 12 && 1 <= y && y <= x ) {

                    x *=  4;
                        System.out.println(x+y);
                }
                else
                    System.out.println("Not valid");
            }
        } catch(Exception e) {
        }
    }
}
