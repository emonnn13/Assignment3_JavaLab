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
public class Test {
    public static void main(String[] args) {
        Circle C = new Circle(10, "Red" , true);
        double p = C.getPerimeter();
        String s = C.toString();
        double a = C.getArea();
        System.out.println("Perimeter: "+p);
        System.out.println("Area: "+a);
        System.out.println("String: "+s);
        
        Rectangle R = new Rectangle(10,20 ,"Blue", true);
        double a1 = R.getArea();
        double p1 = R.getPerimeter();
        String s1 = R.toString();
        
        System.out.println("Area: "+a1);
        System.out.println("Perimeter: "+p1);
        System.out.println("String: "+s1);
        
        Square S = new Square(15, "Black", true);
        double a2 = S.getArea();
        double p2 = S.getPerimeter();
        System.out.println("Area: "+a2);
        System.out.println("Perimeter: "+p2);
        
        
    }
}
