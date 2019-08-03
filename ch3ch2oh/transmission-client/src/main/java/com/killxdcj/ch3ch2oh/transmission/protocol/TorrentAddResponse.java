package com.killxdcj.ch3ch2oh.transmission.protocol;

import com.alibaba.fastjson.JSON;

public class TorrentAddResponse {

  /**
   * arguments : {"torrent-added":{"hashString":"dc3d40248712c06c906b2861bdd4025266a8d12d","id":5,"name":"dc3d40248712c06c906b2861bdd4025266a8d12d"},"torrent-duplicate":{"hashString":"dc3d40248712c06c906b2861bdd4025266a8d12d","id":5,"name":"dc3d40248712c06c906b2861bdd4025266a8d12d"}}
   * result : success
   * tag : 100
   */

  private Arguments arguments;
  private String result;
  private int tag;

  public static TorrentAddResponse parseFromData(String str) {

    return JSON.parseObject(str, TorrentAddResponse.class);
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

  public int getTag() {
    return tag;
  }

  public void setTag(int tag) {
    this.tag = tag;
  }

  public static class Arguments {

    /**
     * torrent-added : {"hashString":"dc3d40248712c06c906b2861bdd4025266a8d12d","id":5,"name":"dc3d40248712c06c906b2861bdd4025266a8d12d"}
     * torrent-duplicate : {"hashString":"dc3d40248712c06c906b2861bdd4025266a8d12d","id":5,"name":"dc3d40248712c06c906b2861bdd4025266a8d12d"}
     */

    @com.alibaba.fastjson.annotation.JSONField(name = "torrent-added")
    private TorrentAdded torrentAdded;
    @com.alibaba.fastjson.annotation.JSONField(name = "torrent-duplicate")
    private TorrentDuplicate torrentDuplicate;

    public static Arguments parseFromData(String str) {

      return JSON.parseObject(str, Arguments.class);
    }

    public TorrentAdded getTorrentAdded() {
      return torrentAdded;
    }

    public void setTorrentAdded(TorrentAdded torrentAdded) {
      this.torrentAdded = torrentAdded;
    }

    public TorrentDuplicate getTorrentDuplicate() {
      return torrentDuplicate;
    }

    public void setTorrentDuplicate(TorrentDuplicate torrentDuplicate) {
      this.torrentDuplicate = torrentDuplicate;
    }

    public static class TorrentAdded {

      /**
       * hashString : dc3d40248712c06c906b2861bdd4025266a8d12d
       * id : 5
       * name : dc3d40248712c06c906b2861bdd4025266a8d12d
       */

      private String hashString;
      private int id;
      private String name;

      public static TorrentAdded parseFromData(String str) {

        return JSON.parseObject(str, TorrentAdded.class);
      }

      public String getHashString() {
        return hashString;
      }

      public void setHashString(String hashString) {
        this.hashString = hashString;
      }

      public int getId() {
        return id;
      }

      public void setId(int id) {
        this.id = id;
      }

      public String getName() {
        return name;
      }

      public void setName(String name) {
        this.name = name;
      }
    }

    public static class TorrentDuplicate {

      /**
       * hashString : dc3d40248712c06c906b2861bdd4025266a8d12d
       * id : 5
       * name : dc3d40248712c06c906b2861bdd4025266a8d12d
       */

      private String hashString;
      private int id;
      private String name;

      public static TorrentDuplicate parseFromData(String str) {

        return JSON.parseObject(str, TorrentDuplicate.class);
      }

      public String getHashString() {
        return hashString;
      }

      public void setHashString(String hashString) {
        this.hashString = hashString;
      }

      public int getId() {
        return id;
      }

      public void setId(int id) {
        this.id = id;
      }

      public String getName() {
        return name;
      }

      public void setName(String name) {
        this.name = name;
      }
    }
  }
}
