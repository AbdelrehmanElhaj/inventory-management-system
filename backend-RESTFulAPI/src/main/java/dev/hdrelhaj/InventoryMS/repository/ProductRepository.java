package dev.hdrelhaj.InventoryMS.repository;

import dev.hdrelhaj.InventoryMS.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
