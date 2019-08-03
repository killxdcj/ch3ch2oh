package com.killxdcj.ch3ch2oh.transmission.protocol;

import com.alibaba.fastjson.JSON;
import java.util.Map;
import java.util.Random;

public class Request {

  public static final Random RANDOM = new Random();
  protected String method;
  protected Map<String, Object> arguments;
  protected long tag;

  public Request(String method) {
    this.method = method;
    this.tag = RANDOM.nextLong();
  }

  public String build() {
    return JSON.toJSONString(this);
  }
}
