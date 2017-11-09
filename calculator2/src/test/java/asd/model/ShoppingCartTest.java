package asd.model;

import org.easymock.EasyMock;
import org.easymock.IExpectationSetters;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {
    @Test

    public void testCreateEmptyShoppingCart() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0, cart.getProductCount());
    }

    @Test

    public void testAddSingleProductToShoppingCart() {
        ShoppingCart cart = new ShoppingCart();



        Product product;
        Product product1;
        Product product2;


            product = EasyMock.createMock(Product.class);
            product1 = EasyMock.createMock(Product.class);
            product2 = EasyMock.createMock(Product.class);


            int expected = 3;
            Integer delta = null;

        cart.addProduct(product);
        cart.addProduct(product1);
        cart.addProduct(product2);

        //Create the mock object of product
       Product productMock = EasyMock.createMock(Product.class);


              EasyMock.expect(product.getProductPrice()).andReturn(40.0).anyTimes();
              EasyMock.expect(product1.getProductPrice()).andReturn(20.0).anyTimes();
              EasyMock.expect(product2.getProductPrice()).andReturn(20.0).anyTimes();


              EasyMock.expect(productMock.getProductPrice()).andReturn(600.0);
              EasyMock.replay(product, product1,product2);
              System.out.println(productMock.getProductPrice());
              System.out.println(cart.getProductCount());


              assertEquals(expected, cart.getProductCount());

             float expected1 = 80;
        System.out.println("-----------"+cart.getTotalCartValue());
            double actual = cart.getTotalCartValue();
              assertEquals(String.format("%f not equals %f",expected1, actual),expected1, actual,1e-4);

    }
    }



