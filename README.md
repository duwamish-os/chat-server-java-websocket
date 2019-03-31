
```bash
mvn tomcat8:run ##ws does not for some reason
## 
mvn clean package

cp target/introv-ws-0.1.0.war /usr/local/apache-tomcat-9.0.14/webapps/introv-ws.war
```

```bash
31-Mar-2019 13:52:57.834 INFO [Catalina-utility-1] org.apache.catalina.startup.HostConfig.deployWAR Deployment of web application archive [/usr/local/apache-tomcat-9.0.14/webapps/introv-ws.war] has finished in [82] ms
chat session start: 1
chat message session: 1
chat message: I like you
chat session close: 1
chat session start: 2
```