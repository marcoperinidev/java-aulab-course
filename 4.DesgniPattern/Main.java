import com.example.Configuration;
import com.example.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton.getInstance().doSomething();

        Configuration config = Configuration.getInstance();

        // imposta porta ed indirizzo del server farlocco
        config.setServerAddress("127.0.0.1");
        config.setServerPort(8080);

        // Recupera l'indirizzo del server farlocco e la porta del server
        String serverAddress = config.getServerAddress();
        int serverPort = config.getServerPort();

        // Stampiamo le config del serveer farlocco
        System.out.println("Indirizzo del server: " + serverAddress);
        System.out.println("Porta del server: " + serverPort);


    }
}
