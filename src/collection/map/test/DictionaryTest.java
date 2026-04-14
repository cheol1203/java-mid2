package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DictionaryTest {
    /* (정답)
    문제 5 : 영어 사전 만들기
        영어 단어를 입력하면 한글 단어를 찾아주는 영어 사전을 만들자.
            먼저 영어 단어와 한글 단어를 사전에 저장하는 단계를 거친다.
            이후에 단어를 검색한다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        while(true){
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String word = scanner.nextLine();

            if(word.equals("q")){
                break;
            }

            System.out.print("한글 뜻을 입력하세요: ");
            String mean = scanner.nextLine();

            map.put(word, mean);
        }

        System.out.println();
        System.out.println("==단어 검색 단계==");
        while(true){
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String search = scanner.nextLine();
            if(search.equals("q")){
                break;
            }

            if(map.containsKey(search)){
                System.out.println(search + "의 뜻: " + map.get(search));
            }else{
                System.out.println(search + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
