package com.project.myapp.designpatterns.factory;

import static com.project.myapp.designpatterns.factory.AvtomobilNovu.BMW;
import static com.project.myapp.designpatterns.factory.AvtomobilNovu.MERCEDES;

public class Sifarish {
    public static void main(String[] args) {
        var avtomobilFactory = createAvtomobilFactoryByType(MERCEDES);
        var avtomobil = avtomobilFactory.avtomobilYarat();
        avtomobil.gedir();
    }
    public static AvtomobilFactory createAvtomobilFactoryByType(AvtomobilNovu avtomobilNovu){
        return switch (avtomobilNovu){
            case BMW -> new BMWFactory();
            case MERCEDES -> new MercedesFactory();
        };
    }
}
