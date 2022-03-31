package com.company;

public class Rectangle {
    double width;
    double height ;
    public Rectangle(){
       this(1.0,1.0);
    }
    public Rectangle(double width,double height){
       this.width=width;
       this.height=height;
    }
    public  double getArea(){
      return  this.height*this.width;
    }
    public double getPerimeter(){
         return  2*(this.height+this.width);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }


}
