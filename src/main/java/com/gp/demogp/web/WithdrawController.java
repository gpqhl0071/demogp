package com.gp.demogp.web;

import com.gp.demogp.bean.WithdrawBean;
import com.gp.demogp.service.WithdrawService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author gao peng
 * @date 2018/5/22 17:24
 */
@RestController
@RequestMapping(path = "/withdrawController")
public class WithdrawController {
  private final Logger log = LoggerFactory.getLogger(this.getClass());
  @Autowired
  private WithdrawService withdrawService;

  @RequestMapping("/getInfo")
  public String getInfo() {
    List<WithdrawBean> withdrawList = withdrawService.queryList();
    for (WithdrawBean withdrawBean : withdrawList) {
      log.info("读取记录：{}", withdrawBean.toString());
    }

    return "success";
  }
}
