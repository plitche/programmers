package com.company.lv1.day_230912;

// https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class Q3_시저암호 {

//    private static String s = "AB";
//    private static int n = 1;

//    private static String s = "a B z";
//    private static int n = 4;

    private static String s = "abcdefghijklmnopqrstuvwxyz";
    private static int n = 1;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') { // 공백이 아닌 경우
                if (c >= 'a' && c <= 'z') { // 소문자일 경우
                    if (c+n > 'z') {
                        c = (char)('a' + (c+n-1) - 'z');
                    } else {
                        c = (char)(c+n);
                    }
                }

                if (c >= 'A' && c <= 'Z') { // 대문자인경우
                    if (c+n > 'Z') {
                        c = (char)('A' + (c+n-1) - 'Z');
                    } else {
                        c = (char)(c+n);
                    }
                }
            }
            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}
