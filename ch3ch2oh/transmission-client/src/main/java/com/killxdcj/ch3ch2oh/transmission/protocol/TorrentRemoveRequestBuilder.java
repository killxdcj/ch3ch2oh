package com.killxdcj.ch3ch2oh.transmission.protocol;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TorrentRemoveRequestBuilder extends Request {

  public TorrentRemoveRequestBuilder() {
    super("torrent-remove");
  }

  public static TorrentRemoveRequestBuilder newBuilder() {
    return new TorrentRemoveRequestBuilder();
  }

  public TorrentRemoveRequestBuilder addIds(int id) {
    List<Integer> ids = (List<Integer>) arguments.computeIfAbsent("ids",
        (Function<String, List<Integer>>) s -> new ArrayList<>());
    ids.add(id);
    return this;
  }

  public TorrentRemoveRequestBuilder deleteLocalData(boolean delete) {
    arguments.put("delete-local-data", delete);
    return this;
  }
}
