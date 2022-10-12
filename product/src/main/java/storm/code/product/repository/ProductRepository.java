package storm.code.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import storm.code.product.entity.Product;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
