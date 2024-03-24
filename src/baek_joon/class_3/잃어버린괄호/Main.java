package baek_joon.class_3.잃어버린괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Point :: - 연산자 직전까지 더하고, - 연산자 직전까지 더하고 빼기를 반복
 * :: - 연산자 활용 주의
 * <p>
 * :: 55-50+40
 */
public class Main {
    static ArrayList<ArrayList<String>> nums;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //식 입력
        String s = br.readLine();

        //- 없을 때 처리
        int noMinus = 0;
        if (!s.contains("-")) {
            String[] res = s.split("[+]");
            for (String element : res) {
                noMinus += Integer.parseInt(element);
            }
            System.out.print(noMinus);
            return;
        }

        //- 기준으로 나눠 입력받기
        String[] res = s.split("-");

        nums = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < res.length; i++) {
            nums.add(i, new ArrayList<>());
        }
        int idx = 0;
        for (String part : res) {
            nums.get(idx).add(part);
            idx++;
        }


        // 각 원소들은 +로 묶여져 있을 것
        // 배열의 각 인덱스 요소들은 -로 연결 되어있다
        // - 뒤에 올 원소들의 합을 크게 만드는 것이 최소값으로 만들 수 있다

        //nums 반복
        //각 원소들이 분리되어 있다는 건 - 라는 것
        //첫 번째 문자 제외 각 원소들의 합 구하고, 첫 번째 문자에서 빼기

        int sum = 0;
        int[] sums = new int[nums.size()];

        //for nums size 만큼 반복
        for (int i = 1; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                //각 원소를 String으로 받고
                String a = nums.get(i).get(j);
                //+를 기준으로 분리해 int로 변환
                String[] split = a.split("[+]");
                for (String element : split) {
                    sum += Integer.parseInt(element);
                }
                sums[j] = sum;
            }
        }

        int first = Integer.parseInt(nums.get(0).get(0));
        int finalSum = 0;

        for (int i = 0; i < sums.length; i++) {
            finalSum += sums[i];
        }
        int result = first - finalSum;
        System.out.print(result);
    }
}

//애초에 입력 받을 때 연산자 기준으로 나눠서 입력 받을지