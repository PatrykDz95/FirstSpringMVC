package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;

    private String lastName;

    private String country;

    private String favoriteLanguage;

    private String[] operatingSystem;

    private LinkedHashMap<String, String> countryOptions;

    private LinkedHashMap<String, String> favoriteLanguageList;

    public Student(){
//populate country options: used ISO country code
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("PL", "Poland");
        countryOptions.put("Mr", "Mexico");
        countryOptions.put("Sw", "Sweden");

        favoriteLanguageList = new LinkedHashMap<>();
        favoriteLanguageList.put("Java", "Java");
        favoriteLanguageList.put("Ruby", "Ruby");
        favoriteLanguageList.put("C#", "C#");
        favoriteLanguageList.put("PHP", "PHP");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageList() {
        return favoriteLanguageList;
    }

    public String[] getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String[] operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
