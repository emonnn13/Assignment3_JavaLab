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
public class Rectangle extends Shape {
    double width;
    double length;
    
    Rectangle(){
        System.out.println("Rectange!");
    }
    
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        super.filled = filled;
        super.color = color;
    }
    public double getWidth(){
        return this.width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }
    
    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
    
}
