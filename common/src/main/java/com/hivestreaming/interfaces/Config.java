package com.hivestreaming.interfaces;

public interface Config {
  String getValue(String key);
  void restart();
}
