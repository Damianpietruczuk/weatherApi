import java.io.IOException;

public class MainApp {
    public static void main(String[] args) {
        try {
            System.out.println(new HttpService().connect("http://"+ApiConfig.APIURL+"&appid="+ApiConfig.ID));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
