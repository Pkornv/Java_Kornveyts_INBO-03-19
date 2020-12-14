package Shape;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){}

    public Shape(String color, boolean filled){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return false;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String toString() {
        return "0";
    }
}