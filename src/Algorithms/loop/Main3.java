package Algorithms.loop;

/**
 * 소수 판별
 */
public class Main3 {
    public static void main(String[] args) {
        int num = 7;
        if (isPrime(num)) {
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }

    }

    private static boolean isPrime(int num) {
        /**
         * 소수 판별 로직
         * 소수: 1, 자기 자신만을 약수로 가짐
         * 반복문과 조건문 활용
         */
        /**
         * 1 2 3 4 5 6 7 8 9 10
         */
        int[] arr = new int[num];
        int start = 0;

        for (int i = 2; i < arr.length; i++) {
            arr[start] = i;
            start++;
        }
        int go = 0;
        while (go < arr.length) {
            if (arr[go] % go == 0) {

            }
            go++;
        }


        return false;
    }
}
