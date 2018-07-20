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
public class Circle extends Shape {
    double radius;
    
    Circle(){
        System.out.println("Circle");
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        super.color = color;
        super.filled = filled;
        
    }
    double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return 3.1416*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.1416*radius;
    }

    @Override
    public String toString() {
        return "Circle" ;
    }   
}