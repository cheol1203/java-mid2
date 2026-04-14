package collection.map.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ItemPriceTest {
    /* (정답)
    문제4 : 값으로 검색
        다음 예제에서 Map에 들어있는 데이터 중에 값이 1000원인 모든 상품을 출력해라.
     */
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        // 코드 작성
        HashSet<String> set = new HashSet<>();
        for (String s : map.keySet()) {
            if(map.get(s).equals(1000)){
                set.add(s);
            }
        }
        System.out.println(set);
    }
}
