package demo.소수찾기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        is_prime(N);
    }
    private static void is_prime(int number) {

        if (number < 2) {
            System.out.println("Not prime");
            return;
        }

        if (number == 2) {
            System.out.println("2 is prime");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % 2 == 1) {
                System.out.println("It's prime");
                return;
            } else {
                System.out.println("It isn't prime");
                return;
            }
        }

    }
}

