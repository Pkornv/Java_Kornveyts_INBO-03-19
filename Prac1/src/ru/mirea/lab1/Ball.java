package ru.mirea.lab1;

public class Ball {
    private String typeOfSport, color;
    private int radius;

    public Ball(String t, String c, int r){
        typeOfSport = t;
        color = c;
        radius = r;
    }

    public Ball(String t, String c){
        typeOfSport = t;
        color = c;
        radius = 10;
    }

    public Ball(String t){
        typeOfSport = t;
        color = "white";
        radius = 10;
    }

    public Ball(){
        typeOfSport = "football";
        color = "white";
        radius = 10;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTypeOfSport(String typeOfSport) {
        this.typeOfSport = typeOfSport;
    }

    public String getTypeOfSport(){
        return typeOfSport;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        return this.typeOfSport+", radius "+this.radius+", color "+this.color;
    }
}
