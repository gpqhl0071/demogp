package com.gp.demogp.util;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDBConnector implements DBConnector {
  @Override
  public String configure() {
    return "devdb";
  }
}
