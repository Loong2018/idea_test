//package com.laoda.test;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import com.laoda.mapper.UsersMapper;
//import com.laoda.pojo.Users;
//
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
//public class ManagerTest {
//
//    @Autowired
//    private UsersMapper usersMapper;
//
//    @Test
//    public void testInsertUser() {
//        Users users = new Users();
//        users.setUsername("World");
//        users.setUserage(20);
//        this.usersMapper.insertUser(users);
//    }
//
//    @Test
//    public void testSelectUserAll() {
//        List<Users> usersList = this.usersMapper.selectUserAll();
//        for (int i = 0; i < usersList.size(); i++) {
//            Users users = usersList.get(i);
//            System.out.println(i + ": " + users.getUsername() + users.getUserid());
//        }
//    }
//}
