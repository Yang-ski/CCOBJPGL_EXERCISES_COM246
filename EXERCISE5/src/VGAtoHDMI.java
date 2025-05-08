class VGAtoHDMI implements HDMI{
    private VGA vga;
    
    public VGAtoHDMI(VGA vga){
        this.vga = vga;
    }

    @Override
    public void connectWithHDMI() {
        System.out.println("Using a VGA cable Via VGA to HDMI adapter...");
        vga.connectWithVGA();
    }
}
