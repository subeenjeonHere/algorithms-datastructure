package Algorithms.countingSort;

public class CountingSort {
    public static void main(String[] args) {
        int[] data = {3, 5, 1, 4, 1, 2, 2, 3, 4, 7};
        int[] cnt = new int[10];

        System.out.println("계수정렬 값");

        for (int i = 0; i < 10; i++) {
            System.out.printf(data[i] + " ");
        }
        System.out.println("\n\n 정렬 전 cnt의 값");

        for (int i = 0; i < 10; i++) {
            System.out.printf(cnt[i] + " ");
        }

        // ref. 데이터의 각 방을 지나가며, 데이터가 갖고있는 값을 idx로 하는 cnt의 값을 1씩 증가시킴
        for (int i = 0; i < 10; i++) {
            cnt[data[i]]++;
        }
        System.out.println("\n\n 정렬 후 cnt의 값");

        //계수정렬된 값
        for (int i = 0; i < 10; i++) {
            System.out.printf(cnt[i] + " ");
        }
        System.out.println("\n\n 계수정렬된 값");


        for (int i = 0; i < 10; i++) {
            if (cnt[i] != 0) {
                int j = 0;
                // NB
                while (j < cnt[i]) {
                    // ref. cnt 배열의 첨자를 출력
                    // e.g. cnt 2번째 배열에는 1이 2번나왔으면 2번 출력하는 건데, i=2가 됨 b/c i=는 index 이므로
                    System.out.printf(i + " ");
                    j++;
                }
            }
        }

    }
}
