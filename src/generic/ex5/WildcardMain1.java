package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    /*
    와일드카드는 이미 만들어진 제네릭 타입을 활용할 때 사용한다.
     */
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        //와일드 카드는 전달한 타입을 명확하게 반환할 수 없다.
        //메서드 타입을 특정 시점에 변경하려면 제네릭 타입이나, 제네릭 메서드를 사용해야한다.
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
    }
}
