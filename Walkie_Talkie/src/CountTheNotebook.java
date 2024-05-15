import java.util.Scanner;

public class CountTheNotebook {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int rawMateriala = sc.nextInt();
            System.out.println(rawMateriala * 10);

        }
        sc.close();

    }
}
