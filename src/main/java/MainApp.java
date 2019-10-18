import org.json.JSONObject;

import java.io.IOException;

public class MainApp {

    public static void main(String[] args) {

        try {

            JSONObject obj = new JSONObject(new HttpService().connect("http://"+ApiConfig.APIURL+"&appid="+ApiConfig.ID));
            System.out.println(obj);
            System.out.println(obj.get("visibility"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
