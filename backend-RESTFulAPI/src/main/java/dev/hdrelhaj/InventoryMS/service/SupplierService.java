package dev.hdrelhaj.InventoryMS.service;

import dev.hdrelhaj.InventoryMS.dto.Response;
import dev.hdrelhaj.InventoryMS.dto.SupplierDTO;

public interface SupplierService {
    Response addSupplier(SupplierDTO supplierDTO);
    Response updateSupplier(Long id, SupplierDTO supplierDTO);
    Response getAllSuppliers();
    Response getSupplierById(Long id);
    Response deleteSupplier(Long id);
}
