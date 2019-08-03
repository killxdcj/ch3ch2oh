package com.killxdcj.ch3ch2oh.transmission.example;

import com.killxdcj.ch3ch2oh.transmission.client.TransmissionClient;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentGetRequest;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentGetRequest.FIELD;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentGetResponse;

public class TransmissionClientExample {
  public static void main(String[] args) {
    TransmissionClient client = new TransmissionClient("http://transmission.killxdcj.com/transmission/rpc");
    TorrentGetRequest request = TorrentGetRequest.newRequest()
        .addIds(1)
        .addWantedFields(FIELD.ID, FIELD.NAME, FIELD.TOTAL_SIZE);
    TorrentGetResponse response = client.torrentGet(request);
    System.out.println(response);
  }
}
