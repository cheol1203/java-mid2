package collection.list;

public interface MyList<E> {
    /*
    다형성과 OCP 원칙 활용
     */
    int size();

    void add(E e);

    void add(int index, E e);

    E get(int index);

    E set(int index, E element);

    E remove(int index);

    int indexOf(E o);
}
