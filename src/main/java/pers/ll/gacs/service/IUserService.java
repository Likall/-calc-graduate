package pers.ll.gacs.service;

import pers.ll.gacs.po.User;

import java.util.List;


public interface IUserService {

    public List<User> getUsers();

    User login(String userName, String password);

    boolean existUser(String userName);
}
