package baek_joon.class_2.나이순정렬;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[][] arr = new String[n][2];

        int rows = arr.length;
        int cols = arr[0].length;
        //배열 저장
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = String.valueOf(sc.next());
            }
        }
        /**
         * @Note 2차원 배열 ArrayList에 저장
         */
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        for (String[] row : arr) {
            //각 행을 나타내는 ArrayList<String>을 데이터 추가
            ArrayList<String> rowData = new ArrayList<>(Arrays.asList(row));
            arrayList.add(rowData);
        }
        // 추가: 가입일 Idx
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).add(String.valueOf(i));
        }

        // 정렬 나이순, 나이 같으면 가입순
        // 나이가 같다면, idx를 보고 판단
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                int age1 = Integer.parseInt(arrayList.get(i).get(0));
                int age2 = Integer.parseInt(arrayList.get(j).get(0));
                int idx1 = Integer.parseInt(arrayList.get(i).get(2));
                int idx2 = Integer.parseInt(arrayList.get(j).get(2));

//                System.out.println("get(i): " + arrayList.get(i));
//                System.out.println("get(2): " + arrayList.get(i).get(2));

                //나이 순 오름차순 정렬
                if ((age1 == age2 && idx1 > idx2) || age1 > age2) {
                    //Swap
//                    ArrayList<String> temp = new ArrayList<>(arrayList.get(i));
//                    arrayList.set(i, new ArrayList<>(arrayList.get(j)));
//                    arrayList.set(j, new ArrayList<>(temp));
                    Collections.swap(arrayList, i, j);
                }
            }
        }

        for (ArrayList<String> row : arrayList) {
            row.remove(2);
        }
        StringBuilder sb = new StringBuilder();
        for (int p = 0; p < arrayList.size(); p++) {
            for (int q = 0; q < arrayList.get(p).size(); q++) {
                sb.append(arrayList.get(p).get(q)).append(" ");
            }

            sb.append("\n");
        }
        System.out.print(sb.toString().trim());
    }
}
