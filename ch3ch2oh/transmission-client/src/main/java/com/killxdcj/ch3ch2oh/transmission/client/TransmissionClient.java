package com.killxdcj.ch3ch2oh.transmission.client;

import com.alibaba.fastjson.JSON;
import com.killxdcj.ch3ch2oh.transmission.protocol.Request;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentAddRequest;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentAddResponse;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentGetRequest;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentGetResponse;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentRemoveRequest;
import com.killxdcj.ch3ch2oh.transmission.protocol.TorrentRemoveResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class TransmissionClient {

  private CloseableHttpClient client;
  private String transmissionRpc = "";
  private String xTransmissionSessionId = "lXBK1chJHrGb5rQ1I1rE0HMcU08evhYSKyQ2MqtHj1NYSWbu";

  public TransmissionClient(String transmissionRpc) {
    this.client = HttpClients.createDefault();
    this.transmissionRpc = transmissionRpc;
  }

  public TorrentAddResponse TorrentAdd(TorrentAddRequest request) {
    try (CloseableHttpResponse response = doRequest(request)) {
      System.out.println(response.getStatusLine());
      System.out.println(response.getHeaders(HttpHeaders.CONTENT_TYPE));
      System.out.println(EntityUtils.toString(response.getEntity()));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public TorrentGetResponse torrentGet(TorrentGetRequest request) {
    try (CloseableHttpResponse response = doRequest(request)) {
//      System.out.println(response.getStatusLine());
//      System.out.println(response.getHeaders(HttpHeaders.CONTENT_TYPE)[0].toString());
//      String content = EntityUtils.toString(response.getEntity(), "UTF-8");
//      System.out.println(content);
//      System.out.println(TorrentGetResponse.parseFromData(content));
//      System.out.println(JSON.toJSONString(TorrentGetResponse.parseFromData(content)));

      if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
        return TorrentGetResponse.parseFromData(EntityUtils.toString(response.getEntity()));
      } else if (response.getStatusLine().getStatusCode() == HttpStatus.SC_CONFLICT){
        if (updateSessionId(EntityUtils.toString(response.getEntity()))) {
//          return torrentGet(request);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public TorrentRemoveResponse torrentRemove(TorrentRemoveRequest request) {
    try (CloseableHttpResponse response = doRequest(request)) {
      if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
        return TorrentRemoveResponse.parseFromData(EntityUtils.toString(response.getEntity()));
      } else {
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeaders(HttpHeaders.CONTENT_TYPE));
        System.out.println(EntityUtils.toString(response.getEntity()));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public boolean updateSessionId(String content) {
    Pattern pattern = Pattern.compile("X-Transmission-Session-Id: (.*?)</code>");
    Matcher m = pattern.matcher(content);

    while (m.find()) {
      int i = 1;
      System.out.println(m.group(i));
      i++;
    }
    return true;
  }

  private CloseableHttpResponse doRequest(Request request) throws IOException {
    HttpPost httpPost = new HttpPost(transmissionRpc);
    httpPost.addHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());
    httpPost.addHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.getMimeType());
    httpPost.addHeader("X-Transmission-Session-Id", xTransmissionSessionId);
    httpPost.addHeader(HttpHeaders.ACCEPT_CHARSET, "UTF-8");
    httpPost.setEntity(new StringEntity(request.build(), ContentType.APPLICATION_JSON));
    System.out.println(request.build());
    return client.execute(httpPost);
  }
}
