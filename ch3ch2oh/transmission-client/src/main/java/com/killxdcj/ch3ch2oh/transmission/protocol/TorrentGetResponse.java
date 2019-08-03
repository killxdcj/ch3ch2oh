package com.killxdcj.ch3ch2oh.transmission.protocol;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

public class TorrentGetResponse {

  /**
   * arguments : {"torrents":[{"activityDate":1564825978,"addedDate":1564815725,"bandwidthPriority":0,"comment":"","corruptEver":0,"creator":"","dateCreated":0,"desiredAvailable":0,"doneDate":1564819189,"downloadDir":"/data/transmission/Downloads","downloadLimit":100,"downloadLimited":false,"downloadedEver":2128123977,"error":0,"errorString":"","eta":-1,"etaIdle":-1,"fileStats":[{"bytesCompleted":2126315353,"priority":0,"wanted":true},{"bytesCompleted":134028,"priority":0,"wanted":true},{"bytesCompleted":68,"priority":0,"wanted":true},{"bytesCompleted":68,"priority":0,"wanted":true}],"files":[{"bytesCompleted":2126315353,"length":2126315353,"name":"复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601/复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601.mp4"},{"bytesCompleted":134028,"length":134028,"name":"复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601/复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601.mp4.jpg"},{"bytesCompleted":68,"length":68,"name":"复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601/最新电影请访问Bt601.Com.txt"},{"bytesCompleted":68,"length":68,"name":"复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601/备用域名.txt"}],"hashString":"3d3fa56ab2bf1e651f9c63d51f33a3355d8f0008","haveUnchecked":0,"haveValid":2126449517,"honorsSessionLimits":true,"id":2,"isFinished":false,"isPrivate":false,"isStalled":false,"leftUntilDone":0,"magnetLink":"magnet:?xt=urn:btih:3d3fa56ab2bf1e651f9c63d51f33a3355d8f0008&dn=%E5%A4%8D%E4%BB%87%E8%80%85%E8%81%94%E7%9B%9F4%EF%BC%9A%E7%BB%88%E5%B1%80%E4%B9%8B%E6%88%98.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-%E4%B8%AD%E8%8B%B1%E5%8F%8C%E5%AD%97-BT601","manualAnnounceTime":-1,"maxConnectedPeers":50,"metadataPercentComplete":1,"name":"复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601","peer-limit":50,"peers":[{"address":"14.153.202.188","clientIsChoked":true,"clientIsInterested":false,"clientName":"Thunder 0.1.0.0","flagStr":"TUXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":true,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":11283,"progress":0.2021,"rateToClient":0,"rateToPeer":14000},{"address":"37.201.195.70","clientIsChoked":true,"clientIsInterested":false,"clientName":"BitComet 1.56","flagStr":"UXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":21804,"progress":0.0276,"rateToClient":0,"rateToPeer":12000},{"address":"101.88.52.72","clientIsChoked":true,"clientIsInterested":false,"clientName":"Thunder 0.1.0.0","flagStr":"UEXI","isDownloadingFrom":false,"isEncrypted":true,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":11874,"progress":0.5601,"rateToClient":0,"rateToPeer":7000},{"address":"111.30.247.157","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.8","flagStr":"UXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":12345,"progress":0,"rateToClient":0,"rateToPeer":7000},{"address":"112.41.17.180","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.2","flagStr":"UHI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":80,"progress":0.3096,"rateToClient":0,"rateToPeer":21000},{"address":"112.50.67.231","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.8","flagStr":"TUI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":true,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":63082,"progress":0,"rateToClient":0,"rateToPeer":0},{"address":"115.60.10.108","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.2","flagStr":"TUI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":true,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":15000,"progress":0,"rateToClient":0,"rateToPeer":10000},{"address":"115.187.183.203","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.2","flagStr":"TUXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":true,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":15000,"progress":0,"rateToClient":0,"rateToPeer":7000},{"address":"117.81.219.41","clientIsChoked":true,"clientIsInterested":false,"clientName":"Transmission 2.93","flagStr":"UEI","isDownloadingFrom":false,"isEncrypted":true,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":16881,"progress":0.4487,"rateToClient":0,"rateToPeer":13000},{"address":"117.183.147.39","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.2","flagStr":"?EXI","isDownloadingFrom":false,"isEncrypted":true,"isIncoming":true,"isUTP":false,"isUploadingTo":false,"peerIsChoked":false,"peerIsInterested":false,"port":15000,"progress":0,"rateToClient":0,"rateToPeer":0},{"address":"118.168.165.57","clientIsChoked":true,"clientIsInterested":false,"clientName":"BitComet 1.49","flagStr":"UXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":16546,"progress":0.1341,"rateToClient":0,"rateToPeer":7000},{"address":"125.224.241.125","clientIsChoked":true,"clientIsInterested":false,"clientName":"BitComet 1.49","flagStr":"OUXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":14463,"progress":0.0039,"rateToClient":0,"rateToPeer":9000},{"address":"219.145.220.53","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.2","flagStr":"TUXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":true,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":15000,"progress":0,"rateToClient":0,"rateToPeer":16000},{"address":"222.164.206.48","clientIsChoked":true,"clientIsInterested":false,"clientName":"BitTorrent 7.0.5","flagStr":"TUE","isDownloadingFrom":false,"isEncrypted":true,"isIncoming":false,"isUTP":true,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":57271,"progress":0.7731,"rateToClient":0,"rateToPeer":0},{"address":"223.90.138.225","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.8","flagStr":"UI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":64842,"progress":0,"rateToClient":0,"rateToPeer":2000}],"peersConnected":15,"peersFrom":{"fromCache":0,"fromDht":1,"fromIncoming":5,"fromLpd":0,"fromLtep":0,"fromPex":9,"fromTracker":0},"peersGettingFromUs":14,"peersSendingToUs":0,"percentDone":1,"pieceCount":1014,"pieceSize":2097152,"pieces":"/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////A==","priorities":[0,0,0,0],"queuePosition":1,"rateDownload":0,"rateUpload":129000,"recheckProgress":0,"secondsDownloading":3490,"secondsSeeding":6810,"seedIdleLimit":30,"seedIdleMode":0,"seedRatioLimit":2,"seedRatioMode":0,"sizeWhenDone":2126449517,"startDate":1564815851,"status":6,"torrentFile":"/var/lib/transmission/.config/transmission-daemon/torrents/复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601.3d3fa56ab2bf1e65.torrent","totalSize":2126449517,"trackerStats":[{"announce":"announce","announceState":1,"downloadCount":10,"hasAnnounced":true,"hasScraped":false,"host":"host","id":1,"isBackup":true,"lastAnnouncePeerCount":1,"lastAnnounceResult":"lastAnnounceResult","lastAnnounceStartTime":1,"lastAnnounceSucceeded":true,"lastAnnounceTime":1,"lastAnnounceTimedOut":true,"lastScrapeResult":"lastScrapeResult","lastScrapeStartTime":1,"lastScrapeSucceeded":true,"lastScrapeTime":1,"lastScrapeTimedOut":true,"leecherCount":1,"nextAnnounceTime":1,"nextScrapeTime":1,"scrape":"scrape","scrapeState":1,"seederCount":1,"tier":1}],"trackers":[{"announce":"announce","scrape":"scrape","id":100,"tier":100}],"uploadLimit":100,"uploadLimited":false,"uploadRatio":0.4486,"uploadedEver":954709030,"wanted":[1,1,1,1],"webseeds":["webseeds1","webseeds2"],"webseedsSendingToUs":0}]}
   * result : success
   */

  private Arguments arguments;
  private String result;

  public static TorrentGetResponse parseFromData(String str) {

    return JSON.parseObject(str, TorrentGetResponse.class);
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

    private List<Torrents> torrents;

    public static Arguments parseFromData(String str) {

      return JSON.parseObject(str, Arguments.class);
    }

    public List<Torrents> getTorrents() {
      return torrents;
    }

    public void setTorrents(List<Torrents> torrents) {
      this.torrents = torrents;
    }

    public static class Torrents {

      /**
       * activityDate : 1564825978
       * addedDate : 1564815725
       * bandwidthPriority : 0
       * comment :
       * corruptEver : 0
       * creator :
       * dateCreated : 0
       * desiredAvailable : 0
       * doneDate : 1564819189
       * downloadDir : /data/transmission/Downloads
       * downloadLimit : 100
       * downloadLimited : false
       * downloadedEver : 2128123977
       * error : 0
       * errorString :
       * eta : -1
       * etaIdle : -1
       * fileStats : [{"bytesCompleted":2126315353,"priority":0,"wanted":true},{"bytesCompleted":134028,"priority":0,"wanted":true},{"bytesCompleted":68,"priority":0,"wanted":true},{"bytesCompleted":68,"priority":0,"wanted":true}]
       * files : [{"bytesCompleted":2126315353,"length":2126315353,"name":"复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601/复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601.mp4"},{"bytesCompleted":134028,"length":134028,"name":"复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601/复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601.mp4.jpg"},{"bytesCompleted":68,"length":68,"name":"复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601/最新电影请访问Bt601.Com.txt"},{"bytesCompleted":68,"length":68,"name":"复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601/备用域名.txt"}]
       * hashString : 3d3fa56ab2bf1e651f9c63d51f33a3355d8f0008
       * haveUnchecked : 0
       * haveValid : 2126449517
       * honorsSessionLimits : true
       * id : 2
       * isFinished : false
       * isPrivate : false
       * isStalled : false
       * leftUntilDone : 0
       * magnetLink : magnet:?xt=urn:btih:3d3fa56ab2bf1e651f9c63d51f33a3355d8f0008&dn=%E5%A4%8D%E4%BB%87%E8%80%85%E8%81%94%E7%9B%9F4%EF%BC%9A%E7%BB%88%E5%B1%80%E4%B9%8B%E6%88%98.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-%E4%B8%AD%E8%8B%B1%E5%8F%8C%E5%AD%97-BT601
       * manualAnnounceTime : -1
       * maxConnectedPeers : 50
       * metadataPercentComplete : 1
       * name : 复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601
       * peer-limit : 50
       * peers : [{"address":"14.153.202.188","clientIsChoked":true,"clientIsInterested":false,"clientName":"Thunder 0.1.0.0","flagStr":"TUXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":true,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":11283,"progress":0.2021,"rateToClient":0,"rateToPeer":14000},{"address":"37.201.195.70","clientIsChoked":true,"clientIsInterested":false,"clientName":"BitComet 1.56","flagStr":"UXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":21804,"progress":0.0276,"rateToClient":0,"rateToPeer":12000},{"address":"101.88.52.72","clientIsChoked":true,"clientIsInterested":false,"clientName":"Thunder 0.1.0.0","flagStr":"UEXI","isDownloadingFrom":false,"isEncrypted":true,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":11874,"progress":0.5601,"rateToClient":0,"rateToPeer":7000},{"address":"111.30.247.157","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.8","flagStr":"UXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":12345,"progress":0,"rateToClient":0,"rateToPeer":7000},{"address":"112.41.17.180","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.2","flagStr":"UHI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":80,"progress":0.3096,"rateToClient":0,"rateToPeer":21000},{"address":"112.50.67.231","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.8","flagStr":"TUI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":true,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":63082,"progress":0,"rateToClient":0,"rateToPeer":0},{"address":"115.60.10.108","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.2","flagStr":"TUI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":true,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":15000,"progress":0,"rateToClient":0,"rateToPeer":10000},{"address":"115.187.183.203","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.2","flagStr":"TUXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":true,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":15000,"progress":0,"rateToClient":0,"rateToPeer":7000},{"address":"117.81.219.41","clientIsChoked":true,"clientIsInterested":false,"clientName":"Transmission 2.93","flagStr":"UEI","isDownloadingFrom":false,"isEncrypted":true,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":16881,"progress":0.4487,"rateToClient":0,"rateToPeer":13000},{"address":"117.183.147.39","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.2","flagStr":"?EXI","isDownloadingFrom":false,"isEncrypted":true,"isIncoming":true,"isUTP":false,"isUploadingTo":false,"peerIsChoked":false,"peerIsInterested":false,"port":15000,"progress":0,"rateToClient":0,"rateToPeer":0},{"address":"118.168.165.57","clientIsChoked":true,"clientIsInterested":false,"clientName":"BitComet 1.49","flagStr":"UXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":16546,"progress":0.1341,"rateToClient":0,"rateToPeer":7000},{"address":"125.224.241.125","clientIsChoked":true,"clientIsInterested":false,"clientName":"BitComet 1.49","flagStr":"OUXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":14463,"progress":0.0039,"rateToClient":0,"rateToPeer":9000},{"address":"219.145.220.53","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.2","flagStr":"TUXI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":true,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":15000,"progress":0,"rateToClient":0,"rateToPeer":16000},{"address":"222.164.206.48","clientIsChoked":true,"clientIsInterested":false,"clientName":"BitTorrent 7.0.5","flagStr":"TUE","isDownloadingFrom":false,"isEncrypted":true,"isIncoming":false,"isUTP":true,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":57271,"progress":0.7731,"rateToClient":0,"rateToPeer":0},{"address":"223.90.138.225","clientIsChoked":true,"clientIsInterested":false,"clientName":"Xunlei 0.0.1.8","flagStr":"UI","isDownloadingFrom":false,"isEncrypted":false,"isIncoming":true,"isUTP":false,"isUploadingTo":true,"peerIsChoked":false,"peerIsInterested":true,"port":64842,"progress":0,"rateToClient":0,"rateToPeer":2000}]
       * peersConnected : 15
       * peersFrom : {"fromCache":0,"fromDht":1,"fromIncoming":5,"fromLpd":0,"fromLtep":0,"fromPex":9,"fromTracker":0}
       * peersGettingFromUs : 14
       * peersSendingToUs : 0
       * percentDone : 1
       * pieceCount : 1014
       * pieceSize : 2097152
       * pieces : /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////A==
       * priorities : [0,0,0,0]
       * queuePosition : 1
       * rateDownload : 0
       * rateUpload : 129000
       * recheckProgress : 0
       * secondsDownloading : 3490
       * secondsSeeding : 6810
       * seedIdleLimit : 30
       * seedIdleMode : 0
       * seedRatioLimit : 2
       * seedRatioMode : 0
       * sizeWhenDone : 2126449517
       * startDate : 1564815851
       * status : 6
       * torrentFile : /var/lib/transmission/.config/transmission-daemon/torrents/复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601.3d3fa56ab2bf1e65.torrent
       * totalSize : 2126449517
       * trackerStats : [{"announce":"announce","announceState":1,"downloadCount":10,"hasAnnounced":true,"hasScraped":false,"host":"host","id":1,"isBackup":true,"lastAnnouncePeerCount":1,"lastAnnounceResult":"lastAnnounceResult","lastAnnounceStartTime":1,"lastAnnounceSucceeded":true,"lastAnnounceTime":1,"lastAnnounceTimedOut":true,"lastScrapeResult":"lastScrapeResult","lastScrapeStartTime":1,"lastScrapeSucceeded":true,"lastScrapeTime":1,"lastScrapeTimedOut":true,"leecherCount":1,"nextAnnounceTime":1,"nextScrapeTime":1,"scrape":"scrape","scrapeState":1,"seederCount":1,"tier":1}]
       * trackers : [{"announce":"announce","scrape":"scrape","id":100,"tier":100}]
       * uploadLimit : 100
       * uploadLimited : false
       * uploadRatio : 0.4486
       * uploadedEver : 954709030
       * wanted : [1,1,1,1]
       * webseeds : ["webseeds1","webseeds2"]
       * webseedsSendingToUs : 0
       */

      private int activityDate;
      private int addedDate;
      private int bandwidthPriority;
      private String comment;
      private int corruptEver;
      private String creator;
      private int dateCreated;
      private int desiredAvailable;
      private int doneDate;
      private String downloadDir;
      private int downloadLimit;
      private boolean downloadLimited;
      private int downloadedEver;
      private int error;
      private String errorString;
      private int eta;
      private int etaIdle;
      private String hashString;
      private int haveUnchecked;
      private int haveValid;
      private boolean honorsSessionLimits;
      private int id;
      private boolean isFinished;
      private boolean isPrivate;
      private boolean isStalled;
      private int leftUntilDone;
      private String magnetLink;
      private int manualAnnounceTime;
      private int maxConnectedPeers;
      private int metadataPercentComplete;
      private String name;
      @JSONField(name = "peer-limit")
      private int peerlimit;
      private int peersConnected;
      private PeersFrom peersFrom;
      private int peersGettingFromUs;
      private int peersSendingToUs;
      private int percentDone;
      private int pieceCount;
      private int pieceSize;
      private String pieces;
      private int queuePosition;
      private int rateDownload;
      private int rateUpload;
      private int recheckProgress;
      private int secondsDownloading;
      private int secondsSeeding;
      private int seedIdleLimit;
      private int seedIdleMode;
      private int seedRatioLimit;
      private int seedRatioMode;
      private int sizeWhenDone;
      private int startDate;
      private int status;
      private String torrentFile;
      private int totalSize;
      private int uploadLimit;
      private boolean uploadLimited;
      private double uploadRatio;
      private int uploadedEver;
      private int webseedsSendingToUs;
      private List<FileStats> fileStats;
      private List<Files> files;
      private List<Peers> peers;
      private List<Integer> priorities;
      private List<TrackerStats> trackerStats;
      private List<Trackers> trackers;
      private List<Integer> wanted;
      private List<String> webseeds;

      public static Torrents parseFromData(String str) {

        return JSON.parseObject(str, Torrents.class);
      }

      public int getActivityDate() {
        return activityDate;
      }

      public void setActivityDate(int activityDate) {
        this.activityDate = activityDate;
      }

      public int getAddedDate() {
        return addedDate;
      }

      public void setAddedDate(int addedDate) {
        this.addedDate = addedDate;
      }

      public int getBandwidthPriority() {
        return bandwidthPriority;
      }

      public void setBandwidthPriority(int bandwidthPriority) {
        this.bandwidthPriority = bandwidthPriority;
      }

      public String getComment() {
        return comment;
      }

      public void setComment(String comment) {
        this.comment = comment;
      }

      public int getCorruptEver() {
        return corruptEver;
      }

      public void setCorruptEver(int corruptEver) {
        this.corruptEver = corruptEver;
      }

      public String getCreator() {
        return creator;
      }

      public void setCreator(String creator) {
        this.creator = creator;
      }

      public int getDateCreated() {
        return dateCreated;
      }

      public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
      }

      public int getDesiredAvailable() {
        return desiredAvailable;
      }

      public void setDesiredAvailable(int desiredAvailable) {
        this.desiredAvailable = desiredAvailable;
      }

      public int getDoneDate() {
        return doneDate;
      }

      public void setDoneDate(int doneDate) {
        this.doneDate = doneDate;
      }

      public String getDownloadDir() {
        return downloadDir;
      }

      public void setDownloadDir(String downloadDir) {
        this.downloadDir = downloadDir;
      }

      public int getDownloadLimit() {
        return downloadLimit;
      }

      public void setDownloadLimit(int downloadLimit) {
        this.downloadLimit = downloadLimit;
      }

      public boolean isDownloadLimited() {
        return downloadLimited;
      }

      public void setDownloadLimited(boolean downloadLimited) {
        this.downloadLimited = downloadLimited;
      }

      public int getDownloadedEver() {
        return downloadedEver;
      }

      public void setDownloadedEver(int downloadedEver) {
        this.downloadedEver = downloadedEver;
      }

      public int getError() {
        return error;
      }

      public void setError(int error) {
        this.error = error;
      }

      public String getErrorString() {
        return errorString;
      }

      public void setErrorString(String errorString) {
        this.errorString = errorString;
      }

      public int getEta() {
        return eta;
      }

      public void setEta(int eta) {
        this.eta = eta;
      }

      public int getEtaIdle() {
        return etaIdle;
      }

      public void setEtaIdle(int etaIdle) {
        this.etaIdle = etaIdle;
      }

      public String getHashString() {
        return hashString;
      }

      public void setHashString(String hashString) {
        this.hashString = hashString;
      }

      public int getHaveUnchecked() {
        return haveUnchecked;
      }

      public void setHaveUnchecked(int haveUnchecked) {
        this.haveUnchecked = haveUnchecked;
      }

      public int getHaveValid() {
        return haveValid;
      }

      public void setHaveValid(int haveValid) {
        this.haveValid = haveValid;
      }

      public boolean isHonorsSessionLimits() {
        return honorsSessionLimits;
      }

      public void setHonorsSessionLimits(boolean honorsSessionLimits) {
        this.honorsSessionLimits = honorsSessionLimits;
      }

      public int getId() {
        return id;
      }

      public void setId(int id) {
        this.id = id;
      }

      public boolean isIsFinished() {
        return isFinished;
      }

      public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
      }

      public boolean isIsPrivate() {
        return isPrivate;
      }

      public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
      }

      public boolean isIsStalled() {
        return isStalled;
      }

      public void setIsStalled(boolean isStalled) {
        this.isStalled = isStalled;
      }

      public int getLeftUntilDone() {
        return leftUntilDone;
      }

      public void setLeftUntilDone(int leftUntilDone) {
        this.leftUntilDone = leftUntilDone;
      }

      public String getMagnetLink() {
        return magnetLink;
      }

      public void setMagnetLink(String magnetLink) {
        this.magnetLink = magnetLink;
      }

      public int getManualAnnounceTime() {
        return manualAnnounceTime;
      }

      public void setManualAnnounceTime(int manualAnnounceTime) {
        this.manualAnnounceTime = manualAnnounceTime;
      }

      public int getMaxConnectedPeers() {
        return maxConnectedPeers;
      }

      public void setMaxConnectedPeers(int maxConnectedPeers) {
        this.maxConnectedPeers = maxConnectedPeers;
      }

      public int getMetadataPercentComplete() {
        return metadataPercentComplete;
      }

      public void setMetadataPercentComplete(int metadataPercentComplete) {
        this.metadataPercentComplete = metadataPercentComplete;
      }

      public String getName() {
        return name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public int getPeerlimit() {
        return peerlimit;
      }

      public void setPeerlimit(int peerlimit) {
        this.peerlimit = peerlimit;
      }

      public int getPeersConnected() {
        return peersConnected;
      }

      public void setPeersConnected(int peersConnected) {
        this.peersConnected = peersConnected;
      }

      public PeersFrom getPeersFrom() {
        return peersFrom;
      }

      public void setPeersFrom(PeersFrom peersFrom) {
        this.peersFrom = peersFrom;
      }

      public int getPeersGettingFromUs() {
        return peersGettingFromUs;
      }

      public void setPeersGettingFromUs(int peersGettingFromUs) {
        this.peersGettingFromUs = peersGettingFromUs;
      }

      public int getPeersSendingToUs() {
        return peersSendingToUs;
      }

      public void setPeersSendingToUs(int peersSendingToUs) {
        this.peersSendingToUs = peersSendingToUs;
      }

      public int getPercentDone() {
        return percentDone;
      }

      public void setPercentDone(int percentDone) {
        this.percentDone = percentDone;
      }

      public int getPieceCount() {
        return pieceCount;
      }

      public void setPieceCount(int pieceCount) {
        this.pieceCount = pieceCount;
      }

      public int getPieceSize() {
        return pieceSize;
      }

      public void setPieceSize(int pieceSize) {
        this.pieceSize = pieceSize;
      }

      public String getPieces() {
        return pieces;
      }

      public void setPieces(String pieces) {
        this.pieces = pieces;
      }

      public int getQueuePosition() {
        return queuePosition;
      }

      public void setQueuePosition(int queuePosition) {
        this.queuePosition = queuePosition;
      }

      public int getRateDownload() {
        return rateDownload;
      }

      public void setRateDownload(int rateDownload) {
        this.rateDownload = rateDownload;
      }

      public int getRateUpload() {
        return rateUpload;
      }

      public void setRateUpload(int rateUpload) {
        this.rateUpload = rateUpload;
      }

      public int getRecheckProgress() {
        return recheckProgress;
      }

      public void setRecheckProgress(int recheckProgress) {
        this.recheckProgress = recheckProgress;
      }

      public int getSecondsDownloading() {
        return secondsDownloading;
      }

      public void setSecondsDownloading(int secondsDownloading) {
        this.secondsDownloading = secondsDownloading;
      }

      public int getSecondsSeeding() {
        return secondsSeeding;
      }

      public void setSecondsSeeding(int secondsSeeding) {
        this.secondsSeeding = secondsSeeding;
      }

      public int getSeedIdleLimit() {
        return seedIdleLimit;
      }

      public void setSeedIdleLimit(int seedIdleLimit) {
        this.seedIdleLimit = seedIdleLimit;
      }

      public int getSeedIdleMode() {
        return seedIdleMode;
      }

      public void setSeedIdleMode(int seedIdleMode) {
        this.seedIdleMode = seedIdleMode;
      }

      public int getSeedRatioLimit() {
        return seedRatioLimit;
      }

      public void setSeedRatioLimit(int seedRatioLimit) {
        this.seedRatioLimit = seedRatioLimit;
      }

      public int getSeedRatioMode() {
        return seedRatioMode;
      }

      public void setSeedRatioMode(int seedRatioMode) {
        this.seedRatioMode = seedRatioMode;
      }

      public int getSizeWhenDone() {
        return sizeWhenDone;
      }

      public void setSizeWhenDone(int sizeWhenDone) {
        this.sizeWhenDone = sizeWhenDone;
      }

      public int getStartDate() {
        return startDate;
      }

      public void setStartDate(int startDate) {
        this.startDate = startDate;
      }

      public int getStatus() {
        return status;
      }

      public void setStatus(int status) {
        this.status = status;
      }

      public String getTorrentFile() {
        return torrentFile;
      }

      public void setTorrentFile(String torrentFile) {
        this.torrentFile = torrentFile;
      }

      public int getTotalSize() {
        return totalSize;
      }

      public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
      }

      public int getUploadLimit() {
        return uploadLimit;
      }

      public void setUploadLimit(int uploadLimit) {
        this.uploadLimit = uploadLimit;
      }

      public boolean isUploadLimited() {
        return uploadLimited;
      }

      public void setUploadLimited(boolean uploadLimited) {
        this.uploadLimited = uploadLimited;
      }

      public double getUploadRatio() {
        return uploadRatio;
      }

      public void setUploadRatio(double uploadRatio) {
        this.uploadRatio = uploadRatio;
      }

      public int getUploadedEver() {
        return uploadedEver;
      }

      public void setUploadedEver(int uploadedEver) {
        this.uploadedEver = uploadedEver;
      }

      public int getWebseedsSendingToUs() {
        return webseedsSendingToUs;
      }

      public void setWebseedsSendingToUs(int webseedsSendingToUs) {
        this.webseedsSendingToUs = webseedsSendingToUs;
      }

      public List<FileStats> getFileStats() {
        return fileStats;
      }

      public void setFileStats(List<FileStats> fileStats) {
        this.fileStats = fileStats;
      }

      public List<Files> getFiles() {
        return files;
      }

      public void setFiles(List<Files> files) {
        this.files = files;
      }

      public List<Peers> getPeers() {
        return peers;
      }

      public void setPeers(List<Peers> peers) {
        this.peers = peers;
      }

      public List<Integer> getPriorities() {
        return priorities;
      }

      public void setPriorities(List<Integer> priorities) {
        this.priorities = priorities;
      }

      public List<TrackerStats> getTrackerStats() {
        return trackerStats;
      }

      public void setTrackerStats(List<TrackerStats> trackerStats) {
        this.trackerStats = trackerStats;
      }

      public List<Trackers> getTrackers() {
        return trackers;
      }

      public void setTrackers(List<Trackers> trackers) {
        this.trackers = trackers;
      }

      public List<Integer> getWanted() {
        return wanted;
      }

      public void setWanted(List<Integer> wanted) {
        this.wanted = wanted;
      }

      public List<String> getWebseeds() {
        return webseeds;
      }

      public void setWebseeds(List<String> webseeds) {
        this.webseeds = webseeds;
      }

      public static class PeersFrom {

        /**
         * fromCache : 0
         * fromDht : 1
         * fromIncoming : 5
         * fromLpd : 0
         * fromLtep : 0
         * fromPex : 9
         * fromTracker : 0
         */

        private int fromCache;
        private int fromDht;
        private int fromIncoming;
        private int fromLpd;
        private int fromLtep;
        private int fromPex;
        private int fromTracker;

        public static PeersFrom parseFromData(String str) {

          return JSON.parseObject(str, PeersFrom.class);
        }

        public int getFromCache() {
          return fromCache;
        }

        public void setFromCache(int fromCache) {
          this.fromCache = fromCache;
        }

        public int getFromDht() {
          return fromDht;
        }

        public void setFromDht(int fromDht) {
          this.fromDht = fromDht;
        }

        public int getFromIncoming() {
          return fromIncoming;
        }

        public void setFromIncoming(int fromIncoming) {
          this.fromIncoming = fromIncoming;
        }

        public int getFromLpd() {
          return fromLpd;
        }

        public void setFromLpd(int fromLpd) {
          this.fromLpd = fromLpd;
        }

        public int getFromLtep() {
          return fromLtep;
        }

        public void setFromLtep(int fromLtep) {
          this.fromLtep = fromLtep;
        }

        public int getFromPex() {
          return fromPex;
        }

        public void setFromPex(int fromPex) {
          this.fromPex = fromPex;
        }

        public int getFromTracker() {
          return fromTracker;
        }

        public void setFromTracker(int fromTracker) {
          this.fromTracker = fromTracker;
        }
      }

      public static class FileStats {

        /**
         * bytesCompleted : 2126315353
         * priority : 0
         * wanted : true
         */

        private int bytesCompleted;
        private int priority;
        private boolean wanted;

        public static FileStats parseFromData(String str) {

          return JSON.parseObject(str, FileStats.class);
        }

        public int getBytesCompleted() {
          return bytesCompleted;
        }

        public void setBytesCompleted(int bytesCompleted) {
          this.bytesCompleted = bytesCompleted;
        }

        public int getPriority() {
          return priority;
        }

        public void setPriority(int priority) {
          this.priority = priority;
        }

        public boolean isWanted() {
          return wanted;
        }

        public void setWanted(boolean wanted) {
          this.wanted = wanted;
        }
      }

      public static class Files {

        /**
         * bytesCompleted : 2126315353
         * length : 2126315353
         * name : 复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601/复仇者联盟4：终局之战.Avengers.Endgame.2019.720p.WEB-DL.DD5.1.H264-中英双字-BT601.mp4
         */

        private int bytesCompleted;
        private int length;
        private String name;

        public static Files parseFromData(String str) {

          return JSON.parseObject(str, Files.class);
        }

        public int getBytesCompleted() {
          return bytesCompleted;
        }

        public void setBytesCompleted(int bytesCompleted) {
          this.bytesCompleted = bytesCompleted;
        }

        public int getLength() {
          return length;
        }

        public void setLength(int length) {
          this.length = length;
        }

        public String getName() {
          return name;
        }

        public void setName(String name) {
          this.name = name;
        }
      }

      public static class Peers {

        /**
         * address : 14.153.202.188
         * clientIsChoked : true
         * clientIsInterested : false
         * clientName : Thunder 0.1.0.0
         * flagStr : TUXI
         * isDownloadingFrom : false
         * isEncrypted : false
         * isIncoming : true
         * isUTP : true
         * isUploadingTo : true
         * peerIsChoked : false
         * peerIsInterested : true
         * port : 11283
         * progress : 0.2021
         * rateToClient : 0
         * rateToPeer : 14000
         */

        private String address;
        private boolean clientIsChoked;
        private boolean clientIsInterested;
        private String clientName;
        private String flagStr;
        private boolean isDownloadingFrom;
        private boolean isEncrypted;
        private boolean isIncoming;
        private boolean isUTP;
        private boolean isUploadingTo;
        private boolean peerIsChoked;
        private boolean peerIsInterested;
        private int port;
        private double progress;
        private int rateToClient;
        private int rateToPeer;

        public static Peers parseFromData(String str) {

          return JSON.parseObject(str, Peers.class);
        }

        public String getAddress() {
          return address;
        }

        public void setAddress(String address) {
          this.address = address;
        }

        public boolean isClientIsChoked() {
          return clientIsChoked;
        }

        public void setClientIsChoked(boolean clientIsChoked) {
          this.clientIsChoked = clientIsChoked;
        }

        public boolean isClientIsInterested() {
          return clientIsInterested;
        }

        public void setClientIsInterested(boolean clientIsInterested) {
          this.clientIsInterested = clientIsInterested;
        }

        public String getClientName() {
          return clientName;
        }

        public void setClientName(String clientName) {
          this.clientName = clientName;
        }

        public String getFlagStr() {
          return flagStr;
        }

        public void setFlagStr(String flagStr) {
          this.flagStr = flagStr;
        }

        public boolean isIsDownloadingFrom() {
          return isDownloadingFrom;
        }

        public void setIsDownloadingFrom(boolean isDownloadingFrom) {
          this.isDownloadingFrom = isDownloadingFrom;
        }

        public boolean isIsEncrypted() {
          return isEncrypted;
        }

        public void setIsEncrypted(boolean isEncrypted) {
          this.isEncrypted = isEncrypted;
        }

        public boolean isIsIncoming() {
          return isIncoming;
        }

        public void setIsIncoming(boolean isIncoming) {
          this.isIncoming = isIncoming;
        }

        public boolean isIsUTP() {
          return isUTP;
        }

        public void setIsUTP(boolean isUTP) {
          this.isUTP = isUTP;
        }

        public boolean isIsUploadingTo() {
          return isUploadingTo;
        }

        public void setIsUploadingTo(boolean isUploadingTo) {
          this.isUploadingTo = isUploadingTo;
        }

        public boolean isPeerIsChoked() {
          return peerIsChoked;
        }

        public void setPeerIsChoked(boolean peerIsChoked) {
          this.peerIsChoked = peerIsChoked;
        }

        public boolean isPeerIsInterested() {
          return peerIsInterested;
        }

        public void setPeerIsInterested(boolean peerIsInterested) {
          this.peerIsInterested = peerIsInterested;
        }

        public int getPort() {
          return port;
        }

        public void setPort(int port) {
          this.port = port;
        }

        public double getProgress() {
          return progress;
        }

        public void setProgress(double progress) {
          this.progress = progress;
        }

        public int getRateToClient() {
          return rateToClient;
        }

        public void setRateToClient(int rateToClient) {
          this.rateToClient = rateToClient;
        }

        public int getRateToPeer() {
          return rateToPeer;
        }

        public void setRateToPeer(int rateToPeer) {
          this.rateToPeer = rateToPeer;
        }
      }

      public static class TrackerStats {

        /**
         * announce : announce
         * announceState : 1
         * downloadCount : 10
         * hasAnnounced : true
         * hasScraped : false
         * host : host
         * id : 1
         * isBackup : true
         * lastAnnouncePeerCount : 1
         * lastAnnounceResult : lastAnnounceResult
         * lastAnnounceStartTime : 1
         * lastAnnounceSucceeded : true
         * lastAnnounceTime : 1
         * lastAnnounceTimedOut : true
         * lastScrapeResult : lastScrapeResult
         * lastScrapeStartTime : 1
         * lastScrapeSucceeded : true
         * lastScrapeTime : 1
         * lastScrapeTimedOut : true
         * leecherCount : 1
         * nextAnnounceTime : 1
         * nextScrapeTime : 1
         * scrape : scrape
         * scrapeState : 1
         * seederCount : 1
         * tier : 1
         */

        private String announce;
        private int announceState;
        private int downloadCount;
        private boolean hasAnnounced;
        private boolean hasScraped;
        private String host;
        private int id;
        private boolean isBackup;
        private int lastAnnouncePeerCount;
        private String lastAnnounceResult;
        private int lastAnnounceStartTime;
        private boolean lastAnnounceSucceeded;
        private int lastAnnounceTime;
        private boolean lastAnnounceTimedOut;
        private String lastScrapeResult;
        private int lastScrapeStartTime;
        private boolean lastScrapeSucceeded;
        private int lastScrapeTime;
        private boolean lastScrapeTimedOut;
        private int leecherCount;
        private int nextAnnounceTime;
        private int nextScrapeTime;
        private String scrape;
        private int scrapeState;
        private int seederCount;
        private int tier;

        public static TrackerStats parseFromData(String str) {

          return JSON.parseObject(str, TrackerStats.class);
        }

        public String getAnnounce() {
          return announce;
        }

        public void setAnnounce(String announce) {
          this.announce = announce;
        }

        public int getAnnounceState() {
          return announceState;
        }

        public void setAnnounceState(int announceState) {
          this.announceState = announceState;
        }

        public int getDownloadCount() {
          return downloadCount;
        }

        public void setDownloadCount(int downloadCount) {
          this.downloadCount = downloadCount;
        }

        public boolean isHasAnnounced() {
          return hasAnnounced;
        }

        public void setHasAnnounced(boolean hasAnnounced) {
          this.hasAnnounced = hasAnnounced;
        }

        public boolean isHasScraped() {
          return hasScraped;
        }

        public void setHasScraped(boolean hasScraped) {
          this.hasScraped = hasScraped;
        }

        public String getHost() {
          return host;
        }

        public void setHost(String host) {
          this.host = host;
        }

        public int getId() {
          return id;
        }

        public void setId(int id) {
          this.id = id;
        }

        public boolean isIsBackup() {
          return isBackup;
        }

        public void setIsBackup(boolean isBackup) {
          this.isBackup = isBackup;
        }

        public int getLastAnnouncePeerCount() {
          return lastAnnouncePeerCount;
        }

        public void setLastAnnouncePeerCount(int lastAnnouncePeerCount) {
          this.lastAnnouncePeerCount = lastAnnouncePeerCount;
        }

        public String getLastAnnounceResult() {
          return lastAnnounceResult;
        }

        public void setLastAnnounceResult(String lastAnnounceResult) {
          this.lastAnnounceResult = lastAnnounceResult;
        }

        public int getLastAnnounceStartTime() {
          return lastAnnounceStartTime;
        }

        public void setLastAnnounceStartTime(int lastAnnounceStartTime) {
          this.lastAnnounceStartTime = lastAnnounceStartTime;
        }

        public boolean isLastAnnounceSucceeded() {
          return lastAnnounceSucceeded;
        }

        public void setLastAnnounceSucceeded(boolean lastAnnounceSucceeded) {
          this.lastAnnounceSucceeded = lastAnnounceSucceeded;
        }

        public int getLastAnnounceTime() {
          return lastAnnounceTime;
        }

        public void setLastAnnounceTime(int lastAnnounceTime) {
          this.lastAnnounceTime = lastAnnounceTime;
        }

        public boolean isLastAnnounceTimedOut() {
          return lastAnnounceTimedOut;
        }

        public void setLastAnnounceTimedOut(boolean lastAnnounceTimedOut) {
          this.lastAnnounceTimedOut = lastAnnounceTimedOut;
        }

        public String getLastScrapeResult() {
          return lastScrapeResult;
        }

        public void setLastScrapeResult(String lastScrapeResult) {
          this.lastScrapeResult = lastScrapeResult;
        }

        public int getLastScrapeStartTime() {
          return lastScrapeStartTime;
        }

        public void setLastScrapeStartTime(int lastScrapeStartTime) {
          this.lastScrapeStartTime = lastScrapeStartTime;
        }

        public boolean isLastScrapeSucceeded() {
          return lastScrapeSucceeded;
        }

        public void setLastScrapeSucceeded(boolean lastScrapeSucceeded) {
          this.lastScrapeSucceeded = lastScrapeSucceeded;
        }

        public int getLastScrapeTime() {
          return lastScrapeTime;
        }

        public void setLastScrapeTime(int lastScrapeTime) {
          this.lastScrapeTime = lastScrapeTime;
        }

        public boolean isLastScrapeTimedOut() {
          return lastScrapeTimedOut;
        }

        public void setLastScrapeTimedOut(boolean lastScrapeTimedOut) {
          this.lastScrapeTimedOut = lastScrapeTimedOut;
        }

        public int getLeecherCount() {
          return leecherCount;
        }

        public void setLeecherCount(int leecherCount) {
          this.leecherCount = leecherCount;
        }

        public int getNextAnnounceTime() {
          return nextAnnounceTime;
        }

        public void setNextAnnounceTime(int nextAnnounceTime) {
          this.nextAnnounceTime = nextAnnounceTime;
        }

        public int getNextScrapeTime() {
          return nextScrapeTime;
        }

        public void setNextScrapeTime(int nextScrapeTime) {
          this.nextScrapeTime = nextScrapeTime;
        }

        public String getScrape() {
          return scrape;
        }

        public void setScrape(String scrape) {
          this.scrape = scrape;
        }

        public int getScrapeState() {
          return scrapeState;
        }

        public void setScrapeState(int scrapeState) {
          this.scrapeState = scrapeState;
        }

        public int getSeederCount() {
          return seederCount;
        }

        public void setSeederCount(int seederCount) {
          this.seederCount = seederCount;
        }

        public int getTier() {
          return tier;
        }

        public void setTier(int tier) {
          this.tier = tier;
        }
      }

      public static class Trackers {

        /**
         * announce : announce
         * scrape : scrape
         * id : 100
         * tier : 100
         */

        private String announce;
        private String scrape;
        private int id;
        private int tier;

        public static Trackers parseFromData(String str) {

          return JSON.parseObject(str, Trackers.class);
        }

        public String getAnnounce() {
          return announce;
        }

        public void setAnnounce(String announce) {
          this.announce = announce;
        }

        public String getScrape() {
          return scrape;
        }

        public void setScrape(String scrape) {
          this.scrape = scrape;
        }

        public int getId() {
          return id;
        }

        public void setId(int id) {
          this.id = id;
        }

        public int getTier() {
          return tier;
        }

        public void setTier(int tier) {
          this.tier = tier;
        }
      }
    }
  }
}
