package Algorithms.loop;

public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        if (x > 0) {
            System.out.println("X +.");
            if (y > 0) {
                System.out.println("Y +.");
            } else {
                System.out.println("Only x is +");
            }
        } else if (x < 0) {
            System.out.println("X -.");
        } else {
            System.out.println("X is 0.");
        }
        int count = 0;

        while (count < 5) {

            System.out.println("Not Count: " + count);

            if (count % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
            count++;
        }

    }
}
