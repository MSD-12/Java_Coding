import java.util.Scanner;

public class BathInWinters {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {

                int geyserCapacity = sc.nextInt();
                int bucketCapacity = sc.nextInt();
                System.out.println(geyserCapacity/(bucketCapacity*2));
            }
            sc.close();
        }

}
