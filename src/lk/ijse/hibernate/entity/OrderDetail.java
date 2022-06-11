package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

/**
 * @author : Pasan Pahasara
 * @since : 0.1.0
 **/
@Entity
public class OrderDetail {
    @Id
    private String orderId;
    private String itemCode;
    private int orderQty;
    private BigDecimal discount;
    private BigDecimal total;
    @ManyToOne
    private Orders order;
    @ManyToOne
    private Item item;

    public OrderDetail() {
    }

    public OrderDetail(String orderId, String itemCode, int orderQty, BigDecimal discount, BigDecimal total, Orders order, Item item) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.orderQty = orderQty;
        this.discount = discount;
        this.total = total;
        this.order = order;
        this.item = item;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId='" + orderId + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", orderQty=" + orderQty +
                ", discount=" + discount +
                ", total=" + total +
                ", order=" + order +
                ", item=" + item +
                '}';
    }
}
