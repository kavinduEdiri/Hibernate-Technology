import javax.persistence.*;

@Entity
@Table
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    long id;
    @ManyToOne
    @JoinColumn(
            name = "item_code",
            updatable = false,
            insertable = false,
            nullable = false,
            foreignKey = @ForeignKey(
                    name = "fk_item_code"
            )
    )
    private Item item;
    @ManyToOne
    @JoinColumn(
            name = "order_code",
            updatable = false,
            insertable = false,
            nullable = false,
            foreignKey = @ForeignKey(
                    name = "fk_order_code"
            )
    )
    private Order order;
    private double unitPrice;
    private int qty;

    public OrderDetail() {
    }

    public OrderDetail(long id, Item item, Order order, double unitPrice, int qty) {
        this.id = id;
        this.item = item;
        this.order = order;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
