package com.gp.demogp.dao;

import com.gp.demogp.dao.impl.TableInfoImpl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author gao peng
 * @date 2018/5/23 11:20
 */
@Component
@Mapper
public interface TableInfo {

  @Select("select t.TABLE_NAME,t.TABLE_COMMENT from information_schema.`TABLES` as t where t.TABLE_NAME like 't_%'")
  public List<Map<String, Object>> queryTableName();

  @SelectProvider(type = TableInfoImpl.class, method = "queryColoums")
  public List<Map<String, Object>> queryColoums(@Param("tableName") String tableName);
}
