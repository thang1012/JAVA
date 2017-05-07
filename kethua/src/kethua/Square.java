/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;

/**
 *
 * @author THANG NGUYEN
 */
public class Square implements Shape{
    private double x;

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }
    public Square(double x)
        {
            setX(x);
        }
    public Square()
    {
        setX(x);
    }
    @Override
    public double CV() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     
    return x*x;
    }

    @Override
    public double DT() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (x+x)/2;
    }
}
