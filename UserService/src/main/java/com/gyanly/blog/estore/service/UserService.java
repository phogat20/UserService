package com.gyanly.blog.estore.service;

public interface UserService {
    User createUser(
            String firstName,
            String lastName,
            String email,
            String password,
            String repeatPassword
    );
}
