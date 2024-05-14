import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter any Character");
        String symbol = sc.next();

        for (int i = 0; i < 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            for (int j = 5; j > 0; j--)
                System.out.print(symbol);
            System.out.println();
        }
    }
}
