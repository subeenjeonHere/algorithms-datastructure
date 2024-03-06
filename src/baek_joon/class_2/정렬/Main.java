package baek_joon.class_2.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Collections.disjoint;
import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            list.add(s);
        }
        //sort by length
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                String temp;

                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
                String s_1 = list.get(i);
                String s_2 = list.get(j);
                int s1 = s_1.length();
                int s2 = s_2.length();

                //문자열 길이 버블 정렬
                if (s1 > s2) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        //같은 길이면 사전 순 정렬

        StringBuilder sb = new StringBuilder();
        for (String ele : list) {
            sb.append(ele).append("\n");
        }
        System.out.print(sb.toString().trim());
    }

}
