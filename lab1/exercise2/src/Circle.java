/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j43zhang
 */


public class Circle extends TwoDShape {
    
    private double radius;
  
    public Circle(int x, int y, double radius) {
        super(x, y);
        if (radius < 0){
            throw new IllegalArgumentException("R CANNOT BE NEGATIVE!");
        }
        this.radius = radius;
    }
    public double getradius(){
        return radius;
    }
    
    @Override
    public String toString(){
        return (radius+" ");
    }
    
    @Override
    public void scale(double factor) {
       if (factor <= 0){
           throw new IllegalArgumentException("FACTOR CANNOT BE NEGATIVE!");
       } 
       this.radius = radius/factor;
    }

}
