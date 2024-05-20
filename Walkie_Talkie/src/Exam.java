import java.util.Scanner;

public class Exam {
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            Scanner sc=new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- >0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();

                if (1<=x && x<=5 && 1<=y && y<=50 && 0<=z && z<=(x*y)) {
                  double noStudent = x*y;
                  double result = z/noStudent * 100;
                    if (result > 50)
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
