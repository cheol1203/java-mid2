package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {
    /*
    add를 하면 중복된 값이 있으면 추가하지않고 중복된 값이 없으면 추가하는 간단한 set 구현
     */
    private int[] elementData = new int[10];
    private int size = 0;

    //O(n)
    public boolean add(int value){
        if(contains(value)){
            return false;
        }
        elementData[size] = value;
        size++;
        return true;
    }

    //O(n)
    public boolean contains(int value) {
        for (int data : elementData) {
            if(data == value){
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData,size)) +
                ", size=" + size +
                '}';
    }
}
