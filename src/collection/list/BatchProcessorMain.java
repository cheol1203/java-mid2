package collection.list;

public class BatchProcessorMain {
    /*
    리스트를 인터페이스화 하여 MyList를 사용하는 클라이언트 코드인
    BatchProcessor를 전혀 변경하지 않고, 원하는 리스트 전략을 런타입에 지정할 수 있다.

    데이터를 앞에 추가하거나 삭제할 때 빅오 비교
    MyArrayList : O(n)
    MyLinkedList : O(1)

    외부에서 의존관계가 결정되어 인스턴스에 들어오는 것 - 의존관계 주입

    전략 패턴
        MyList 인터페이스가 바로 전략을 정의하는 인터페이스가 되고, 각각의 구현체인
        MyArrayList, MyLinkedList가 전략의 구체적인 구현이 된다. 그리고 전략을 클라이언트 코드(BatchProcessor)
        의 변경없이 손쉽게 교체할 수 있다.
     */
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        //MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}
