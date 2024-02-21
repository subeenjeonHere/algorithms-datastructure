package baek_joon.x03배열.방번호;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String size = sc.nextLine();
        int[] arr = new int[size.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(size.charAt(i)));
        }
        int[] count = new int[10];
        int maxval = 0;
        int sum = 0;

        //카운트 배열에 카운팅
        for (int i = 0; i < arr.length; i++) {
            //6,9를 제외하고 카운팅
            if (arr[i] != 6 && arr[i] != 9) {
                count[arr[i]]++;
                //6,9의 개수 세기 -> 6이거나 9라면 sum 1씩 증가
            } else if (arr[i] == 6 || arr[i] == 9) {
                sum++;
            }
        }
        //Get max from count array
        maxval = Arrays.stream(count).max().getAsInt();
        System.out.println("최대: " + maxval + " / 9나 6: " + sum);
        System.out.println(Arrays.toString(count));

        int result = 0;
        if (sum % 2 == 0) {
            //max와 sum을 더해서 실패

            result = maxval + sum / 2;
        } else if (sum % 2 == 1) {
            result = maxval + sum / 2 + 1;
        }

        System.out.println(result);
    }
}
