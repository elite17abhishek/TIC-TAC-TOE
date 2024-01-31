package exampl;

import java.util.*;

class tictactoe {
    public static void main(String[] args) {
        Integer[][] tic = new Integer[3][3];
        String[][] view = new String[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Two Players");
        System.out.println("2: Easy AI");
        System.out.println("3: Hard AI");
        int let = sc.nextInt();
        int u = 1;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            int k = 0;
            for (int j = 0; j < 3; j++) {
                if (let == 1) {
                    Human.hum(tic);
                } else {
                    if (count % 2 == 0) {

                        System.out.println("Enter the row number: ");
                        int ask = sc.nextInt();
                        System.out.println("Enter the coloumn number:");
                        int bsk = sc.nextInt();
                        ask--;
                        bsk--;
                        tic[ask][bsk] = 9;
                        count++;

                    } else if (let == 3) {
                        Tai.TAI(tic);
                        count++;
                    } else {
                        AI.Ai(tic);
                        count++;
                    }
                }
                int c = 0;
                try {

                    if ((tic[0][0] == tic[0][1] && tic[0][0] == tic[0][2]) && tic[0][0] != null) {
                        System.out.println(tic[0][0] + "Wins");
                        c++;
                    } else if (tic[1][0] == tic[1][1] && tic[1][0] == tic[1][2] && tic[1][0] != null) {
                        System.out.println("Wins");
                        c++;

                    } else if (tic[2][0] == tic[2][1] && tic[2][0] == tic[2][2] && tic[2][0] != null) {
                        System.out.println("Wins");
                        c++;

                    } else if (tic[0][0] == tic[1][0] && tic[0][0] == tic[2][0] && tic[2][0] != null) {
                        System.out.println("Wins");
                        c++;

                    } else if (tic[0][1] == tic[1][1] && tic[0][1] == tic[2][1] && tic[0][1] != null) {
                        System.out.println("Wins");
                        c++;

                    } else if (tic[0][2] == tic[1][2] && tic[0][2] == tic[2][2] && tic[0][2] != null) {
                        System.out.println("Wins");
                        c++;

                    } else if (tic[0][0] == tic[1][1] && tic[0][0] == tic[2][2] && tic[2][2] != null) {
                        System.out.println("Wins");
                        c++;

                    } else if (tic[0][2] == tic[1][1] && tic[0][2] == tic[2][0] && tic[2][0] != null) {
                        System.out.println("Wins");
                        c++;

                    }
                } catch (Exception e) {
                }
                for (int q = 0; q < 3; q++) {
                    for (int z = 0; z < 3; z++) {
                        if (tic[q][z] == null) {
                            view[q][z] = " ";
                        } else if (tic[q][z] == 9) {
                            view[q][z] = "x";
                        } else if (tic[q][z] == 7) {
                            view[q][z] = "O";
                        }
                        System.out.print(view[q][z] + " | ");
                        if (view[q][z] == " ") {
                            tic[q][z] = null;
                        }
                    }
                    System.out.println();
                    System.out.println("-----------");
                }
                if (c == 1) {
                    k++;
                    break;
                }
            }
            u++;
            if (k == 1) {
                break;
            }
            if (u > 3) {
                System.out.println("DRAW");
            }
        }
    }
}
