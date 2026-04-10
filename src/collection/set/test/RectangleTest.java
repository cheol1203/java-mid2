package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class RectangleTest {
    /*
    문제5 : Equals, HashCode
    RectangleTest, 실행 결과를 참고해서 다음 Rectangle 클래스를 완성하자.
    Rectangle 클래스는 width, height가 모두 같으면 같은 값으로 정의한다.
     */
    public static void main(String[] args) {
        Set<Rectangle> rectangleSet = new HashSet<>();
        rectangleSet.add(new Rectangle(10, 10));
        rectangleSet.add(new Rectangle(20, 20));
        rectangleSet.add(new Rectangle(20, 20)); //중복

        for (Rectangle rectangle : rectangleSet) {
            System.out.println("rectangle = " + rectangle);
        }
    }
}
