package DataStructure.stack;

public class Stack {
    public static <arr> void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        // Pushing element on the top of the stack
        java.util.Stack<Integer> stk = new java.util.Stack<>();
        for (int i = 0; i < 5; i++) {
            stk.push(i);
        }

        // Peek (On the top of the stack
        Integer element = (Integer) stk.peek();
        System.out.println("Peek" + element);

        //Searching element in the stack
        Integer searching = (Integer) stk.search(1);
        System.out.println("Search" + searching);

        // Popping element from the top of the stack
        for (int i = 0; i < 5; i++) {
            int ele = stk.pop();
            System.out.println(ele);
        }
    }
}