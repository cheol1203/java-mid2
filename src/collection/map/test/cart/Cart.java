package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    //코드 작성
    public void add(Product product, int quantity) {
        if(cartMap.containsKey(product)){
            Integer update_quantity = cartMap.get(product);
            update_quantity += quantity;
            cartMap.put(product,update_quantity);
        }else{
            cartMap.put(product,quantity);
        }

        //코드 개선
//        int existingQuantity = cartMap.getOrDefault(product, 0);
//        cartMap.put(product, existingQuantity + quantity);
    }

    public void minus(Product product, int quantity) {
        Integer update_quantity = cartMap.get(product);
        update_quantity -= quantity;
        if(update_quantity > 0){
            cartMap.put(product,update_quantity);
        }else{
            cartMap.remove(product);
        }

        //코드 개선 : 이전 코드는 nullPointerException 발생 가능
//        int existingQuantity = cartMap.getOrDefault(product, 0);
//        int newQuantity = existingQuantity - quantity;
//        if (newQuantity <= 0) {
//            cartMap.remove(product);
//        } else {
//            cartMap.put(product, newQuantity);
//        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println("상품: " + product + " 수량: " + cartMap.get(product));
        }
    }
}
