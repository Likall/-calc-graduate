package pers.ll.gacs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import pers.ll.gacs.dao.UserMapper;
import pers.ll.gacs.po.User;

import java.util.HashMap;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
    public User login(String account, String password) {
        HashMap<String, String> map = new HashMap<>();
        map.put("account", account);
        map.put("password", password);
        User user = userMapper.validateUser(map);
        if (ObjectUtils.isEmpty(user)) {
            return null;
        }
        return user;
    }

    @Override
    public boolean existUser(String account) {
        return userMapper.selectUserByName(account) > 0;
    }
}
