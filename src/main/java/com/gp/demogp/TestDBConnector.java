package com.gp.demogp;

import com.gp.demogp.inter.DBConnector;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class TestDBConnector implements DBConnector {
  @Override
  public String configure() {
    return "proddb";
  }
}
