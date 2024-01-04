package com.example.banknator.users;

import com.example.banknator.shared.MessageResponse;
import com.example.banknator.users.dto.PostNewUserInformation;
import com.example.banknator.users.dto.UpdateUserInformation;
import com.example.banknator.users.dto.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> createUserInformation(PostNewUserInformation request);
    void updateUserInformation(UpdateUserInformation request);
    MessageResponse disableUser(Long id);
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
}
