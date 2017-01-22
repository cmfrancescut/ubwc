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
public class BasketColour {
    
    private String primaryColour;
    private String secondaryColour;

    public String getPrimaryColour() {
        return primaryColour;
    }

    public void setPrimaryColour(String primaryColour) {
        this.primaryColour = primaryColour;
    }

    public String getSecondaryColour() {
        return secondaryColour;
    }

    public void setSecondaryColour(String secondaryColour) {
        this.secondaryColour = secondaryColour;
    }
    
    public String toString()
    {
        return "Primary Colour: " + primaryColour + "\nSecondary Colour: " + secondaryColour;
    }
    
}
