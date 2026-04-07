package collection.link;

public class Node {
    Object item;
    Node next;

    public Node(Object item){
        this.item = item;
    }

    /*
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
    */

    // 반복문 안에서 문자를 더하기 때문에 StringBuilder가 좋다
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while(x != null){
            sb.append(x.item);
            if(x.next != null){
                sb.append("->");
            }
            x= x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
