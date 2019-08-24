package com.laoda.mapper;

import com.laoda.pojo.Users;

import java.util.List;

public interface UsersMapper {
    void insertUser(Users users);

    List<Users> selectUserAll();
}
