package programmers.lv0.짝수싫어;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 15;
        String str = "";
        /**
         * n 이하의 홀수 배열에 오름차순 정렬
         */
        int start = 1;
        int cnt = 0;
        int[] arr = new int[n / 2 + 1];
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (start <= n) {
            int idx = 0;
            if (start % 2 == 0) {
            } else {
                arrayList.add(start);
            }
            start++;
        }

        arrayList.stream().mapToInt(x -> x).toArray();
        System.out.println(arrayList);
        int st = 0;
        while (st < arrayList.size()) {
            if (arrayList.get(st) >= 5) {

                arrayList.remove(st);

            }
            st++;
        }
        System.out.println(arrayList);
    }
}
