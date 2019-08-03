package com.killxdcj.ch3ch2oh.transmission.protocol;

import com.alibaba.fastjson.JSON;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Request {

  public static final Random RANDOM = new Random();
  protected String method;
  protected Map<String, Object> arguments;
  protected int tag;

  public Request(String method) {
    this.method = method;
    arguments = new HashMap<>();
    this.tag = RANDOM.nextInt();
  }

  public String build() {
    return JSON.toJSONString(this);
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public Map<String, Object> getArguments() {
    return arguments;
  }

  public void setArguments(Map<String, Object> arguments) {
    this.arguments = arguments;
  }

  public int getTag() {
    return tag;
  }

  public void setTag(int tag) {
    this.tag = tag;
  }
}
