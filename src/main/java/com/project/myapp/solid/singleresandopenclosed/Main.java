package com.project.myapp.solid.singleresandopenclosed;

public class Main {
    public static void main(String[] args) {
        Task business = new BusinessTask();
        business.realizeTask();

        Task db=new DataBaseTask();
        db.realizeTask();
    }
}
