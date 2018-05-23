package com.gp.demogp.service;

import java.util.List;
import java.util.Map;

/**
 * @author gao peng
 * @date 2018/5/23 11:24
 */
public interface TableService {

  public List<Map<String, Object>> queryTableName();

  public List<Map<String, Object>> queryColoums(String tableName);
}
