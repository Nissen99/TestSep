import org.json.JSONException;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        WebsocketClient websocketClient = new WebsocketClient("wss://iotnet.teracom.dk/app?token=vnoUhgAAABFpb3RuZXQudGVyYWNvbS5ka_j9ctg1JnsNo1n5Rxn3neg=");

        DownLinkTelegramSend send = new DownLinkTelegramSend();

        String downLinkMessage = null;


        try {
            downLinkMessage = (new JSONObject(send)).toString(4);
        } catch (JSONException e) {
            e.printStackTrace();
        }

       websocketClient.sendDownLink(downLinkMessage);

        while(true){

        }
    }
}
