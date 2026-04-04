package generic.ex3;

public class AnimalHospitalV2<T> {
    /*
    제네릭 타입을 선언하면 자바 컴파일러 입장에서 T에 어떤 값이 들어올지 예측할 수 없다.
    모든 객체의 최종 부모인 Object 타입으로 가정한다.
    따라서 Animal의 메서드를 사용할 수 없다.
     */
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup(){
        // T의 타입을 메서드르 정의하는 시점에는 알 수 없다. Object의 기능만 사용 가능
        animal.toString();
        animal.equals(null);

        // 컴파일 오류
        //System.out.println("동물 이름: " + animal.getName());
        //animal.sound();
    }

    public T getBigger(T target){
        // 컴파일 오류
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }

}
