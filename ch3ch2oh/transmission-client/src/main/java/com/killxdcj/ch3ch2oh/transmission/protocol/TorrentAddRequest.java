package com.killxdcj.ch3ch2oh.transmission.protocol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TorrentAddRequest extends Request {

  private TorrentAddRequest() {
    super("torrent-add");
  }

  public static TorrentAddRequest newRequest() {
    return new TorrentAddRequest();
  }

  public TorrentAddRequest SetCookies(String cookies) {
    arguments.put("cookies", cookies);
    return this;
  }

  public TorrentAddRequest setDownloadDir(String downloadDir) {
    arguments.put("download-dir", downloadDir);
    return this;
  }

  public TorrentAddRequest setFilename(String filename) {
    arguments.put("filename", filename);
    return this;
  }

  public TorrentAddRequest setMetainfo(String metainfo) {
    arguments.put("metainfo", metainfo);
    return this;
  }

  public TorrentAddRequest setPaused(boolean paused) {
    arguments.put("paused", paused);
    return this;
  }

  public TorrentAddRequest setPeerLimit(int peerLimit) {
    arguments.put("peer-limit", peerLimit);
    return this;
  }

  public TorrentAddRequest setBandwidthPriority(int bandwidthPriority) {
    arguments.put("bandwidthPriority", bandwidthPriority);
    return this;
  }

  public TorrentAddRequest addWantedFiles(String... files) {
    List<String> wantedFiles = (List<String>) arguments.computeIfAbsent("files-wanted",
        (Function<String, List<String>>) s -> new ArrayList<>());
    wantedFiles.addAll(Arrays.asList(files));
    return this;
  }

  public TorrentAddRequest addUnWantedFiles(String... files) {
    List<String> unWantedFiles = (List<String>) arguments.computeIfAbsent("files-unwanted",
        (Function<String, List<String>>) s -> new ArrayList<>());
    unWantedFiles.addAll(Arrays.asList(files));
    return this;
  }

  public TorrentAddRequest addHighPriorityFiles(String... files) {
    List<String> highPriorityFiles = (List<String>) arguments.computeIfAbsent("priority-high",
        (Function<String, List<String>>) s -> new ArrayList<>());
    highPriorityFiles.addAll(Arrays.asList(files));
    return this;
  }

  public TorrentAddRequest addLowPriorityFiles(String... files) {
    List<String> lowPriorityFiles = (List<String>) arguments.computeIfAbsent("priority-low",
        (Function<String, List<String>>) s -> new ArrayList<>());
    lowPriorityFiles.addAll(Arrays.asList(files));
    return this;
  }

  public TorrentAddRequest addNormalPriorityFiles(String... files) {
    List<String> normalPriorityFiles = (List<String>) arguments.computeIfAbsent("priority-normal",
        (Function<String, List<String>>) s -> new ArrayList<>());
    normalPriorityFiles.addAll(Arrays.asList(files));
    return this;
  }
}
