package com.gp.demogp.mapper.impl;

import org.apache.ibatis.annotations.Param;

/**
 * @author gao peng
 * @date 2018/5/23 14:59
 */
public class TableInfoImpl {

  public String queryColoums(@Param("tableName") final String tableName) {

    StringBuffer sql = new StringBuffer();
    sql.append("select a.COLUMN_NAME,a.COLUMN_COMMENT,a.DATA_TYPE from information_schema.COLUMNS as a where a.TABLE_NAME = " +
      "'" + tableName + "'");

    return sql.toString();
  }
}
