package Movable;

public class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void newN(){
        if (this.ySpeed>0)
            moveUp();
        else if (this.ySpeed<0)
            moveDown();
        if (this.xSpeed>0)
            moveRight();
        else if (this.xSpeed<0)
            moveLeft();
    }

    @Override
    public void moveUp(){ y = y + ySpeed; }

    @Override
    public void moveDown(){ y = y + ySpeed; }

    @Override
    public void moveLeft(){ x = x + xSpeed; }

    @Override
    public void moveRight(){ x = x + xSpeed; }

    @Override
    public String toString(){ return this.x+" "+this.y;}//"MovablePoint";}
}
