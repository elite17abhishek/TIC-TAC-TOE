package exampl;

class AI {
    public static int Ai(Integer[][] a) {
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == null) {
                    c++;
                    a[i][j] = 7;
                }
                if (c == 1) {
                    break;
                }
            }
            if (c == 1) {
                break;
            }
        }
        return 1;
    }
}