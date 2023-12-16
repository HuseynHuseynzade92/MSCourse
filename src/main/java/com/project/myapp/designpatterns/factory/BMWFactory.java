package com.project.myapp.designpatterns.factory;

public class BMWFactory implements AvtomobilFactory {
    public Avtomobil avtomobilYarat (){
        return  new BMW();
    }
}
