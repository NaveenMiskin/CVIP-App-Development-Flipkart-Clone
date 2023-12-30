package com.example.flipkart_clone_2.Model;

public class MainModel3 {

    Integer langLogo;
    String langName;

    public  MainModel3(Integer langLogo, String langName){
        this.langLogo = langLogo;
        this.langName = langName;
    }

    public  Integer getLangLogo(){
        return  langLogo;
    }
    public String getLangName(){
        return langName;
    }
}
