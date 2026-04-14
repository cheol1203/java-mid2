package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {
    /*
    문제 1 : 간단한 히스토리 확인

    스택에 push()를 통해서 다음 데이터를 순서대로 입력해라.
    "youtube.com"
    "google.com"
    "facebook.com"

    스택에 pop()을 통해서 데이터를 꺼내고, 꺼낸 순서대로 출력해라.
    "facebook.com"
    "google.com"
    "youtube.com"
     */
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        //코드 작성
        deque.push("youtube.com");
        deque.push("google.com");
        deque.push("facebook.com");

        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
    }
}
