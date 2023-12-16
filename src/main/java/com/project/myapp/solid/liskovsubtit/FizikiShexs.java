package com.project.myapp.solid.liskovsubtit;

public class FizikiShexs extends Hesab{
    public FizikiShexs(String hesabNomresi, int balans){
        super(hesabNomresi, balans);
    }
    public void fizikiEmeliyyatEdin() {
        System.out.println("Fiziki əməliyyatı edildi.");
    }
}
