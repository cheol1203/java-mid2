package collection.map.test;

import java.util.HashMap;

public class WordFrequencyTest1 {
    /* (오답)
    문제 3 : 같은 단어가 나타난 수
        각각의 단어가 나타난 수를 출력해라.
     */
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        // 코드 작성
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = text.split(" ");

        for (String word : words) {
            Integer count = map.get(word);
            if(count == null){
                count = 0;
            }
            count++;
            map.put(word,count);
        }

//        for (String word : words) {
//            map.put(word, map.getOrDefault(word, 0) + 1);
//        }
        // getOrDefault() : 키가 없는 경우 대신 사용할 기본 값 지정

        System.out.println(map);

    }
}
