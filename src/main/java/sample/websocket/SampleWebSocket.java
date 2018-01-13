package sample.websocket;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndPoint;

@ServerEndPoint("/echo")
public class SampleWebSocket {

  @OnMessage
  public String echo(String message) {
    System.out.println(message);
    return message;
  }
}
