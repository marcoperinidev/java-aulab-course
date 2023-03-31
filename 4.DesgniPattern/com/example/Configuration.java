package com.example;

public class Configuration {
    private static Configuration instance = null;
    private String serverAddress;
    private int serverPort;

    private Configuration() {
        this.serverAddress = "localhost";
        this.serverPort = 8080;
        System.out.println("Config farlocca inizializzata");
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public void setServerAddress(String address) {
        this.serverAddress = address;
    }

    public void setServerPort(int port) {
        this.serverPort = port;
    }

    public String getServerAddress() {
        return this.serverAddress;
    }

    public int getServerPort() {
        return this.serverPort;
    }
}
