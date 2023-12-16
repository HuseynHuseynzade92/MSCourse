package com.project.myapp.solid.dependencyInversion;

public class NeqliyyatVasitesi {
    private YanacaqNovu yanacaq;

    public NeqliyyatVasitesi(YanacaqNovu yanacaq) {
        this.yanacaq = yanacaq;
    }

    public void iseSal() {
        System.out.println("Nəqliyyat vasitəsi işə salınır.");
        yanacaq.yanacaqIstEt();
    }
}
