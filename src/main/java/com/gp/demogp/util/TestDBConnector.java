package com.gp.demogp.util;

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
