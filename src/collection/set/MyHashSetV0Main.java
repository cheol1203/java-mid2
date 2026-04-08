package collection.set;

public class MyHashSetV0Main {
    /*
    add도 contains 도 모두 O(n)이다.
    -> 해시 알고리즘 적용
     */
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1); //O(n)
        set.add(2); //O(n)
        set.add(3); //O(n)
        set.add(4); //O(n)
        System.out.println(set);

        boolean result = set.add(4); //중복 데이터 저장
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);

        System.out.println("set.contains(3): " + set.contains(3)); // O(n)
        System.out.println("set.contains(99): " + set.contains(99)); // O(n)



    }
}
