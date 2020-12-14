package Shape;

import java.awt.*;

public class Square extends Rectangle {
    public Square(){
        length = 5;
        width = 5;
    }

    public Square(double side){
        this.length = side;
        this.width = side;
    }

    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.filled = filled;
        this.color = color;
    }

    public double getSide(){
        return this.length;
    }

    public void setSide(double side){

    }

    public void setWidth(double side){
        this.length = side;
    }

    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: "+this.length+", color: "+this.color;
    }
}
