package exampl;

public class Tai {
    static int Fm = 1;
    static int Sm = 1;
    static int Tm = 1;
    static int Lm = 1;
    static int countch = 1;
    static int hi = 1;
    static int by = 1;

    public static int TAI(Integer[][] a) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Fm == 1) {
                    if (a[1][1] == null) {
                        a[1][1] = 7;
                        Fm++;
                        break;
                    } else if (a[1][1] != null) {
                        a[2][2] = 7;
                        Fm++;
                        break;
                    }
                }
                if (Sm == 1) {
                    for (int m = 0; m < 3; m++) {
                        for (int n = 0; n < 3; n++) {
                            countch++;
                            try {
                                if (a[m][n] == null) {
                                    a[m][n] = 9;
                                    int dil = checkwinner.check(a);
                                    if (dil == 1) {
                                        Sm++;
                                        a[m][n] = 7;
                                        countch = 1;
                                        break;
                                    } else {
                                        a[m][n] = null;
                                    }
                                }
                                if (countch == 10) {
                                    Sm++;
                                    break;
                                }
                            } catch (Exception e) {
                            }
                        }
                        if (Sm == 2) {
                            break;
                        }
                    }
                    if (Sm == 2) {
                        break;
                    }
                }
                if (Tm == 1 && Sm != 1) {
                    for (int m = 0; m < 3; m++) {
                        for (int n = 0; n < 3; n++) {
                            countch++;
                            try {
                                if (hi < 11) {

                                    if (a[m][n] == null) {
                                        a[m][n] = 7;
                                        int che = checkwinner.check(a);
                                        if (che == 1) {
                                            Tm++;
                                            break;
                                        } else {
                                            a[m][n] = null;
                                        }
                                    }
                                    hi++;
                                } else {
                                    if (a[m][n] == null) {
                                        a[m][n] = 9;
                                        int opp = checkwinner.check(a);
                                        if (opp == 1) {
                                            a[m][n] = 7;
                                            Tm++;
                                            break;
                                        } else {
                                            a[m][n] = null;
                                        }
                                    }
                                }
                                if (countch == 19) {
                                    countch = 10;
                                    Tm++;
                                    break;
                                }

                            } catch (Exception e) {

                            }
                        }
                        if (Tm == 2) {
                            break;
                        }
                    }
                    if (Tm == 2) {
                        break;
                    }
                }
                if (Lm == 1 && Sm != 1 && Tm != 1) {
                    for (int m = 0; m < 3; m++) {
                        for (int n = 0; n < 3; n++) {
                            countch++;
                            try {
                                if (by < 11) {

                                    if (a[m][n] == null) {
                                        a[m][n] = 7;
                                        int che = checkwinner.check(a);
                                        if (che == 1) {
                                            Lm++;
                                            break;
                                        } else {
                                            a[m][n] = null;
                                        }
                                    }
                                    by++;
                                } else {
                                    if (a[m][n] == null) {
                                        a[m][n] = 9;
                                        int opp = checkwinner.check(a);
                                        if (opp == 1) {
                                            a[m][n] = 7;
                                            Lm++;
                                            break;
                                        } else {
                                            a[m][n] = null;
                                        }
                                    }
                                }
                                if (countch == 19) {
                                    countch = 10;
                                    Lm++;
                                    break;
                                }

                            } catch (Exception e) {

                            }
                        }
                        if (Lm == 2) {
                            break;
                        }
                    }
                }
            }
            break;
        }
        if (countch == 10) {
            for (int m = 0; m < 3; m++) {
                for (int n = 0; n < 3; n++) {
                    if (a[m][n] == null) {
                        a[m][n] = 7;
                        countch = 1;
                        break;
                    }
                }
                if (countch == 1) {
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("AI' Move");
        return 1;
    }
}
