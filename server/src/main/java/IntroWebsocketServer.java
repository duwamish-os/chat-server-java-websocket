import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/chat")
public class IntroWebsocketServer {

    @OnOpen
    public void open(Session session) {
        System.out.println("chat session start: " + session.getId());
    }

    @OnClose
    public void close(Session session) {
        System.out.println("chat session close: " + session.getId());
    }

    @OnError
    public void onError(Throwable error) {
        System.out.println(error.getMessage());
    }

    @OnMessage
    public String handleMessage(String message, Session session) {
        System.out.println("chat message session: " + session.getId());
        System.out.println("chat message: " + message);
        return "hi how are you doing?";
    }

}
