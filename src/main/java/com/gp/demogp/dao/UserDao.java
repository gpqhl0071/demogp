package com.gp.demogp.dao;

import com.gp.demogp.dao.impl.UserDaoImpl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface UserDao {

  @SelectProvider(type = UserDaoImpl.class, method = "queryList")
  public List<Map<String, Object>> queryList();
}
