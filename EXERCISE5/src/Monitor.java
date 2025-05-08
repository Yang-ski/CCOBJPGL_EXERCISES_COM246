class Monitor {
    public void adapter(HDMI adapter) {
        System.out.println("This Monitor is Expecting an HDMI Connection");
        adapter.connectWithHDMI();
        System.out.println("Connection Success");
    }
}
