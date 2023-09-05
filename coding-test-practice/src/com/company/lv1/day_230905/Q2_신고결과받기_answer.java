package com.company.lv1.day_230905;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// https://school.programmers.co.kr/learn/courses/30/lessons/92334
class User{
    String name;
    HashSet<String> reportList;
    HashSet<String> reportedList;
    public User(String name){
        this.name = name;
        reportList = new HashSet<>();
        reportedList = new HashSet<>();
    }
}

public class Q2_신고결과받기_answer {

//    private static String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//    private static String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//    private static int k = 2;

    private static String[] id_list = {"con", "ryan"};
    private static String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
    private static int k = 3;

    public static void main(String[] args) {
        int[] answer = new int[id_list.length];
        ArrayList<User> users = new ArrayList<>();
        HashMap<String,Integer> suspendedList = new HashMap<>(); //<이름>
        HashMap<String,Integer> idIdx = new HashMap<String,Integer>(); // <이름, 해당 이름의 User 클래스 idx>
        int idx = 0;

        for(String name : id_list) {
            idIdx.put(name,idx++);
            users.add(new User(name));
        }

        for(String re : report){
            String[] str = re.split(" ");
            //suspendedCount.put(str[0], suspendedCount.getOrDefault(str[0],0)+1);
            users.get( idIdx.get(str[0])).reportList.add(str[1]);
            users.get( idIdx.get(str[1])).reportedList.add(str[0]);
        }

        for(User user : users){
            if(user.reportedList.size() >= k)
                suspendedList.put(user.name,1);
        }

        for(User user : users){
            for(String nameReport : user.reportList){
                if(suspendedList.get(nameReport) != null){
                    answer[idIdx.get(user.name)]++;
                }

            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
