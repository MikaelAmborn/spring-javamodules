package com.hivestreaming.config;

import com.hivestreaming.interfaces.Config;
import com.hivestreaming.interfaces.Restarter;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ConfigImpl implements Config {

  private Restarter restarter;

  @Autowired
  public void ConfigImpl(Restarter restarter) {
    this.restarter = restarter;
  }

  public void restart() {
    System.out.println("Config: calling restart");
    restarter.niceRestart();
  }

  public String getValue(String key) {
    return "The value you asked for";
  }
}
