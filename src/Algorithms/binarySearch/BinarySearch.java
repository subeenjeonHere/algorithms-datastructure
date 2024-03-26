package Algorithms.binarySearch;

/**
 * Binary Search: 이분탐색
 */
public class BinarySearch {

    // x가 arr [ l..r ]에 있다면 x의 인덱스 반환, 아니면 -1 반환
    int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println(mid);
            // 타겟 값이 중간값 보다 작다면 왼쪽 데이터셋 선택
            if (arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int result = ob.binarySearch(arr, x);

        if (result == -1) {
            System.out.println("원소가 배열에 존재하지 않습니다.");
        } else {
            System.out.println(result + "에 존재합니다.");
        }
    }
}

