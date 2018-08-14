package com.gp.demogp.service.impl;

import com.gp.demogp.mapper.TableInfo;
import com.gp.demogp.service.TableService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author gao peng
 * @date 2018/5/23 11:25
 */
@Service
public class TableServiceImpl implements TableService {
  private final Logger log = LoggerFactory.getLogger(this.getClass());
  @Autowired
  private TableInfo tableInfo;

  @Override
  public List<Map<String, Object>> queryTableName() {

    List<Map<String, Object>> tableList = tableInfo.queryTableName();

    for (Map<String, Object> table : tableList) {
      log.info("数据库名称：{}，数据库备注：{}", table.get("TABLE_NAME"), table.get("TABLE_COMMENT"));
    }

    return tableList;
  }

  /**
   * 根据表名称，查询字段
   *
   * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
   * @param: [tableName]
   * @author gao peng
   * @date 2018/5/23 15:12
   */
  public List<Map<String, Object>> queryColoums(String tableName) {
    List<Map<String, Object>> columsList = tableInfo.queryColoums(tableName);

    for (Map<String, Object> columsMap : columsList) {
      String columnName = (String) columsMap.get("COLUMN_NAME");
      String[] strs = columnName.split("_");

      StringBuffer beanName = new StringBuffer();
      for (int i = 0; i < strs.length; i++) {
        if (i == 0) {
          // 首字母小写
          beanName.append(strs[i].toLowerCase());
        } else {
          beanName.append((char) (strs[i].charAt(0) - 32));
          beanName.append(strs[i].substring(1, strs[i].length()));
        }
      }

      columsMap.put("beanName", beanName);
    }

    return columsList;
  }

  public static void main(String[] args) {
    String s = "abcder";
    char c = s.charAt(0);
    if (c >= 'A' && c <= 'Z') {
      c += 32;
      System.out.println("这里的大写" + (char) (c - 32) + "被转换成了" + c);
      System.out.println("这里的大写" + (c - 32) + "被转换成了" + c);
    } else if (c >= 'a' && c <= 'z') {
      c -= 32;
      System.out.println("这里的小写" + (char) (c + 32) + "被转换成了" + c);
      System.out.println("这里的小写" + (c + 32) + "被转换成了" + c);
    }
  }
}
