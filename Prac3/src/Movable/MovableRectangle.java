package Movable;

public class MovableRectangle extends MovablePoint implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    int x2, y2;

    public MovableRectangle(int x, int y, int x2, int y2, int xSpeed, int ySpeed){
        super(x, y, xSpeed, ySpeed);
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void moveUp(){
        topLeft = new MovablePoint(this.x, this.y+=ySpeed, this.xSpeed, this.ySpeed);
        bottomRight = new MovablePoint(this.x2, this.y2+=ySpeed, this.xSpeed, this.ySpeed);
    }

    @Override
    public void moveDown(){
        topLeft = new MovablePoint(this.x, this.y+=ySpeed, this.xSpeed, this.ySpeed);
        bottomRight = new MovablePoint(this.x2, this.y2+=ySpeed, this.xSpeed, this.ySpeed);
    }

    @Override
    public void moveLeft(){
        topLeft = new MovablePoint(this.x+=xSpeed, this.y, this.xSpeed, this.ySpeed);
        bottomRight = new MovablePoint(this.x2+=xSpeed, this.y2, this.xSpeed, this.ySpeed);
    }

    @Override
    public void moveRight(){
        topLeft = new MovablePoint(this.x+=xSpeed, this.y, this.xSpeed, this.ySpeed);
        bottomRight = new MovablePoint(this.x2+=xSpeed, this.y2, this.xSpeed, this.ySpeed);
    }

    @Override
    public String toString(){return this.x+" "+this.y+"   "+this.x2+" "+this.y2;}
}