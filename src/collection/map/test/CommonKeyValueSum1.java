package collection.map.test;

import java.util.*;

public class CommonKeyValueSum1 {
    /* (오답)
    문제2 : 공통의 합
        map1과 map2에 공통으로 들어있는 키를 찾고, 그 값의 합을 구해라.
     */
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        // 코드 작성
        HashMap<String, Integer> result = new HashMap<>();

        for (String s : map1.keySet()) {
            if(map2.containsKey(s)){
                result.put(s, map1.get(s)+map2.get(s));
            }
        }
        System.out.println(result);
    }
}
