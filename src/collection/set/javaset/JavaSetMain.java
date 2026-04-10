package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    /*
    Hashset : 입력한 순서를 보장하지 않음 (해시 구조 사용)
    LinkedHashSet : 입력한 순서를 보장한다 (HashSet + LinkedList)
    TreeSet : 데이터 값을 기준으로 정렬 (tree 구조 사용)
     */
    public static void main(String[] args) {
        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
