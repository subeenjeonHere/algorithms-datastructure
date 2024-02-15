package demo.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //Declare a Queue
        Queue<Integer> que = new LinkedList<>();
        //Initialize the queue with values

        for (int i = 0; i < 10; i++) {
            que.add(i);
        }
        System.out.println(que);

        // traverse the Queue using Iterator
        Iterator iterator = que.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }


    }
}
