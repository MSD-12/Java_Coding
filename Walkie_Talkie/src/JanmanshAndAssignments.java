import java.util.Scanner;

public class JanmanshAndAssignments {
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int startTime = sc.nextInt();
            if (1<=startTime && startTime<=9) {
                if (startTime + 3 <= 10)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
                System.out.println("NO");
        }
        } catch(Exception e) {
        }
    }

}
