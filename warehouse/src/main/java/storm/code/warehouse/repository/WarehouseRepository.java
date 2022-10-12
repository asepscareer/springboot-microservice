package storm.code.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import storm.code.warehouse.entity.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, String> {
}
