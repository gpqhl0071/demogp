package com.gp.demogp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gp.demogp.mapper")
//@EnableConfigurationProperties( {UserBean.class})
public class DemogpApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemogpApplication.class, args);
  }

}
