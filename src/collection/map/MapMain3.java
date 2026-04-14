package collection.map;

import java.util.HashMap;

public class MapMain3 {
    /*
    같은 키의 다른 값을 넣으면 갱신되는 문제 해결
    만약 같은 학생이 Map에 없는 경우에만 데이터를 저장하려면 어떻게 해야할까?
     */
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println(studentMap);

        //학생이 없는 경우에만 추가1
        if(!studentMap.containsKey("studentA")){
            studentMap.put("studentA",100);
        }
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가2
        studentMap.putIfAbsent("studentA", 100);
        studentMap.putIfAbsent("studentB", 100);
        System.out.println(studentMap);

    }
}
