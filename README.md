ws client(js)
-------

![](ws_connected_messaging.png)

using two different browsers

```bash
31-Mar-2019 13:52:57.834 INFO [Catalina-utility-1] org.apache.catalina.startup.HostConfig.deployWAR Deployment of web application archive [/usr/local/apache-tomcat-9.0.14/webapps/introv-ws.war] has finished in [82] ms

scheduling notifier
chat session start: s43629fkdzdjtxrbuad
chat session start: 7ecwcen7x1qjtxrc91e
chat message session: 11
chat message: I like you
[INFO] notifying client 7ecwcen7x1qjtxrc91e
[INFO] notifying client s43629fkdzdjtxrbuad

chat session closed: 7ecwcen7x1qjtxrc91e
```

session will be closed once the tab of a browser is closed.

Also see spring ws server - https://github.com/duwamish-os/chat-server-spring-websocket
