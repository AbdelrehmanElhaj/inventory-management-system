package dev.hdrelhaj.InventoryMS.service;

import dev.hdrelhaj.InventoryMS.dto.CategoryDTO;
import dev.hdrelhaj.InventoryMS.dto.Response;

public interface CategoryService {
    Response createCategory(CategoryDTO categoryDTO);
    Response getAllCategories();
    Response getCategoryById(Long id);
    Response updateCategory(Long id, CategoryDTO categoryDTO);
    Response deleteCategory(Long id);
}
