package com.project.myapp.solid.liskovsubtit;

public class HuquqiShexs extends  Hesab{
    public HuquqiShexs (String hesabNomresi, int balans){
        super(hesabNomresi, balans);
    }

    public void TicariEmeliyyatEt(){
        System.out.println("Ticari əməliyyat edildi.");
    }
}
