package com.gyanly.blog.estore.service;

import java.util.HashMap;
import java.util.Map;

public class UsersRepositoryImpl implements UsersRepository {
    @Override
    public boolean save(User user) {
        boolean returnValue = false;
        Map<String,User> users = new HashMap<>();
        if(!users.containsKey(user.getId())){
            users.put(user.getId(), user);
            returnValue = true;
        }
        return returnValue;
    }
}
