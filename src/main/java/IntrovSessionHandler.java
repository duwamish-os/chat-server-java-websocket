import javax.websocket.Session;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntrovSessionHandler {

    private int deviceId = 0;
    private final Set<Session> sessions = new HashSet<>();
    private final Set<Conversation> devices = new HashSet<>();

    public void addSession(Session session) {
        sessions.add(session);
    }

    public void removeSession(Session session) {
        sessions.remove(session);
    }

    public List<Conversation> getDevices() {
        return new ArrayList<>(devices);
    }

    public void addDevice(Conversation device) {
    }

    public void removeDevice(int id) {
    }

    public void toggleDevice(int id) {
    }

    private Conversation getDeviceById(int id) {
        return null;
    }

//    private JsonObject createAddMessage(Conversation device) {
//        return null;
//    }
//
//    private void sendToAllConnectedSessions(JsonObject message) {
//    }
//
//    private void sendToSession(Session session, JsonObject message) {
//    }
}
