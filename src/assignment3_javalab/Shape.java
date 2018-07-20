/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_javalab;

/**
 *
 * @author Emon
 */
public abstract class Shape {
    String color;
    boolean filled;
    
    Shape(){
        //System.out.println("This is a shape");
    }
    Shape(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor;
    public void setColor(String color){
        this.color = color;
    }
    boolean isField;
    public void setFilled(boolean filled){
        this.filled = filled ;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public abstract String toString();
    
}
