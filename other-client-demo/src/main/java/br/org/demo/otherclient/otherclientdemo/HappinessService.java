package br.org.demo.otherclient.otherclientdemo;

public class HappinessService {

    private String happinessUrl;

    public HappinessService(String happinessUrl) {
        this.happinessUrl = happinessUrl;
    }

    public String getHappinessUrl() {
        return happinessUrl;
    }
}
