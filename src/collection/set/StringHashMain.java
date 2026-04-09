package collection.set;

public class StringHashMain {
    /*
    문자는 아스키 코드로 고유한 숫자를 가지고 있다.
    해시 함수 : 임의의 길이의 데이터를 입력 받아, 고정된 길이의 해시코드를 출력하는 함수 (같은 해시 코드가 나올 수 있다 -> 해시 충돌)
    해시 코드 : 데이터를 대표하는 값
    해시 인덱스 : 데이터의 저장 위치
    -> 직접 만든 객체는 어떻게 해시 코드를 정의할 수 있을까?
     */
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println(charA + " = " + (int)charA);
        System.out.println(charB + " = " + (int)charB);

        //hashCode
        System.out.println("hashCode(A) = " + hashCode("A"));
        System.out.println("hashCode(B) = " + hashCode("B"));
        System.out.println("hashCode(AB) = " + hashCode("AB"));

        //hashIndex
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
    }

    private static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
