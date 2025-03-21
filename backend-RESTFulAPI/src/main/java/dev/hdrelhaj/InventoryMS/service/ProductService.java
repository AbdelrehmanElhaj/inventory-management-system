package dev.hdrelhaj.InventoryMS.service;

import dev.hdrelhaj.InventoryMS.dto.ProductDTO;
import dev.hdrelhaj.InventoryMS.dto.Response;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
    Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);
    Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);
    Response getAllProducts();
    Response getProductById(Long id);
    Response deleteProduct(Long id);
}
