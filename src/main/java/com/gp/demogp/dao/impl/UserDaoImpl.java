package com.gp.demogp.dao.impl;

public class UserDaoImpl {
  public String queryList() {
    StringBuffer sql = new StringBuffer();
    sql.append("select * from t_user order by id desc limit 10");
    return sql.toString();
  }
}
