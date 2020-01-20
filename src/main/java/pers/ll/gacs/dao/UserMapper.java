package pers.ll.gacs.dao;

import java.util.HashMap;
import java.util.List;
import pers.ll.gacs.po.User;

public interface UserMapper {

    List<User> selectAllUsers();

    User validateUser(HashMap map);

    int selectUserByName(String account);
}