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
public class Square extends Rectangle{
    Square(){
           System.out.println("Square");
    }
    Square(double side){
        super(side, side);
    }
    Square(double side, String color, boolean filled){
        
    }
    public double getSide(){
        return length;
    }
    
    public void setSide(double side){
        this.length = side;
    }
    @Override
    public void setWidth(double width){
        this.width = width;
    }
    @Override
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea(){
        return length*length;
    }
    @Override
    public double getPerimeter(){
        return 4*length;
    }
    @Override
    public String toString() {
        return "Square";
    }
    
}    
