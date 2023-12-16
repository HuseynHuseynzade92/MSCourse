package com.project.myapp.solid.liskovsubtit;

class Hesab {
    private String hesabNomresi;
    private int balans;

    public Hesab(String hesabNomresi, int balans) {
        this.hesabNomresi = hesabNomresi;
        this.balans = balans;
    }

    public String getHesabNomresi() {
        return hesabNomresi;
    }

    public double getBalans() {
        return balans;
    }

    public void pulCek(double mebleg) {
        if (mebleg <= balans) {
            balans -= mebleg;
            System.out.println("Pulları çəkmə əməliyyatı uğurla həyata keçirildi. Yeni balans: " + balans);
        } else {
            System.out.println("Kifayət qədər balans yoxdur.");
        }
    }

    public void pulYatir(double mebleg) {
        balans += mebleg;
        System.out.println("Pulları yatırma əməliyyatı uğurla həyata keçirildi. Yeni balans: " + balans);
    }
}

