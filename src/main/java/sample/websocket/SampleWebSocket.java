package sample.websocket;

import java.io.IOException;

import javax.websocket.Session;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/broadcast")
public class SampleWebSocket {

  @OnOpen
  public void onOpen(Session session) {
    System.out.println("open: " + session.getId());
  }

  @OnClose
  public void onClose(Session session) {
    System.out.println("close: " + session.getId());
  }

  @OnError
  public void onError(Session session, Throwable cause) {
    System.out.println("error: " + session.getId() + ", " + cause.getMessage());
  }

  @OnMessage
  public void broadcast(Session session, String m) throws IOException {
    System.out.println("onmessage: " + m);
    session.getOpenSessions().forEach(s -> {
      System.out.println("send to: " + s.getId());
      s.getAsyncRemote().sendText(m);
    });
  }
}
