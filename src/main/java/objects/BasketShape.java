/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author cmfrance
 */
public class BasketShape {
    
    private String shape;
    
    public void setShape(String shape)
    {
        this.shape = shape;
    }
    
    public String getshape()
    {
        return shape;
    }
    
    public String toString()
    {
        return "Shape: " + shape;
    }
    
}
