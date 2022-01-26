/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleweek2;

/**
 *
 * @author seanz
 */
public class ParTimeStudent extends student{
    private int munCourse;
    public ParTimeStudent(String name, int num, int numCourse){
        super(name, num); //call the constructor of student class
        this.munCourse=numCourse;
    }
    public int getMunCourse() {
        return munCourse;
    }

    public void setMunCourse(int munCourse) {
        this.munCourse = munCourse;
    }
    
    
}
