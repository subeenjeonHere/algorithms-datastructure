package baek_joon.others.그룹단어체커;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[20];

        StringBuilder sb = new StringBuilder();
        String exm = "HelloWorld";

        for (int i = 0; i < exm.length(); i++) {
            sb.append(exm.charAt(i));
            arr[i] = String.valueOf(sb.charAt(i));
            //Sb에 전체 String 입력받고 -> sb 1~끝까지 반복하며 똑같은 값 나오면 종료, 아니면 count +1
            int st = 0;

            for (int j = 0; j < sb.length(); j++) {

                
            }
        }
        System.out.println(sb.toString());
        System.out.println(Arrays.toString(arr));


    }
}
