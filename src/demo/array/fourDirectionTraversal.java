package demo.array;

public class fourDirectionTraversal {
    private static int x;
    private static int y;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void traversal(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
        }
    }

    public static void main(String[] args) {


    }
}
