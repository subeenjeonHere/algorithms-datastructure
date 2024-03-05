package demo.binarySearch;

/**
 * Binary Search: 이분탐색
 */
public class BinarySearch {

    // x가 arr [ l..r ]에 있다면 x의 인덱스 반환, 아니면 -1 반환
    int binarySearch(int[] arr, int l, int r, int x) {

        if (r >= l) {
            int mid = l + (r - 1) / 2;

            if (arr[mid] == x)
                return mid;

            //x가 mid 원소보다 작으면, 왼쪽 데이터 집합 선택
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            //mdi 보다 크면, 오른쪽 데이터 집합 선택
            return binarySearch(arr, l, mid + 1, x);
        }
        //배열에 원소가 없는 경우, -1 리턴
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);

        if (result == -1) {
            System.out.println("원소가 배열에 존재하지 않습니다.");
        } else {
            System.out.println(result + "에 존재합니다.");
        }
    }
}

