package exampl;

import java.util.*;

public class Human {
    public static int hum(Integer[][] tic) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int ask = sc.nextInt();
        System.out.println("Enter the coloumn number:");
        int bsk = sc.nextInt();
        ask--;
        bsk--;
        System.out.println("Enter Symbol");
        char dep = sc.next().charAt(0);
        if (dep == 'x' || dep == 'X') {
            tic[ask][bsk] = 9;
        } else if (dep == 'o' || dep == 'O') {
            tic[ask][bsk] = 7;
        }
        return 1;
    }
}
