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
public interface TableInfo {

  public List<Map<String, Object>> queryTableName();

  public List<Map<String, Object>> queryColoums(@Param("tableName") String tableName);
}
