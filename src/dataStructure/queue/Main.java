package dataStructure.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Subject Queue
 * Front에서 삭제 연산만 수행
 * Rear에서 삽입 연산만 수행
 * BFS에서 사용
 */
public class Main {
    public static void main(String[] args) {

        //Int 형 큐 선언
        Queue<Integer> que = new LinkedList<>();
        //String 형 Queue 선언
        Queue<String> stringQue = new LinkedList<>();

        //값 추가
        /**
         * add, offer 사용 가능 -> add는 삽입 성공하면 true, 실패하면 IllegalStateException발 생
         */
        que.offer(3);
        que.offer(5);
        que.offer(1);
        System.out.println(que);

        //값 삭제
        que.poll();
        //FIFO 이므로 먼저 들어온 값이 삭제됨
        System.out.println(que);

        //최상단에 있는 값 확인
        int peeked = que.peek();
        System.out.println(peeked);

        //첫번쨰값제거
        que.remove();
        System.out.println(que);

        //큐 초기화
        que.clear();
        System.out.println(que);
    }
}
