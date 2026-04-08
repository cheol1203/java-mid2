package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    /*
    해시 충돌 해결 -> 같은 인덱스에 함께 저장하기(배열 안에 배열)
    CAPACITY의 크기의 75%의 데이터가 저장될 때 가장 효율적이다.
    배열의 크기만 적절하게 잡아주면 대부분 O(1)에 가까운 성능을 보여준다.
     */

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); //중복
        System.out.println("buckets = " + Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue + ") = " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        if(!bucket.contains(value)){ //O(n)
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        return bucket.contains(searchValue); //O(n)
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
