package programmers.lv1.콜라츠추측;

public class Main {
    public static void main(String[] args) {

        long n = 626331;
        int sum = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = isEven(n);
                sum++;
                System.out.println(n);
            } else {
                n = isOdd(n);
                sum++;
                System.out.println(n);
            }
            if (sum > 500) {
                System.out.println("-1");
            }
        }
    }

    static long isEven(long n) {
        System.out.println("Is even");
        long i = n / 2;

        //return the value
        return i;
    }

    static long isOdd(long n) {
        System.out.println("Is Odd");
        long i = n * 3 + 1;

        //return the value
        return i;
    }
}
