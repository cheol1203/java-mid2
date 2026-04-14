package collection.deque;

import java.util.Stack;

//Stack은 사용하면 안됨 -> Deque를 대신 사용
public class StackMain {
    /*
    스택은 나중에 넣은 것이 가장 먼저 나오는 후입 선출(LIFO)
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 꺼낼 요소 확인(꺼내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        //스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("sztack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);
    }
}
