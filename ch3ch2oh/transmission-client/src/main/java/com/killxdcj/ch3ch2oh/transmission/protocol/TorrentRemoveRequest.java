package com.killxdcj.ch3ch2oh.transmission.protocol;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TorrentRemoveRequest extends Request {

  private TorrentRemoveRequest() {
    super("torrent-remove");
  }

  public static TorrentRemoveRequest newRequest() {
    return new TorrentRemoveRequest();
  }

  public TorrentRemoveRequest addIds(int id) {
    List<Integer> ids = (List<Integer>) arguments.computeIfAbsent("ids",
        (Function<String, List<Integer>>) s -> new ArrayList<>());
    ids.add(id);
    return this;
  }

  public TorrentRemoveRequest deleteLocalData(boolean delete) {
    arguments.put("delete-local-data", delete);
    return this;
  }
}
