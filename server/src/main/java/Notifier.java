import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Notifier {

    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    static {
        notifyPresence();
    }

    private static void notifyPresence() {
        System.out.println("scheduling notifier");
        scheduler.schedule(() -> {
            IntrovSessionHandler.sessions.forEach((clientId, session) -> {
                try {
                    System.out.println("[INFO] notifying " + clientId);
                    session.getBasicRemote().sendText(LocalDateTime.now().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                    //TODO write to failed events so that I can re-concile it in future
                    System.out.println("failed to notify " + clientId);
                }
            });
        }, 30, TimeUnit.SECONDS);
    }
}
