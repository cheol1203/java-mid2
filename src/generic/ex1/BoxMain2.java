package generic.ex1;

public class BoxMain2 {
    /*
    다형성을 활용하여 코드의 중복을 제거하였다. 하지만 입력할 때 실수로 원하지
    않는 타입이 들어갈 수 있는 타입 안전성 문제가 발생한다.
    - 코드 재사용 O
    - 타입 안정성 X
    (제네릭 도입)
     */
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); //Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //Object -> String 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }
}
