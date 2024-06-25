package aplicacoes;

import entites.enums.OrderStatus;
import enumeracao.Order;


import java.util.Date;

public class ProgramOrder {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT );
        System.out.println(order);

        OrderStatus os1 = OrderStatus.valueOf("DELIVERED");
        OrderStatus os2 = OrderStatus.DELIVERED;
        System.out.println(os2);
        System.out.println(os1);
    }
}
