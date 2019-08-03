package com.killxdcj.ch3ch2oh.transmission.protocol;

import com.alibaba.fastjson.JSON;

public class TorrentRemoveResponse {

  /**
   * arguments : {}
   * result : success
   */

  private Arguments arguments;
  private String result;

  public static TorrentRemoveResponse parseFromData(String str) {

    return JSON.parseObject(str, TorrentRemoveResponse.class);
  }

  public Arguments getArguments() {
    return arguments;
  }

  public void setArguments(Arguments arguments) {
    this.arguments = arguments;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public static class Arguments {

    public static Arguments parseFromData(String str) {

      return JSON.parseObject(str, Arguments.class);
    }
  }
}
