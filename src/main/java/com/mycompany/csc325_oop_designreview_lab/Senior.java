package com.mycompany.csc325_oop_designreview_lab;

//connects Subclass of senior to Student
public class Senior extends Student {

    //Private variable for credits
    private int credits;

    //constructor for Senior class which sends Senior info to student
    public Senior(String name,short age, int credits){
        super(name, age);

        //check the number of credits and stops the program if there isnt enough
        if (credits < 85) {
            throw new IllegalArgumentException("Senior must have at least 85 credits.");
        }
        //confirms the credits
        this.credits = credits;
    }

}
