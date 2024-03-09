package programmers.lv0.옷가게할인;

public class Main {
    public static void main(String[] args) {

        int price = 100010;
        int answer = 0;
        if (price >= 500000) {
            answer = price - (int) (price * 0.2);
        } else if (price >= 300000) {
            answer = price - (int) (price * 0.1);
        } else if (price >= 100000) {
            answer = (int)(price - (price * 0.05));
        } else {
            answer = price;
        }
        System.out.println(answer);
    }
}
