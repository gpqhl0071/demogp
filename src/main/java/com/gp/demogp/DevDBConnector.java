package com.gp.demogp;

import com.gp.demogp.inter.DBConnector;
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
