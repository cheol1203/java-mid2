package generic.ex4;

public class GenericMethod {
    /*
    static 메서드에는 타입 캐개변수를 사용할 수 없다.
    static 메서드에 제네릭을 도입하려면 제네릭 메서드를 사용해야한다.
     */
    public static Object objMethod(Object obj){
        System.out.println("object print: " + obj);
        return obj;
    }

    public static<T> T genericMethod(T t){
        System.out.println("generic print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t){
        System.out.println("bound print: " + t);
        return t;
    }
}
