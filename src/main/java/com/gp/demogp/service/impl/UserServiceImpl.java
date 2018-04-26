package com.gp.demogp.service.impl;

import com.gp.demogp.dao.UserDao;
import com.gp.demogp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserDao userDao;

  @Override
  public List queryList() {
    return userDao.queryList();
  }
}
