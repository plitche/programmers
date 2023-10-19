package com.company.lv2.day_231019;

public class Q1_숫자카드나누기 {

//    private static int[] arrayA = {10, 17};
//    private static int[] arrayB = {5, 20};

//    private static int[] arrayA = {10, 20};
//    private static int[] arrayB = {5, 17};

    private static int[] arrayA = {14, 35, 119};
    private static int[] arrayB = {18, 30, 102};

    public static void main(String[] args) {
        int share1 = share(arrayA, arrayB);
        int share2 = share(arrayB, arrayA);

        System.out.println("answer = " + (share1 > share2 ? share1 : share2));
    }

    public static int share(int[] arrayA, int[] arrayB) {
        int share = 0;

        for (int i=arrayA[0]; i>1; i--) {
            boolean isAll = true;

            for (int j=0; j<arrayA.length; j++) {
                if (arrayA[j]%i != 0) {
                    isAll = false;
                    break;
                }
            }

            if (isAll) {
                share = i;

                if (divide(share, arrayB)) {
                    break;
                } else {
                    share = 0;
                }
            }
        }

        return share;
    }

    public static boolean divide(int share, int[] arrayB) {
        if (share == 0) return false;

        for (int i : arrayB) {
            if (i%share == 0) {
                return false;
            }
        }

        return true;
    }
}
