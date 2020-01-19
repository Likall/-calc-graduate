package pers.ll.gacs.dao;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pers.ll.gacs.po.User;
import pers.ll.gacs.po.UserExample;

public interface UserMapper {

    List<User> selectAllUsers();

    User validateUser(HashMap map);

    int selectUserByName(String account);
}