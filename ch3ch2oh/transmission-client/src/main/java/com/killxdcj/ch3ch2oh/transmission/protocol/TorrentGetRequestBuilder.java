package com.killxdcj.ch3ch2oh.transmission.protocol;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class TorrentGetRequestBuilder extends Request {

  public TorrentGetRequestBuilder() {
    super("torrent-get");
  }

  public static TorrentGetRequestBuilder newBuilder() {
    return new TorrentGetRequestBuilder();
  }

  public TorrentGetRequestBuilder addIds(int id) {
    List<Integer> ids = (List<Integer>) arguments.computeIfAbsent("ids",
        (Function<String, List<Integer>>) s -> new ArrayList<>());
    ids.add(id);
    return this;
  }

  public TorrentGetRequestBuilder addFileds(String filed) {
    List<String> fileds = (List<String>) arguments.computeIfAbsent("fields",
        (Function<String, List<String>>) s -> new ArrayList<>());
    fileds.add(filed);
    return this;
  }

  public TorrentGetRequestBuilder indicesWantedFields() {
    return this;
  }

  public enum FIELD {
    activityDate("activityDate");
    private String filedName;

    FIELD(String filedName) {
      this.filedName = filedName;
    }
  }
}
