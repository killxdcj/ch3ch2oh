package com.killxdcj.ch3ch2oh.transmission.protocol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TorrentAddRequestBuilder extends Request {

  public TorrentAddRequestBuilder() {
    super("torrent-add");
  }

  public static TorrentAddRequestBuilder newBuilder() {
    return new TorrentAddRequestBuilder();
  }

  public TorrentAddRequestBuilder SetCookies(String cookies) {
    arguments.put("cookies", cookies);
    return this;
  }

  public TorrentAddRequestBuilder setDownloadDir(String downloadDir) {
    arguments.put("download-dir", downloadDir);
    return this;
  }

  public TorrentAddRequestBuilder setFilename(String filename) {
    arguments.put("filename", filename);
    return this;
  }

  public TorrentAddRequestBuilder setMetainfo(String metainfo) {
    arguments.put("metainfo", metainfo);
    return this;
  }

  public TorrentAddRequestBuilder setPaused(boolean paused) {
    arguments.put("paused", paused);
    return this;
  }

  public TorrentAddRequestBuilder setPeerLimit(int peerLimit) {
    arguments.put("peer-limit", peerLimit);
    return this;
  }

  public TorrentAddRequestBuilder setBandwidthPriority(int bandwidthPriority) {
    arguments.put("bandwidthPriority", bandwidthPriority);
    return this;
  }

  public TorrentAddRequestBuilder indicesWantedFiles(String... files) {
    List<String> wantedFiles = (List<String>) arguments.computeIfAbsent("files-wanted",
        (Function<String, List<String>>) s -> new ArrayList<>());
    wantedFiles.addAll(Arrays.asList(files));
    return this;
  }

  public TorrentAddRequestBuilder indicesUnWantedFiles(String... files) {
    List<String> unWantedFiles = (List<String>) arguments.computeIfAbsent("files-unwanted",
        (Function<String, List<String>>) s -> new ArrayList<>());
    unWantedFiles.addAll(Arrays.asList(files));
    return this;
  }

  public TorrentAddRequestBuilder indicesHighPriorityFiles(String... files) {
    List<String> highPriorityFiles = (List<String>) arguments.computeIfAbsent("priority-high",
        (Function<String, List<String>>) s -> new ArrayList<>());
    highPriorityFiles.addAll(Arrays.asList(files));
    return this;
  }

  public TorrentAddRequestBuilder indicesLowPriorityFiles(String... files) {
    List<String> lowPriorityFiles = (List<String>) arguments.computeIfAbsent("priority-low",
        (Function<String, List<String>>) s -> new ArrayList<>());
    lowPriorityFiles.addAll(Arrays.asList(files));
    return this;
  }

  public TorrentAddRequestBuilder indicesNormalPriorityFiles(String... files) {
    List<String> normalPriorityFiles = (List<String>) arguments.computeIfAbsent("priority-normal",
        (Function<String, List<String>>) s -> new ArrayList<>());
    normalPriorityFiles.addAll(Arrays.asList(files));
    return this;
  }
}
