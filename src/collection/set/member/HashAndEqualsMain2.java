package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    /*
    hashCode는 구현했지만 equals를 구현하지 않은 경우
    같은 해시 코드를 사용하기 때문에 같은 인덱스에 저장된다.
    하지만 equals가 없어 중복 데이터를 체크하지 못해 중복 저장된다.
     */
    public static void main(String[] args) {
        //중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
