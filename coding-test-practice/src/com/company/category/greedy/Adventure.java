package com.company.category.greedy;

// 한 마을에 모험가가 N명 있다.
// '공포도'가 높은 모험가는 쉽게 공포를 느껴 제대로 상황 대처를 하지 못한다.
// 모험가 그룹을 안전하게 구성하고자 공포도가 X인 모험가는 반드시 X명 이상으로 구헝한 모험가 그룹에 참여
// ~~는 최대 몇 개의 모험가 그룹을 만들 수 있느냐.

// N : 5, 공포도 : [2, 3, 1, 2, 2]
// [1, 2, 3], [2, 2]


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Adventure {

    public static void main(String[] args) {
        int n = 5;
        int[] fear = {2, 3, 1, 2, 2};
        int group = 0;

        Arrays.sort(fear);

        int count = 1;
        for (int i : fear) {
            if (i == count) {
                group++;
                count = 1;
            } else {
                count++;
            }
        }

        System.out.println("group = " + group);
    }

}

class AdventureSolution {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);

        Collections.sort(list);

        int result = 0;
        int count = 0;
        for (Integer i : list) {
            count += 1;
            if (count >= i) {
                result += 1;
                count = 0;
            }
        }

        System.out.println("result = " + result);
    }

}
