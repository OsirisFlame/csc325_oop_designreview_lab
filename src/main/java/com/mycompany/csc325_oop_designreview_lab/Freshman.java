package com.mycompany.csc325_oop_designreview_lab;

//connects the subclass of Freshman to its superclass of Student
public class Freshman extends Student {



    private int credits;

    public Freshman(String name,short age, int credits){
        super(name, age);
        this.credits = credits;
    }

    //Allows you to alter the number of credits while keeping variable priv
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    @Override
    public String toString(){
        return "Freshman: "+getName()+ ", Age: "+getAge()+", GPA: "+getGPA()+ ", Credits "+ getCredits();

    }

}
