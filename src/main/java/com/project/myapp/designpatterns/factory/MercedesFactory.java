package com.project.myapp.designpatterns.factory;

public class MercedesFactory implements AvtomobilFactory {
    public  Avtomobil avtomobilYarat(){
        return new Mercedes();
    }

}
