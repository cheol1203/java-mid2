package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    //코드 작성
    private Deque<String> stack = new ArrayDeque<>();

    public void visitPage(String s) {
        System.out.println("방문: " + s);
        stack.push(s);
    }

    public String goBack() {
        stack.pop();
        System.out.println("뒤로 가기: " + stack.peek());
        return stack.peek();
    }
}
