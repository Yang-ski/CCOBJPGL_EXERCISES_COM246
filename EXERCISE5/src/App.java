public class App {
    public static void main(String[] args) throws Exception {
    
    VGA oldCable = new VGA();

    HDMI adapter = new VGAtoHDMI(oldCable);

    Monitor monitor = new Monitor();
    monitor.adapter(adapter);

    }
}
