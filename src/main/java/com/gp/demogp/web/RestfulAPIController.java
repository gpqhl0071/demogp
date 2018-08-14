package com.gp.demogp.web;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gao peng
 * @date 2018/8/14 17:36
 */
@RestController
@RequestMapping(path = "/restfulAPIController")
public class RestfulAPIController {

  @ApiOperation(value = "测试接口", notes = "测试接口DEMO")
  @RequestMapping(value = "/demo", method = RequestMethod.GET)
  public Map getInfo() {
    Map map = new HashMap();
    map.put("name", "zhangsan");
    map.put("sex", "boy");

    return map;
  }
}
