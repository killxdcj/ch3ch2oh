package com.killxdcj.ch3ch2oh.transmission.protocol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TorrentGetRequest extends Request {

  private TorrentGetRequest() {
    super("torrent-get");
  }

  public static TorrentGetRequest newRequest() {
    return new TorrentGetRequest();
  }

  public TorrentGetRequest addIds(int id) {
    List<Integer> ids = (List<Integer>) arguments.computeIfAbsent("ids",
        (Function<String, List<Integer>>) s -> new ArrayList<>());
    ids.add(id);
    return this;
  }

  public TorrentGetRequest addWantedFields(FIELD... fields) {
    List<String> fileds = (List<String>) arguments.computeIfAbsent("fields",
        (Function<String, List<String>>) s -> new ArrayList<>());
    fileds.addAll(
        Arrays.asList(fields).stream().map(field -> field.filedName).collect(Collectors.toList()));
    return this;
  }

  public enum FIELD {
    ACTIVITY_DATE("activityDate"),
    ADDED_DATE("addedDate"),
    BANDWIDTH_PRIORITY("bandwidthPriority"),
    COMMENT("comment"),
    CORRUPT_EVER("corruptEver"),
    CREATOR("creator"),
    DATE_CREATED("dateCreated"),
    DESIRED_AVAILABLE("desiredAvailable"),
    DONE_DATE("doneDate"),
    DOWNLOAD_DIR("downloadDir"),
    DOWNLOADED_EVER("downloadedEver"),
    DOWNLOAD_LIMIT("downloadLimit"),
    DOWNLOAD_LIMITED("downloadLimited"),
    ERROR("error"),
    ERROR_STRING("errorString"),
    ETA("eta"),
    ETA_IDLE("etaIdle"),
    FILES("files"),
    FILE_STATS("fileStats"),
    HASH_STRING("hashString"),
    HAVE_UNCHECKED("haveUnchecked"),
    HAVE_VALID("haveValid"),
    HONORS_SESSION_LIMITS("honorsSessionLimits"),
    ID("id"),
    IS_FINISHED("isFinished"),
    IS_PRIVATE("isPrivate"),
    IS_STALLED("isStalled"),
    LEFT_UNTIL_DONE("leftUntilDone"),
    MAGNET_LINK("magnetLink"),
    MANUAL_ANNOUNCE_TIME("manualAnnounceTime"),
    MAX_CONNECTED_PEERS("maxConnectedPeers"),
    METADATA_PERCENT_COMPLETE("metadataPercentComplete"),
    NAME("name"),
    PEER_LIMIT("peer-limit"),
    PEERS("peers"),
    PEERS_CONNECTED("peersConnected"),
    PEERS_FROM("peersFrom"),
    PEERS_GETTING_FROMUS("peersGettingFromUs"),
    PEERS_SENDING_TO_US("peersSendingToUs"),
    PERCENT_DONE("percentDone"),
    PIECES("pieces"),
    PIECE_COUNT("pieceCount"),
    PIECE_SIZE("pieceSize"),
    PRIORITIES("priorities"),
    QUEUE_POSITION("queuePosition"),
    RATE_DOWNLOAD("rateDownload"),
    RATE_UPLOAD("rateUpload"),
    RECHECK_PROGRESS("recheckProgress"),
    SECONDS_DOWNLOADING("secondsDownloading"),
    SECONDS_SEEDING("secondsSeeding"),
    SEED_IDLE_LIMIT("seedIdleLimit"),
    SEED_IDLE_MODE("seedIdleMode"),
    SEED_RATIO_LIMIT("seedRatioLimit"),
    SEED_RATIO_MODE("seedRatioMode"),
    SIZE_WHEN_DONE("sizeWhenDone"),
    START_DATE("startDate"),
    STATUS("status"),
    TRACKERS("trackers"),
    TRACKER_STATS("trackerStats"),
    TOTAL_SIZE("totalSize"),
    TORRENT_FILE("torrentFile"),
    UPLOADED_EVER("uploadedEver"),
    UPLOAD_LIMIT("uploadLimit"),
    UPLOAD_LIMITED("uploadLimited"),
    UPLOAD_RATIO("uploadRatio"),
    WANTED("wanted"),
    WEBSEEDS("webseeds"),
    WEBSEEDS_SENDING_TO_US("webseedsSendingToUs");

    private String filedName;

    FIELD(String filedName) {
      this.filedName = filedName;
    }
  }
}
