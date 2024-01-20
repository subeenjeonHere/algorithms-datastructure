//package back_joon.n1940;
//
//import java.util.Scanner;
//
//public class Memoization {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int count = 0;
//        int sum = 0;
//        int start = 0;
//        int end = 1;
//        while (end != arr.length) {
//            if (sum == arr[start] + arr[end]) {
//                count++;
//                sum = sum - arr[end];
//                end++;
//            } else if (sum > arr[start + arr[end]) {
//                end++;
//            } else {
//                start++;
//            }
//        }
//        System.out.println(count);
//    }
//}
///**
// * N
// * M
// * N개의 재료들이 가진 고유한 번호들이 공백을 사이에 두고 주어진다.
// * 재료의 번호 두 개를 합쳐서 M이 되면 갑옷이 만들어 진다.
// * 6
// * 9
// * 2 7 4 1 5 3
// * 출력 2
// */
//// sum == n 이라면 : count ++;   sum -= sum - arr[end]; end ++;
//// sum > n 이라면 : end ++;
//// sum < n 이라면 : start ++;