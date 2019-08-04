package com.killxdcj.ch3ch2oh.transmission.client;

import com.killxdcj.ch3ch2oh.transmission.exception.TransmissionRpcException;
import com.killxdcj.ch3ch2oh.transmission.protocol.Request;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentAddRequest;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentAddResponse;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentGetRequest;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentGetResponse;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentRemoveRequest;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentRemoveResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransmissionClient {

  private static final Logger LOGGER = LoggerFactory.getLogger(TransmissionClient.class);

  private CloseableHttpClient client;
  private String transmissionRpc = "";
  private String xTransmissionSessionId = "lXBK1chJHrGb5rQ1I1rE0HMcU08evhYSKyQ2MqtHj1NYSWbu";

  public TransmissionClient(String transmissionRpc) {
    this.client = HttpClients.createDefault();
    this.transmissionRpc = transmissionRpc;
  }

  public TorrentAddResponse TorrentAdd(TorrentAddRequest request) throws TransmissionRpcException {
    return TorrentAddResponse.parseFromData(doRpc(request));
  }

  public TorrentGetResponse torrentGet(TorrentGetRequest request) throws TransmissionRpcException {
    return TorrentGetResponse.parseFromData(doRpc(request));
  }

  public TorrentRemoveResponse torrentRemove(TorrentRemoveRequest request)
      throws TransmissionRpcException {
    return TorrentRemoveResponse.parseFromData(doRpc(request));
  }

  private void updateSessionId(String content) throws TransmissionRpcException {
    Pattern pattern = Pattern.compile("X-Transmission-Session-Id: (.*?)</code>");
    Matcher m = pattern.matcher(content);
    if (m.find()) {
      xTransmissionSessionId = m.group(1);
      LOGGER.info("xTransmissionSessionId updated, new session: {}", xTransmissionSessionId);
    } else {
      throw new TransmissionRpcException(
          "X-Transmission-Session-Id expired and response has no new X-Transmission-Session-Id, response: "
              + content);
    }
  }

  private String doRpc(Request request) throws TransmissionRpcException {
    try (CloseableHttpResponse response = doRequest(request)) {
      if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
        return EntityUtils.toString(response.getEntity());
      } else if (response.getStatusLine().getStatusCode() == HttpStatus.SC_CONFLICT) {
        updateSessionId(EntityUtils.toString(response.getEntity()));
        try (CloseableHttpResponse response1 = doRequest(request)) {
          if (response1.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            return EntityUtils.toString(response1.getEntity());
          } else {
            throw new TransmissionRpcException(
                "Transmission rpc error, status: " + response1.getStatusLine().toString());
          }
        }
      } else {
        throw new TransmissionRpcException(
            "Transmission rpc error, status: " + response.getStatusLine().toString());
      }
    } catch (IOException e) {
      throw new TransmissionRpcException("Comunicate with transmission server failed", e);
    }
  }

  private CloseableHttpResponse doRequest(Request request) throws IOException {
    RequestConfig config = RequestConfig.custom()
        .setConnectionRequestTimeout(5000)
        .setConnectTimeout(5000)
        .setSocketTimeout(5000)
        .build();

    HttpPost httpPost = new HttpPost(transmissionRpc);
    httpPost.addHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());
    httpPost.addHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.getMimeType());
    httpPost.addHeader("X-Transmission-Session-Id", xTransmissionSessionId);
    httpPost.addHeader(HttpHeaders.ACCEPT_CHARSET, "UTF-8");
    httpPost.setEntity(new StringEntity(request.build(), ContentType.APPLICATION_JSON));
    httpPost.setConfig(config);
    return client.execute(httpPost);
  }
}
