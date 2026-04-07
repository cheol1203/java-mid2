package collection.link;

public class NodeMain1 {
    /*
    이전 배열리스트는 사용하지 않는 공간이 낭비되는 것과
    데이터를 추가할때 기존 데이터들을 이동해야 한다는 단점이 있었다.
    -> 노드 객체를 활용하여 해결
     */
    public static void main(String[] args) {
        //노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색하기");
        Node x = first;
        while(x != null){
            System.out.println(x.item);
            x = x.next;
        }

    }
}
