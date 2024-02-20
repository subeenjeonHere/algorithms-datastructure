package prog.lv0.순서쌍;

public class Main2 {
    public static void main(String[] args) {
        int n = 20;
        int answer = 0;

        int start = 1;
        int count = 0;
        while (start <= n) {
            answer = (n % start == 0) ? count++ : 1;
            start++;
        }
        answer = count;
        System.out.println(answer);
    }
}
