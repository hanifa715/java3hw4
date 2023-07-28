package com.example.java3hw4;

public class Country {
    private String name;
    private String capital;
    private String flag;

    public Country(String name, String capital, String flagUrl) {
        this.name = name;
        this.capital = capital;
        this.flag = flagUrl;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getFlagUrl() {
        return flag;
    }
}
