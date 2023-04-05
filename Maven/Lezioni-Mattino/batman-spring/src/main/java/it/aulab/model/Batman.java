package it.aulab.model;

public class Batman {
    private Suite suite;

    private Batmobile batmobile;
    
    public Batman(Suite suite, Batmobile batmobile) {
        System.out.println("Create Batman");
        this.suite = suite;
        this.batmobile = batmobile;
    }

    public Batman() {
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public Batmobile getBatmobile() {
        return batmobile;
    }

    public void setBatmobile(Batmobile batmobile) {
        this.batmobile = batmobile;
    }

}
