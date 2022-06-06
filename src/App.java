import entities.Stock;

public class App {
    public static void main(String[] args) throws Exception {
        Thread DBconnection = new Thread(new Stock());
        DBconnection.start();
    }
}
