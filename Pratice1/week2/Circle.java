package Pratice1.week2;

class Circle {
    double radius;
    static final double PI = 3.1416;

    public Circle(){
    }
    
    public Circle(double radius){
        this.radius = radius;
    
    }
    public double getArea(){
        return radius * radius * PI ;
    }

   
}
