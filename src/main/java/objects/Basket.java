package objects;

/**
 * Basket class for UBWC demo project.
 * @author cmfrance
 */
public class Basket {
    
    private BasketColour colour;
    private BasketSize size;
    private BasketShape shape;
    
    public Basket(BasketColour colour, BasketSize size, BasketShape shape)
    {
        this.colour = colour;
        this.size = size;
        this.shape = shape;
    }
    
    public String toString()
    {
        return "\n\n\nBASKET DETAILS\n" + colour.toString() + "\n"
                + size.toString() + "\n" + shape.toString();
    }
    
}
