package hello.core.order;

public interface OrderService {

    // 클라이어트는 주문할때 memberId, itemName, itemPrice 를 넘기고 주문결과를 반환받음
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
