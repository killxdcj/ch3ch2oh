package com.killxdcj.ch3ch2oh.transmission.exception;

public class TransmissionRpcException extends Exception {

  public TransmissionRpcException(String message) {
    super(message);
  }

  public TransmissionRpcException(String message, Throwable cause) {
    super(message, cause);
  }

  public TransmissionRpcException(Throwable cause) {
    super(cause);
  }
}
