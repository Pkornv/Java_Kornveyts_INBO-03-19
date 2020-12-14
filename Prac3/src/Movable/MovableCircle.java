package Movable;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        super(x, y, xSpeed, ySpeed);
        this.x = x;
        this.y =y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    @Override
    public void moveUp(){
        center = new MovablePoint(this.x, this.y+=ySpeed, this.xSpeed, this.ySpeed);
    }

    @Override
    public void moveDown(){
        center = new MovablePoint(this.x, this.y+=ySpeed, this.xSpeed, this.ySpeed);
    }

    @Override
    public void moveLeft(){
        center = new MovablePoint(this.x+=xSpeed, this.y, this.xSpeed, this.ySpeed);
    }

    @Override
    public void moveRight(){
        center = new MovablePoint(this.x+=xSpeed, this.y, this.xSpeed, this.ySpeed);
    }

    @Override
    public String toString(){return this.x+" "+this.y;}//"MovableCircle";}
}
