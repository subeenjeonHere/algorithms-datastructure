package programmers.lv0.피자나눠먹기;

public class Main {
    public static void main(String[] args) {
        int slice = 4;
        int n = 12;
        int answer = 0;
        int div = slice % n;

        System.out.println(div);

        if (n % slice == 0) {
            answer = n / slice;
        } else {
            answer = n / slice + 1;
        }
        System.out.println(answer);
    }
}
