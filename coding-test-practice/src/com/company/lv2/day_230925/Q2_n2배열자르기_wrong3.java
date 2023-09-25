package com.company.lv2.day_230925;

// https://school.programmers.co.kr/learn/courses/30/lessons/87946
public class Q2_n2배열자르기_wrong3 {

//    private static int n = 4;
//    private static long left = 0;
//    private static long right = 7;

    private static int n = 3;
    private static long left = 3;
    private static long right = 5;

    static StringBuilder sb = new StringBuilder();
    // 123 223 333
    //   3 223
    public static void main(String[] args) {
        int[] answer = new int[(int)(right - left + 1)];
        String[] strings = new String[n];

        StringBuilder temp = new StringBuilder();
        for (int i=1; i<=n; i++) {
            temp.append(i);
        }
        String s = temp.toString();
        strings[0] = s;

        for (int i=1; i<n; i++) {
            s = s.replace(String.valueOf(i), String.valueOf(i+1));
            strings[i] = s;
        }

        int startLine = (int)(left/n);
        int endLine = (int)(right/n);
        int length = ((endLine - startLine) * n) +1;

        for (int i=startLine; i<endLine+1; i++) {
            String string = strings[i];
            sb.append(string);
        }

        String substring = sb.substring((int)(left%n), (int)(right % n + length));
        for (int i=0; i<substring.length(); i++) {
            answer[i] = substring.charAt(i) - '0';
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
