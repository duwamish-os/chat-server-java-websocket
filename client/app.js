var clientId = Math.random().toString(36).substring(2) + (new Date()).getTime().toString(36);
var webSocket = new WebSocket("ws://localhost:8080/introv-ws/chat/" + clientId);

var txtAreaEcho = document.getElementById("txtAreaEcho");

txtAreaEcho.value = "";

var msg = document.getElementById("txtMessage");

webSocket.onopen = function(msgEvent){
                      txtAreaEcho.value += "Connected ... \n";
                   };
webSocket.onmessage = function(msgEvent){
                       txtAreaEcho.value += "Neighbour : " + msgEvent.data + "\n";
                     };
webSocket.onclose = function(msgEvent){
                      txtAreaEcho.value += "Logout ... \n";
                     };
webSocket.onerror = function(msgEvent){
                        txtAreaEcho.value += "Error ... \n";
                     };
/**
 *  Send Message
 */
function doSendMessage(){
    webSocket.send(msg.value);
    txtAreaEcho.value += "Me : " + msg.value + "\n";
    msg.value = "";
}

/**
 *  Close Connection
 */
function doCloseConnection(){
    webSocket.close();
}

