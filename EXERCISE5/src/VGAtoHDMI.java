class HDMItoVGA implements VGA{
    private HDMI hdmi;
    
    public HDMItoVGA(HDMI hdmi){
        this.hdmi = hdmi;
    }

    @Override
    public void connectWithVGA() {
        System.out.println("Using Adapter to Connect to pc...");
        hdmi.connectWithHDMI();
    }
}
