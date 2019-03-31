
```bash
mvn tomcat8:run ##ws does not for some reason
## 
mvn clean package

cp target/introv-ws-0.1.0.war /usr/local/apache-tomcat-9.0.14/webapps/introv-ws.war
/usr/local/apache-tomcat-9.0.14/bin/shutdown.sh
/usr/local/apache-tomcat-9.0.14/bin/startup.sh
```
