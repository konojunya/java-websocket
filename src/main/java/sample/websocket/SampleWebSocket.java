package sample.websocket;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/echo")
public class SampleWebSocket {

  @OnMessage
  public String echo(String message) {
    System.out.println(message);
    return message;
  }
}
