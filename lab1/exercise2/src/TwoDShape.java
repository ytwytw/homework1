/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j43zhang
 */

public abstract class TwoDShape {
    
    protected int x;
    protected int y;

    public TwoDShape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public String toString(){
        return (x+" "+y);
    }

    public abstract void scale(double factor);
}

