package com.company.lv2.day_231015;

import java.util.Arrays;
import java.util.HashMap;

public class Q1_주차요금계산 {

//    private static int[] fees = {180, 5000, 10, 600};
//    private static String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

//    private static int[] fees = {120, 0, 60, 591};
//    private static String[] records = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};

    private static int[] fees = {1, 461, 1, 10};
    private static String[] records = {"00:00 1234 IN"};

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String record : records) {
            String[] split = record.split(" ");
            int time = Integer.parseInt(split[0].split(":")[0])*60 + Integer.parseInt(split[0].split(":")[1]);
            time = (60*24-1) - time;

            String number = split[1];
            String inOrOut = split[2];

            if (inOrOut.equals("IN")) {
                map.put(number, map.getOrDefault(number, 0) + time);
            } else {
                map.put(number, map.get(number) - time);
            }
        }

        int idx = 0;
        int[] answer = new int[map.size()];
        String[] numbers = new String[map.size()];
        for (String s : map.keySet()) {
            numbers[idx] = s;
            idx++;
        }
        Arrays.sort(numbers);
        
        for (int i=0; i<answer.length; i++) {
            Integer time = map.get(numbers[i]);
            if (time >= fees[0]) {
                answer[i] = fees[1] + ((int) Math.ceil((time-fees[0])/(double)fees[2])) * fees[3];
            } else {
                answer[i] = fees[1];
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
