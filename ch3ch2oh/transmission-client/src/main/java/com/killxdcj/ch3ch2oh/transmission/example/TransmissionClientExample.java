package com.killxdcj.ch3ch2oh.transmission.example;

import com.killxdcj.ch3ch2oh.transmission.client.TransmissionClient;
import com.killxdcj.ch3ch2oh.transmission.exception.TransmissionRpcException;
import com.killxdcj.ch3ch2oh.transmission.protocol.Response;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentAddRequest;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentAddResponse;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentAddResponse.Arguments.TorrentAdded;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentGetRequest;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentGetRequest.FIELD;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentGetResponse;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentGetResponse.Arguments.Torrents;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentGetResponse.Arguments.Torrents.Files;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentRemoveRequest;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentRemoveResponse;

public class TransmissionClientExample {

  public static void main(String[] args) {
    try {

      TransmissionClient client = new TransmissionClient(
          "http://transmission.killxdcj.com/transmission/rpc");

      // Add torrent
      String magnet = "magnet:?xt=urn:btih:955A228BD542FC69EE91C80C352CC9462FB56D46";
      int torrent_id = 0;

      TorrentAddRequest addRequest = TorrentAddRequest.newRequest()
          .setFilename(magnet);
      TorrentAddResponse addResponse = client.TorrentAdd(addRequest);
      if (!addResponse.getResult().equals(Response.SUCCESS)) {
        System.out.println("Add Torrent failed, " + addResponse.getResult());
        return;
      }
      if (addResponse.getArguments().getTorrentAdded() != null) {
        torrent_id = addResponse.getArguments().getTorrentAdded().getId();
        System.out.println("Add a new torrent, " + torrent_id);
      } else {
        torrent_id = addResponse.getArguments().getTorrentDuplicate().getId();
        System.out.println("Add a duplicate torrent, " + torrent_id);
      }

      // Get torrent
      TorrentGetRequest getRequest = TorrentGetRequest.newRequest()
          .addIds(torrent_id)
          .addWantedFields(FIELD.ID, FIELD.NAME, FIELD.FILES, FIELD.TOTAL_SIZE, FIELD.RATE_DOWNLOAD, FIELD.RATE_UPLOAD);
      TorrentGetResponse getResponse = client.torrentGet(getRequest);
      if (!getResponse.getResult().equals(Response.SUCCESS)) {
        System.out.println("Get torrent failed, " + getResponse.getResult());
        return;
      }

      System.out.println("Get a torrent");
      for (Torrents torrents : getResponse.getArguments().getTorrents()){
        System.out.println("id: " + torrents.getId());
        System.out.println("name: " + torrents.getName());
        System.out.println("totalSize: " + torrents.getTotalSize());
        System.out.println("rateDownload: " + torrents.getRateDownload());
        System.out.println("rateUpload: " + torrents.getRateUpload());
        for (Files files : torrents.getFiles()) {
          System.out.println(files.getName() + ", " + files.getLength() + ", " + files.getBytesCompleted());
        }
      }

      // Remove torrent
      TorrentRemoveRequest removeRequest = TorrentRemoveRequest.newRequest()
          .addIds(torrent_id);
      TorrentRemoveResponse removeResponse = client.torrentRemove(removeRequest);
      if (!removeResponse.getResult().equals(Response.SUCCESS)) {
        System.out.println("Remove torrent failed, " + removeResponse.getResult());
        return;
      }

      System.out.println("Remove torrent, " + torrent_id);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
