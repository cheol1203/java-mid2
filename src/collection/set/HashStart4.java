package collection.set;

import java.util.Arrays;

public class HashStart4 {
    /*
    공간을 절약하는 방법 -> 나머지 연산을 활용 -> 해시 인덱스
    해시 인덱스 : 배열의 인덱스로 사용할 수 있도록 원래의 값을 계산한 인덱스
    값을 저장하고 검색하는 기능이 O(1)이다.
    -> 문제점 : 해시 충돌 발생(같은 해시 인덱스 발생)
     */

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99}
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        //검색
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("searchValue hashIndex = " + hashIndex);
        Integer result = inputArray[hashIndex]; //O(1)
        System.out.println(result);

    }

    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
