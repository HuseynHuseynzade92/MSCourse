package com.project.myapp.designpatterns.abstractfactory;

public class WindowsZavodu implements Zavod{
    public Duyme duymeYarat(){
        return  new WindowsDuymesi();
    }

    @Override
    public Klaviatura klaviaturaYarat() {
        return new WindowsKlaviaturasi();
    }
}
