package asd.model;
import asd.service.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ProductTest {

    private Product pizza;

    @Before
    public void setUp(){
        pizza= new Product(1,"asd", "5", 5 );
//pizza.setProductDescription(5);
//pizza.setProductID(1);
    }

    @Test
    public void testGetProductId() {
        Integer expected = 1;
        Integer actual = pizza.getProductID();
        assertEquals(expected,actual);
    }

    @Test
    public void testGetProductName() {
        Integer expected = 1;
        Integer actual = Integer.valueOf(pizza.getProductName());
        assertEquals(expected,actual);
    }
    @Test
    public void testGetProductDescription() {
        String expected = "5";
        String actual = pizza.getProductDescription();
        assertEquals(expected,actual);
    }

    @Test
    public void testGetProductPrice() {
        double expected = 5;
        double actual = pizza.getProductPrice();
        assertEquals(expected,actual);
    }

    @Test
    public void testSetProductId() {
        Integer expected = 1;
        Integer actual = pizza.setProductID();
        assertEquals(expected,actual);
    }

    @Test
    public void testSetProductDescription() {
        String expected = "5";
        pizza.setProductDescription("5");
        String actual = pizza.getProductDescription();
        assertEquals(expected,actual);
    }

}







