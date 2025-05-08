public class App {
    public static void main(String[] args) throws Exception {
    
    HDMI oldCable = new HDMI();

    VGA adapter = new HDMItoVGA(oldCable);

    Monitor monitor = new Monitor();
    monitor.adapter(adapter);

    }
}
