package Algorithms.recur;

public class ArrayFunction {
    public static void main(String[] args) {
        int arr[] = {0, 80, 60, 40, 20, 100};
        System.out.println(ArraySort(arr, 4));
    }

    public static int ArraySort(int[] a, int n) {

        int x;
        if (n == 1) return a[0];

        else
            x = ArraySort(a, n - 1); // 재귀호출, ArraySort를 다시 호출
        if (x > a[n - 1]) return x;
        else return a[n - 1];
    }
}
/**
 *
 * a는 배열, n-1은 배열의 크기 - 크기가 작아진 배열에 대해 현재 ArraySort를 호출하는 것이 재귀호출
 * n의 값은 1이 될 때까지 감소
 * 1. 초기호출: arr,4에서 n = 4
 * 2. 두 번째 재귀호출: arr,3에서 n = 3
 * 3. 세 번째 재귀호출: arr,2에서 n = 2
 * 4. 네 번째 재귀호출: arr,1에서 n = 1 종료 조건 -> 해당 호출은 a[0]으로 첫 번째 요소 반환
 * 각 호출에서 반환된 값들 비교하여 최대값 찾음
 */