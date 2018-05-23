package com.gp.demogp.web;

import com.gp.demogp.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author gao peng
 * @date 2018/5/23 11:28
 */
@RestController
@RequestMapping(path = "table")
public class TableController {
  @Autowired
  private TableService tableService;

  @RequestMapping(path = "getTable")
  public ModelAndView getTable() {
    List tableList = tableService.queryTableName();

    ModelAndView modelAndView = new ModelAndView("/table.html");
    modelAndView.addObject("tableList", tableList);
    return modelAndView;
  }

  @RequestMapping(path = "getColums/{tableName}")
  public ModelAndView getColums(@PathVariable String tableName) {
    List columsList = tableService.queryColoums(tableName);

    ModelAndView modelAndView = new ModelAndView("/colums.html");
    modelAndView.addObject("columsList", columsList);
    modelAndView.addObject("tableName", tableName);
    return modelAndView;
  }
}
