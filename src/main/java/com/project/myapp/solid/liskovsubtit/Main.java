package com.project.myapp.solid.liskovsubtit;

public class Main {
    public static void main(String[] args) {
        Hesab huqusiShexs = new HuquqiShexs("HH822", 10000);
        Hesab fizikiShexs = new FizikiShexs("HH28", 500);

        fizikiShexs.pulCek(200);
        huqusiShexs.pulCek(200);
    }
}
