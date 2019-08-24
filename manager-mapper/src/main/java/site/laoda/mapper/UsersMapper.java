package site.laoda.mapper;

import site.laoda.pojo.Users;

import java.util.List;

public interface UsersMapper {
    void insertUser(Users users);

    List<Users> selectUserAll();
}
