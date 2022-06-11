package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Item;
import lk.ijse.hibernate.entity.OrderDetail;
import lk.ijse.hibernate.entity.Orders;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author : Pasan Pahasara
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        /**CRUD Customer*/

        //for save
        session.save(new Customer("C-001","Mr","Pahasara","Wataraka","Galle","Southern","80000"));

        //for update
//        session.update(new Customer("C-001","Mr","Pahasara","Wataraka","Galle","Southern","70000"));

        //for getting one customer
//        System.out.println(session.get(Customer.class,"C-001"));

        //for delete
//        session.delete(session.get(Customer.class,"C-001"));

        /**CRUD Item*/

        //for save
        session.save(new Item("I-001","Sope","Small",95.55,25));

        //for update
//        session.update(new Item("I-001","Sope","Small",95.55,75));

        //for getting one item
//        System.out.println(session.get(Item.class,"I-001"));

        //for delete
//        session.delete(session.get(Item.class,"I-001"));

        /**CRUD Orders*/

        //for save
        session.save(new Orders("O-001", LocalDate.now(),session.get(Customer.class,"C-001")));

        //for getting one orders
//        System.out.println(session.get(Orders.class,"O-001"));

        /**CRUD OrderDetails*/

        Item item = session.get(Item.class, "I-001");
        Orders orders = session.get(Orders.class, "O-001");
        OrderDetail orderDetail = session.get(OrderDetail.class, "O-001");

        //for save
        session.save(new OrderDetail(orders.getOrderId(),orders,item,3,new BigDecimal(5.00),item.getUnitPrice(),new BigDecimal(800.00)));

        //for update
//        try {
//            session.update(orderDetail.setOrderQty(17));
//            session.update(orderDetail.setDiscount(new BigDecimal(85.22)));
//        }catch (IllegalArgumentException e){
//
//        }

        //for delete
//        session.delete(session.get(OrderDetail.class,"O-001"));


        transaction.commit();

        session.close();
    }

}
