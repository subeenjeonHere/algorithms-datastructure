package baek_joon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 단어공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //n입력 받기
        //대문자 변환
        String string = br.readLine().toUpperCase();
//        String string = "Mississipi";

        // char string -> arraylist
//        ArrayList<ArrayList<Character>> stringList = new ArrayList<ArrayList<Character>>();
        ArrayList<Character> stringList = new ArrayList<Character>();
        HashMap<Character, Integer> map = frequency(string);

        //배열에 저장
        for (int i = 0; i < string.length(); i++) {
            stringList.add(string.charAt(i));
        }
        System.out.println(stringList);

        //string 전체 순회하며 list랑 비교
        int count = 0;
        for (int i = 0; i < string.length(); i++) {

            for (int j = 0; j < stringList.size(); j++) {

                char s = string.charAt(i);

                System.out.println(s);
                if (stringList.get(j) == s) {
                    count++;
                    System.out.println("같음");
                }
            }
        }


        ArrayList<Integer> tempList = new ArrayList<>();

    }

    private static HashMap<Character, Integer> frequency(String string) {
        int length = string.length();
        char c;

        HashMap<Character, Integer> map = new HashMap<>();
        for ()
    }
}
