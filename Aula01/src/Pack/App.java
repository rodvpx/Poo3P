package Pack;
public class App {
    public static void main(String[] args) throws Exception {
        
        Tv tv1 = new Tv(20, 10);

        tv1.status();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.mudarCanal(5);
        tv1.status();
        tv1.diminuirVolume();
        tv1.status();
        
    }
}
