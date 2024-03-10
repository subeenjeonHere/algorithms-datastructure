package baek_joon.class_2.랜선자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int k = Integer.parseInt(stk.nextToken());
        int n = Integer.parseInt(stk.nextToken());

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 최소값, 최대, 중간값
        int max = arr[0];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                temp = max;
                max = arr[i];
                arr[i] = temp;
            }
        }
        long target = n;
        long left = 1;
        long right = max;

        right++;
/**
 * @Check Right 범위,
 */
        while (left <= right) {
            System.out.println("While 호출");

            //Mid
            long mid = left + (right - left) / 2;
            System.out.println("Mid, Left, Right: " + mid + " " + left + "  " + right);
            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i] / mid;
                System.out.println("sum 1: " + sum);
            }
            System.out.println("sum-" + sum);
            if (sum < target) {
                right = mid - 1;
                System.out.println("right-" + right);
            } else if (sum >= target) {
                Math.max(mid, right);
                left = mid + 1;
                System.out.println("left- " + left);
            }
        }

    }
}

//            while (left <= right) {
//            long middle = left + (right - left) / 2;
//            int checkResult = check(arr, middle, target, left, right);
//                System.out.println();
//                System.out.println("결과1: " + checkResult);
//
//                if (checkResult == target) {
//                    System.out.println(middle);
//                    break;
//                }
//                //mid 길이로 만들 수 있는 랜선 수가 적다면 랜선을 줄여야 함
//                else if (checkResult < target) {
//                    right = middle - 1;
//                    System.out.println();
//                    System.out.println("길이와 Right: " + middle + " " + right);
//                    /**
//                     * @Check
//                     * Middle이 right이 변경 된 이후 재계산하여 200이 다시 되어야 함
//                     */
//                    System.out.println("결과2: " + checkResult);
//
//                    //mid 길이로 만들 수 있는 랜선 수를 초과한다면, 랜선길이 늘려야 함
//                } else if (checkResult > target) {
//                    left = middle + 1;
//                    System.out.println();
//                    System.out.println("Mid, Left, Right: " + middle + " " + left + "  " + right);
//
//                    System.out.println("결과3: " + checkResult);
//                }
//            }
//        }
//    }


//중간값으로 target개 랜선 만들어지는지 check
//    private static int check(int[] arr, long mid, int target, long left, long right) {
//        int count = 0;
//        int st = 0;
////        mid = left + (right - left) / 2;
//        System.out.println("중간값 체크: " + mid);
//
//        while (st < arr.length) {
//            count += arr[st] / mid;
//            System.out.println("랜선 한 개당 만들 수 있는 : " + arr[st] / mid);
//            st++;
//        }
//        System.out.println("만들 수 있는 랜선 수 : " + count);
//        System.out.println();
//        return count;
//    }
//    }

