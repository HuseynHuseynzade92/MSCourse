package com.project.myapp.designpatterns.abstractfactory;

public class MacOSZavodu implements Zavod{

    public  Duyme duymeYarat(){
        return  new MacOSDuymesi();
    }
    public Klaviatura klaviaturaYarat(){
        return new MacOSKlaviaturasi();
    }

}
