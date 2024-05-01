package com.saivikas.annotations;
@VeryImportant
public class POJO {
    @ImportantString
    String name;
    int id;

    public POJO(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @RunImmediately(times = 3)
    public void print(){
        System.out.println("method in class POJO");
    }
}
