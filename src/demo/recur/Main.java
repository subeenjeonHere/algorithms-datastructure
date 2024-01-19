package demo.recur;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        HelloWorld(5);
    }
    public static void HelloWorld(int n) {
        // n == 0인 경우 return
        if (n == 0) return;
        // HelloWorld 출력
        System.out.println("Hello World");
        HelloWorld(n - 1); // 재귀함수 시작
        // n이 0이 될 때 메소드 종료, 함수를 호출할 때마다 n-1을 해줘서 재귀함수 종료시킴
    }
}
