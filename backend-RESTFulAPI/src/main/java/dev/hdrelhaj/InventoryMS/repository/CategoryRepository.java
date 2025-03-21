package dev.hdrelhaj.InventoryMS.repository;

import dev.hdrelhaj.InventoryMS.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
