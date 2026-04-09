package collection.set.member;

import java.util.Objects;

public class MemberOnlyHash {
    /*
    hashCode는 구현했지만 equals를 구현하지 않은 경우
     */
    private String id;
    public MemberOnlyHash(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        return "MemberOnlyHash{" +
                "id='" + id + '\'' +
                '}';
    }
}
