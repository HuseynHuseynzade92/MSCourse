package com.project.myapp.solid.singleresandopenclosed;

public class BusinessTask implements Task {
    @Override
    public void realizeTask(){
        System.out.println("Burada biznes məntiqlə bağlı işlər həyata keçiriləcək.");
    }
}
