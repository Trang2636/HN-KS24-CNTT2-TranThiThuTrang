package com.rikkeiedu.managerment;

public class Student {
    private static int idCounter =1;
    private final int id;
    private String fullName;
    private int score;
    private final String className;
    public Student (String fullName,int score, String className){
        this.id = idCounter ++;
        this.fullName=fullName;
        this.score=score;
        this.className=className;
    }

}
