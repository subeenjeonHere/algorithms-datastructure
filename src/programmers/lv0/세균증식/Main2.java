package programmers.lv0.세균증식;

public class Main2 {
    public static void main(String[] args) {
        int n = 2;
        int t1 = 1;
        int t2 = 10;
        int i = 1;

        int result = 0;
        while (t1 <= t2) {
            // 1 2, 2 4, 3 8, 10 2028
            n += n * 2;
            t1++;
            System.out.println("result: " + n);
            System.out.println("t1: " + t1);
        }
        System.out.println(result);
    }
}
