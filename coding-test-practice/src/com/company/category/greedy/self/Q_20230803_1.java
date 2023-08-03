package com.company.category.greedy.self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * author         : yskwon
 * date           : 2023-08-03
 * title          :
 * Level          :
 * isSolved       :
 * url            :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-03        yskwon       최초 생성
 */
class Action {
    private String name;
    private Integer startTime;
    private Integer endTime;

    public Action(String name, Integer startTime, Integer endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
}

public class Q_20230803_1 {


    // 활동 선택(Action Selection) 문제
    // N개의 활동이 있고 각 활동에는 시작 시간 및 종료 시간이 있을 때, 한 사람이 최대한 많이 할 수 있는 활동(Activity)의 수를 구하는 문제

    /**
     *  활동이름 A B C D E F
     *  시작시간 7 5 3 1 6 10
     *  종료시간 8 7 6 2 9 11
     */
    public static void main(String[] args) {

        ArrayList<Action> list = new ArrayList<>();
        list.add(new Action("A", 7, 8));
        list.add(new Action("B", 5, 7));
        list.add(new Action("C", 3, 6));
        list.add(new Action("D", 1, 2));
        list.add(new Action("E", 6, 9));
        list.add(new Action("F", 10, 11));

        // List 정렬 1
        /*
        Collections.sort(list, new Comparator<Action>() {
            @Override
            public int compare(Action o1, Action o2) {
                return o1.getEndTime() - o2.getEndTime();
            }
        });
        */

        // List 정렬 2
        /*
        Collections.sort(list, ((o1, o2) -> {
            return o1.getEndTime() - o2.getEndTime();
        }));
        */

        // List 정렬 3
        Collections.sort(list, (o1, o2) -> o1.getEndTime() - o2.getEndTime());
        List<Action> result = new ArrayList<>();
        result.add(list.get(0));

        for (int i=1; i<list.size(); i++) {
            if (result.get(result.size()-1).getEndTime() <= list.get(i).getStartTime()) {
                result.add(list.get(i));
            }
        }

//        for (Action action : result) System.out.print(action.getName() + " ");
        System.out.println(result.stream().map(m -> m.getName()).collect(Collectors.joining(" -> ")));
    }
}
