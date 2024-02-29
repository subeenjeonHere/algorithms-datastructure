package baek_joon.class_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class 수정렬하기4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }


        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i)).append("\n");

        }
        System.out.println(sb.toString().trim());
//        for (int ele : arrayList) {
//            sb.append(ele).append("\n");
//        }
//        System.out.println(sb.toString().trim());
    }
}
