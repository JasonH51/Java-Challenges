package Challenges;

public class Circle {
    // write your code here
    private double radius;
    
    public Circle(double num){
         if(num < 0){
           this.radius = 0;
        }else {
            this.radius = num;
        }
    }
    
 
    
    public double getRadius (){
        return this.radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}