package it.aulab.model;

public class Suite {
    private String colore;

    private Mask mask;

    private Hook hook;

    public Suite(String colore, Mask mask, Hook hook) {
        System.out.println("Create Suite color: " + colore);
        this.colore = colore;
        this.mask = mask;
        this.hook = hook;
    }

    public Suite() {
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public Mask getMask() {
        return mask;
    }

    public void setMask(Mask mask) {
        this.mask = mask;
    }

    public Hook getHook() {
        return hook;
    }

    public void setHook(Hook hook) {
        this.hook = hook;
    }
}
