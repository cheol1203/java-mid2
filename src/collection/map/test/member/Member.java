package collection.map.test.member;

public class Member {
    /*
    문제 6: 회원 관리 저장소
        Map을 사용해서 회원을 저장하고 관리하는 MemberRepository코드를 완성하자.
        Member, MemberRepositoryMain 코드를 참고하자.
     */
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
