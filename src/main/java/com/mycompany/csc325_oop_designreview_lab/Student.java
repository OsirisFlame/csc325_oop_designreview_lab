/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
// ToDo 1: Make this class a child of Human (done)

    //connects Students as a subclass to its baseclass of Human
public class Student extends Human{

    // ToDo 2: Fix the resulting errors (done)
    //creates private variables that cant be accessed
    private String address;
    private double GPA;

    //Allows you to input Student information such as name and age
        public Student (String name, short age){
        super(name, age);
        }

        //Allows you to input Student addresses while remaining private
    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

	// ToDo 3: Add a field for GPA and create a setter and a getter (done)
    // allows GPA to be accessed and altered while remaining private
	public double getGPA(){
        return GPA;
    }

    public void setGPA(double GPA){
            this.GPA = GPA;
    }

    //Base override method for student INFO
    @Override
    public String toString(){
    return "Student: "+getName()+ ", Age: "+getAge()+", GPA: "+getGPA();
    }

	// ToDo 4: Add comments to your code (done)
}
