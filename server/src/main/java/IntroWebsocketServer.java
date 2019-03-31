import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@ServerEndpoint("/chat/{clientId}")
public class IntroWebsocketServer {

    AtomicInteger client = new AtomicInteger(0);
    Notifier a = new Notifier();
    
    @OnOpen
    public void open(@PathParam("clientId") String clientId, Session session) {
        client.getAndIncrement();
        //String id = getClientId(session);
        System.out.println("chat session start: " + clientId);
        IntrovSessionHandler.sessions.put(clientId, session);
    }

    @OnClose
    public void close(@PathParam("clientId") String clientId, Session session) {
        //String id = getClientId(session);
        IntrovSessionHandler.sessions.remove(clientId);
        System.out.println("chat session closed: " + clientId);
    }

    @OnError
    public void onError(@PathParam("clientId") String clientId, Throwable error) {
        System.out.println(error.getMessage());
    }

    @OnMessage
    public String handleMessage(@PathParam("clientId") String clientId, String message, Session session) {
        //decode message into JSON
        System.out.println("chat message session: " + session.getId());
        System.out.println("chat message: " + message);
        return "hi how are you doing?";
    }

    private String getClientId(Session session) {
        return session.getQueryString().split("=")[1];
    }
}
