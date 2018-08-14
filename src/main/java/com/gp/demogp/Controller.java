package com.gp.demogp;

import com.gp.demogp.bean.SchoolBean;
import com.gp.demogp.bean.UserBean;
import com.gp.demogp.service.UserService;
import com.gp.demogp.util.DBConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class Controller {
  private final Logger log = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private UserBean userBean;
  @Autowired
  private DBConnector connector;
  @Autowired
  private UserService userService;

  @RequestMapping("/getName")
  public String getName() {
    return "my name is " + userBean.getName() + ", dbConnector is " + connector.configure();
  }

  @RequestMapping("/getUserList")
  public String getUserList() {
    List<Map> list = userService.queryList();
    for (Map map : list) {
      log.info("UserName is :{}", map.get("real_name"));
    }

    return "=========";
  }

  @RequestMapping("/")
  public ModelAndView index() {
    log.info("-------------------------------");
    List schoolList = new ArrayList();

    SchoolBean schoolBean = new SchoolBean();
    schoolBean.setAddress("北京海淀小胡同");
    schoolBean.setLevel("1");
    schoolBean.setName("北京大学");

    SchoolBean schoolBean2 = new SchoolBean();
    schoolBean2.setAddress("北京海淀大胡同");
    schoolBean2.setLevel("2");
    schoolBean2.setName("清华大学");

    schoolList.add(schoolBean);
    schoolList.add(schoolBean2);

    ModelAndView modelAndView = new ModelAndView("/index");
    modelAndView.addObject("schoolList", schoolList);
    return modelAndView;
  }
}
