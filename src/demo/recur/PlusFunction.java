package demo.recur;

// 1+N까지 합계출력
public class PlusFunction {
    public static void main(String[] args) {
        int N = 5;
        System.out.println("1부터" + N + "까지의 합계 " + Plusplus(5));
    }
    public static int Plusplus(int n) {
        if (n == 0) return 0; //n=0인 경우 리턴
        return n += Plusplus(n - 1); //재귀 시작
    }
}
/**
 *
 * 1부터 N까지 합계 출력하는 재귀함수, Return에서 N+= 재귀함수 호출하여 1~N 까지의 합계를 구해줌
 */