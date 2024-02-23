package demo.loop;

public class Main2 {
    public static void main(String[] args) {

        int count = 0;
        while (count < 5) {
            count++;

            if (count == 2 || count == 4) {
                System.out.println("현재 count : " + count + ", continue를 실행해 다음 반복으로 넘어간다.");
                continue;
            }
            System.out.println("현재 count: " + count);
        }
    }
}
