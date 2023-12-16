package com.project.myapp.solid.dependencyInversion;

public class Main {

    public static void main(String[] args) {
        YanacaqNovu benzinYanacagi = new Benzin();
        NeqliyyatVasitesi benzinliNeqliyyat = new NeqliyyatVasitesi(benzinYanacagi);
        benzinliNeqliyyat.iseSal();

        YanacaqNovu dizelliYanacaq = new Dizel();
        NeqliyyatVasitesi dizelliliNeqliyyat = new NeqliyyatVasitesi(dizelliYanacaq);
        dizelliliNeqliyyat.iseSal();
    }
}
