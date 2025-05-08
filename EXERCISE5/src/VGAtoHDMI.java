class HDMItoVGA implements VGA{
    private HDMI hdmi;
    
    public HDMItoVGA(HDMI hdmi){
        this.hdmi = hdmi;
    }

    @Override
    public void connectWithVGA() {
        System.out.println("Using an HDMI cable Via HDMI to VGA adapter...");
        hdmi.connectWithHDMI();
    }
}
