package dev.hdrelhaj.InventoryMS.repository;

import dev.hdrelhaj.InventoryMS.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
