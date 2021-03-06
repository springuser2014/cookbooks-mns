package com.edwise.cookbook.swaggerexample.service.impl;

import com.edwise.cookbook.swaggerexample.entity.User;
import com.edwise.cookbook.swaggerexample.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceMock implements UserService {
    private static final long USER_ID_12 = 12L;
    private static final long USER_ID_140 = 140L;
    private static final long USER_ID_453321 = 45332L;
    private static final String NAME_GANDALF = "Gandalf";
    private static final String NAME_ARAGORN = "Aragorn";
    private static final String NAME_FRODO = "Frodo";
    private static final int TYPE_1 = 1;
    private static final int TYPE_2 = 2;
    private static final String PHONE_666554433 = "666554433";
    private static final String PHONE_661534411 = "661534411";
    private static final String PHONE_666222211 = "666222211";


    @Override
    public User findById(Long id) {
        return new User()
                .setId(id)
                .setName(NAME_GANDALF)
                .setPhone(PHONE_666554433)
                .setType(TYPE_1);
    }

    @Override
    public List<User> findAll() {
        return Arrays.asList(
                new User()
                        .setId(USER_ID_12)
                        .setName(NAME_GANDALF)
                        .setPhone(PHONE_666554433)
                        .setType(TYPE_1),
                new User()
                        .setId(USER_ID_140)
                        .setName(NAME_ARAGORN)
                        .setPhone(PHONE_661534411)
                        .setType(TYPE_1),
                new User()
                        .setId(USER_ID_453321)
                        .setName(NAME_FRODO)
                        .setPhone(PHONE_666222211)
                        .setType(TYPE_2)
        );
    }

    @Override
    public User save(User user) {
        return user.setId(USER_ID_453321);
    }

    @Override
    public User update(User user) {
        return user;
    }

    @Override
    public void delete(Long id) {
        // delete user by id
    }

    @Override
    public boolean exists(Long id) {
        return Boolean.TRUE;
    }
}
