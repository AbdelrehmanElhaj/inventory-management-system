package dev.hdrelhaj.InventoryMS.service;

import dev.hdrelhaj.InventoryMS.dto.LoginRequest;
import dev.hdrelhaj.InventoryMS.dto.RegisterRequest;
import dev.hdrelhaj.InventoryMS.dto.Response;
import dev.hdrelhaj.InventoryMS.dto.UserDTO;
import dev.hdrelhaj.InventoryMS.entity.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getCurrentLoggedInUser();
    Response updateUser(Long id, UserDTO userDTO);
    Response deleteUser(Long id);
    Response getUserTransactions(Long id);
}
