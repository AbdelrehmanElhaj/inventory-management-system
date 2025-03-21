package dev.hdrelhaj.InventoryMS.service;

import dev.hdrelhaj.InventoryMS.dto.Response;
import dev.hdrelhaj.InventoryMS.dto.TransactionRequest;
import dev.hdrelhaj.InventoryMS.enums.TransactionStatus;

public interface TransactionService {
    Response restockInventory(TransactionRequest transactionRequest);
    Response sell(TransactionRequest transactionRequest);
    Response returnToSupplier(TransactionRequest transactionRequest);
    Response getAllTransactions(int page, int size, String searchText);
    Response getTransactionById(Long id);
    Response getAllTransactionByMonthAndYear(int month, int year);
    Response updateTransactionStatus(Long transactionId, TransactionStatus transactionStatus);
}
