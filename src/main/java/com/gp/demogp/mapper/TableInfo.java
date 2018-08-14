package com.gp.demogp.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author gao peng
 * @date 2018/5/23 11:20
 */
public interface TableInfo {

  public List<Map<String, Object>> queryTableName();

  public List<Map<String, Object>> queryColoums(@Param("tableName") String tableName);
}
