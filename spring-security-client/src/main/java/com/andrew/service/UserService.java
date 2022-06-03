package com.andrew.service;

import com.andrew.entity.User;
import com.andrew.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);
}
