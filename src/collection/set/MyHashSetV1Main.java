package collection.set;

public class MyHashSetV1Main {
    /*
    배열 안의 리스트를 사용하여 해시 충돌이 일어나도 평균 O(1) 속도를 유지한다.
    --> 문제 : 만약 숫자가 아닌 문자 데이터를 저장할 땐 어떻게 해야할까?
     */
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); //hashIndex 중복
        System.out.println(set);

        //검색
        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

        //삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println(set);
    }
}
