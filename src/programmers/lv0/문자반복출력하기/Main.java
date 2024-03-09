package programmers.lv0.문자반복출력하기;

public class Main {
    public static void main(String[] args) {
        String str = "hello";
        int n = 3;
        StringBuilder sb = new StringBuilder();

        //String 각 문자열을 n 만큼 반복
        for (int i = 0; i < str.length(); i++) {
            int cnt = 0;
            while (cnt <= n) {
                sb.append(str.charAt(i));
                cnt++;
            }
        }
        System.out.println(sb);
    }
}
