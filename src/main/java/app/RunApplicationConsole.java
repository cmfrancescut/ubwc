package app;

import objects.Basket;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author cmfrance
 */
public class RunApplicationConsole {
    
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Basket basket = (Basket) context.getBean("Basket");
        
        System.out.println(basket.toString());
    }
    
}
