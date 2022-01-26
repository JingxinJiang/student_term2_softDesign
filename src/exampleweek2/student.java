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
public class student {
    private String name;
    private int num;
public student(){
    name="lucy";
    num=40;
}
public student(String name, int num){
    this.name=name;
    this.num=num;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
}
