package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {
    private T value;

    public void showInfo() {
        System.out.println("이름: " + value.getName() + ", HP: " + value.getHp());
    }

    public void in(T t) {
        value = t;
    }
}
