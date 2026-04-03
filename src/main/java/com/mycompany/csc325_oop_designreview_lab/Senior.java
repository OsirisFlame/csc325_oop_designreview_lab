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

    //Getters and setters for Senior in its Class
    public int getCredits(){
        return credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }

    //Override method to print the Seniors info
    @Override
    public String toString(){
        return "Senior: "+getName()+ ", Age: "+getAge()+", GPA: "+getGPA()+ ", Credits "+ getCredits();
    }

}
