package center.wxp.dddsample.controller.dto;



import java.util.Date;

/**
 * @author Mr.Yangxiufeng
 * @date 2020-03-19 17:02
 */
public class OrderDTO {
    private static final long serialVersionUID = 1L;

    private String orderId;
    private int totalPrice;
    private int orderStatus;
    private Date createTime;

    public OrderDTO(String orderId, int totalPrice, int orderStatus, Date createTime) {
        this.orderId = orderId;
        this.totalPrice = totalPrice;
        this.orderStatus = orderStatus;
        this.createTime = createTime;
    }

    public static OrderDTO create(String orderId, int totalPrice, int orderStatus, Date createTime) {
        return new OrderDTO(orderId, totalPrice, orderStatus, createTime);
    }

    public String getOrderId() {
        return orderId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }
}
