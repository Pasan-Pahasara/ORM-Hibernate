package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * @author : Pasan Pahasara
 * @since : 0.1.0
 **/
@Entity
public class Orders {
    @Id
    private String orderId;
    private LocalDate orderDate;
    private String cusId;

    public Orders() {
    }

    public Orders(String orderId, LocalDate orderDate, String cusId) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.cusId = cusId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId='" + orderId + '\'' +
                ", orderDate=" + orderDate +
                ", cusId='" + cusId + '\'' +
                '}';
    }
}
