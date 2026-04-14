package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class ArrayToMapTest {
    /* (오답)
    문제1 : 배열을 맵으로 전환
        상품의 이름과 가격이 2차원 배열로 제공된다.
        다음 예제를 참고해서 2차원 배열의 데이터를 Map<String, Integer>로 변경해라.
        그리고 실행 결과를 참고해서 Map을 출력해라. 출력 순서는 상관없다.
     */
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
                {"JPA", "30000"}};


        // 주어진 배열로부터 Map 생성 - 코드 작성
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] product : productArr) {
            map.put(product[0],Integer.valueOf(product[1]));
        }

        // Map의 모든 데이터 출력  - 코드 작성

        for (String s : map.keySet()) {
            System.out.println("제품: " + s + ", 가격: " + map.get(s));
        }


    }
}
