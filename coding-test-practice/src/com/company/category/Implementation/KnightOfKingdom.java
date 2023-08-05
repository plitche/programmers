package com.company.category.Implementation;

// 왕실의 나이트
// 왕실 정원은 8x8 좌표 평면
// 특정 한칸에 나이트가 서 있다.
// 말을 타고 있기 때문에 이동을 할 때는 L자형태로만 이동 가능하다.
// 특정 위치에서 2가지 경우로 이동할 수 있다.
// 1. 수평으로 두 칸 이동한 뒤에 수직으로 한 칸 이동하기
// 2. 수직으로 두 칸 이동한 뒤에 수평으로 한 칸 이동하기

// 나이트의 위치가 주어졌을때 나이트가 이동할 수 있는 경우의 수 출력

import javax.script.ScriptContext;
import java.util.Scanner;

/**
 *   a b c d e f . . .
 *  1-       -
 *  2    *
 *  3-       -
 *  4  -   -
 *  .
 *  .
 *  .
 *  c2에 나이트가 있는 경우 6가지
 */
public class KnightOfKingdom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String position = sc.nextLine();

        // -2 -2 ~ +2 +2
        // -2-1 / -2+1 / +2-1 / +2+1
        // -1-2 / +1-2 / -1+2 / +1+2
        int x = position.charAt(0) - 'a' + 1;
        int y = position.charAt(1) - '1' + 1;

        int[] xArr = {-2, -2, +2, +2, -1, +1, -1 ,+1};
        int[] yArr = {-1, +1, -1 ,+1, -2, -2, +2, +2};

        int count = 0;
        for (int i=0; i<8; i++) {
            if (check(x + xArr[i], y + yArr[i])) count++;
        }

        System.out.println("count = " + count);
    }

    public static boolean check(int i, int j) {
        if (i > 0 && i < 9 && j > 0 && j < 9)
            return true;
        return false;
    }
}

class KnightOfKingdomSolution {

    public static void main(String[] args) {
        // 내 풀이법과 동일
    }

}
