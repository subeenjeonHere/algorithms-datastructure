package DataStructure.list.arraylist;

/**
 * @Subject: ArrayList
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = {{3, 7}, {15, 7}, {5, 2}};


        /**
         * @Subject: ArrayList of ArrayList
         */
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        ArrayList<Integer> row2 = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            row1.add(sc.nextInt());
            row2.add(sc.nextInt());
            sc.nextLine();
        }

        arrays.add(row1);
        arrays.add(row2);
        System.out.println(arrays);

        int max = 0;
        for (int i = 0; i < arrays.size(); i++) {
            System.out.println("사이즈: " + arrays.size());

            for (int j = 0; j < arrays.get(i).size(); j++) {

                int element = arrays.get(i).get(j);

                System.out.println(i + " : I줄의  " + j + "  : J번째 " + element);
            }
        }



    }
}
