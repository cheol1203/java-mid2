package generic.ex1;

public class BoxMain1 {
    /*
    Double, Boolean을 포함한 다양한 타입을 담는 박스가 필요하다면 각각의
    타입별로 클래스를 새로 만들어야 한다. (Object박스로 해결)
    -타입 안정성 O
    -코드 재사용성 X
     */
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
