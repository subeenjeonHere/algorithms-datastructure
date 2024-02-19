package prog.lv0.모음제거;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {97, 101, 105, 111, 117};
        String str = "nice to meet you";

        String answer = "";
        answer = str.replaceAll("[aeiou]", "");
        System.out.println(answer);
        
    }
}
