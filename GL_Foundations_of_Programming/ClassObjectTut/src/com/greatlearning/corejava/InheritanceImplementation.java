package com.greatlearning.corejava;
class CircleArea{
    void circleArea(){
        System.out.println("The Area of Circle with radius 4.5 cm is " + (3.14f*4.5f*4.5f)+" cmsq.");
    }
}
    class RectangleArea extends CircleArea{
        void rectangleArea(){
        System.out.println("The Area of Rectangle with Length 4.5 cm and Width 10.6 cm is " + (10.6f*4.5)+" cmsq.");
            
    }
}
class TriangleArea extends RectangleArea{
    void triangleArea(){
        System.out.println("The Area of Triangle with base 4.5 cm and height 10.6cm is " + (2*4.5f*10.6f)+" cmsq.");

    }
}


public class InheritanceImplementation {
    public static void main(String[] args) {
        TriangleArea tArea = new TriangleArea();
        tArea.circleArea();
        tArea.rectangleArea();
        tArea.triangleArea();
        
    }
}
