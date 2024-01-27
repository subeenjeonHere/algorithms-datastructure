package demo.countingSort;


public class CountingSort {
    public static void main(String[] args) {
        int[] data = {3, 5, 1, 4, 1, 2, 2, 3, 4, 7};
        int[] cnt = new int[10];

        System.out.println("계수정렬 값");

        for (int i = 0; i < 10; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println("\n\n 정렬 전 cnt의 값");

        for (int i = 0; i < 10; i++) {
            System.out.println(cnt[i] + " ");
        }

        // 데이터의 각 방을 지나가며, 데이터가 갖고있는 값을 idx로 하는 원소를 증가시키는 것

    }
}
