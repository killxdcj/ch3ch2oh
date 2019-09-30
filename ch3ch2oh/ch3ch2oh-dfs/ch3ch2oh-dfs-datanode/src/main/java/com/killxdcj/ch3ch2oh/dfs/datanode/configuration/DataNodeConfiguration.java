package com.killxdcj.ch3ch2oh.dfs.datanode.configuration;

import org.yaml.snakeyaml.Yaml;

public class DataNodeConfiguration {
  private String id;
  private String address;
  private short grpcPort;
  private short httpPort;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public short getGrpcPort() {
    return grpcPort;
  }

  public void setGrpcPort(short grpcPort) {
    this.grpcPort = grpcPort;
  }

  public short getHttpPort() {
    return httpPort;
  }

  public void setHttpPort(short httpPort) {
    this.httpPort = httpPort;
  }

  public String toYamlString() {
    Yaml yaml = new Yaml();
    return yaml.dumpAsMap(this);
  }

  public static void main(String[] args) {
    DataNodeConfiguration configuration = new DataNodeConfiguration();
    System.out.println(configuration.toYamlString());
  }
}
