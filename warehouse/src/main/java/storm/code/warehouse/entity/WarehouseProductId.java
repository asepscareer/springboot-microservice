package storm.code.warehouse.entity;

import java.io.Serializable;

public class WarehouseProductId implements Serializable {
    private String whId;
    private String productId;

    public WarehouseProductId(String whId, String accountType) {
        this.whId = whId;
        this.productId = accountType;
    }

}