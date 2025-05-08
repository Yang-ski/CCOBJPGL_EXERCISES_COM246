class Monitor {
    public void adapter(VGA adapter) {
        System.out.println("This Monitor is Expecting an VGA Connection");
        adapter.connectWithVGA();
        System.out.println("Connection Success");
    }
}
