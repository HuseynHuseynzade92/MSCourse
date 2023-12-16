package com.project.myapp.designpatterns.abstractfactory;

public class Musteri {
    private  Duyme duyme;
    private Klaviatura klaviatura;

    public Musteri(Zavod zavod) {
        this.duyme = zavod.duymeYarat();
        this.klaviatura = zavod.klaviaturaYarat();
    }
    public void goster() {
        duyme.goster();
        klaviatura.goster();
    }
    public static void main(String[] args) {
        Musteri windowsMusteri = new Musteri(new WindowsZavodu());
        windowsMusteri.goster();


        Musteri macosMusteri = new Musteri(new MacOSZavodu());
        macosMusteri.goster();
    }
}
