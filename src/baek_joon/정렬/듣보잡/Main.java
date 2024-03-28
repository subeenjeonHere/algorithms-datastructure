package baek_joon.정렬.듣보잡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//자료구조 활용
//asc 정렬

/**
 * @Point MergeSort
 */
public class Main {
    static int n, m;
    static ArrayList<String> list;
    static ArrayList<String> res;

    public static void main(String[] args) throws IOException {
        //사람수 N, 듣보사람수 M
        //둘째 줄부터 N개 줄 듣지못한 사람 이름
        //N+2개 줄 보도 못한 사람
        //이름은 소문자, 길이 20이하
        //듣보잡 수와 그 명단 사전순 출력
        //N, N+2개 줄에 둘 다 포함되는 --> 듣보잡

        //m번째 인덱스부터 n에 포함되어있는 값이라면 듣보잡 StringBuilder or 리스트에 추가
        //오름차순정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        int sum = n + m;

        list = new ArrayList<>();
        res = new ArrayList<>();
        String[] arr = new String[sum];


        for (int i = 1; i <= sum; i++) {
            String s = br.readLine();
            if (i <= n) {
                list.add(s);
            }
            if (i >= m) {
                if (list.contains(s)) {
                    res.add(s);
                }
            }
        }

        //Merge sort
        mergeSort(res);

        StringBuilder sb = new StringBuilder();
        sb.append(res.size()).append("\n");
        for (String ele : res) {
            sb.append(ele).append("\n");
        }
        System.out.print(sb.toString().trim());
    }

    private static ArrayList<String> mergeSort(ArrayList<String> res) {
        //사이즈 1이하이면 종료
        if (res.size() <= 1) {
            return res;
        }
        ArrayList<String> left, right;
        left = new ArrayList<>();
        right = new ArrayList<>();
        for (int i = 0; i < res.size(); i++) {
            if (i % 2 != 0) {
                left.add(res.get(i));
            } else {
                right.add(res.get(i));
            }
        }
        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static ArrayList<String> merge(ArrayList<String> left, ArrayList<String> right) {
        ArrayList<String> ret = new ArrayList<>();
        while (!left.isEmpty() && !right.isEmpty()) {
            int as1 = left.get(0).charAt(0);
            int as2 = right.get(0).charAt(0);
            if (as1 <= as2) {
//            if (left.get(0) <= right.get(0)) {
                ret.add(left.get(0));
                left.remove(0);
            } else {
                ret.add(right.get(0));
                right.remove(0);
            }
        }
        while (!left.isEmpty()) {
            ret.add(left.get(0));
            left.remove(0);
        }
        while (!right.isEmpty()) {
            ret.add(right.get(0));
            right.remove(0);
        }
        return ret;
    }
}
//3 4
//ohhenrie
//        charlie
//baesangwook
//        obama
//baesangwook
//        ohhenrie
//clinton
