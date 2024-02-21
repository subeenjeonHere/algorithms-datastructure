package prog.lv1.나머지1이되는수;

public class Main {
    public static void main(String[] args) {

        int n = 10;
        int x = 1;


        for (int i = 0; i <= n; i++) {
            if (n % x == 1) {
                System.out.println(x);
                return;
            } else {
                x++;
            }
        }
    }
}
