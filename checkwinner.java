package exampl;

public class checkwinner {
    public static int check(Integer[][] tic) {
        if ((tic[0][0] == tic[0][1] && tic[0][0] == tic[0][2]) && tic[0][0] != null) {
            return 1;
        } else if (tic[1][0] == tic[1][1] && tic[1][0] == tic[1][2] && tic[1][0] != null) {
            return 1;
        } else if (tic[2][0] == tic[2][1] && tic[2][0] == tic[2][2] && tic[2][0] != null) {
            return 1;
        } else if (tic[0][0] == tic[1][0] && tic[0][0] == tic[2][0] && tic[2][0] != null) {
            return 1;
        } else if (tic[0][1] == tic[1][1] && tic[0][1] == tic[2][1] && tic[0][1] != null) {
            return 1;
        } else if (tic[0][2] == tic[1][2] && tic[0][2] == tic[2][2] && tic[0][2] != null) {
            return 1;
        } else if (tic[0][0] == tic[1][1] && tic[0][0] == tic[2][2] && tic[2][2] != null) {
            return 1;
        } else if (tic[0][2] == tic[1][1] && tic[0][2] == tic[2][0] && tic[2][0] != null) {
            return 1;
        } else {
            return 0;
        }
    }
}
