package storm.code.warehouse.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@IdClass(WarehouseProductId.class)
public class WarehouseProductQty {


    @Id
    private String whId;
    @Id
    private String productId;

    private Integer quantity;

    public WarehouseProductQty(String productId, Integer quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        WarehouseProductQty warehouse = (WarehouseProductQty) o;
        return whId != null && Objects.equals(whId, warehouse.whId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}


