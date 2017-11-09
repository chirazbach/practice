package asd.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> productList = new ArrayList<>();



	public ShoppingCart( ){

        }

    public int getProductCount() {

        return productList.size();
    }

    public void addProduct(Product product) {

        productList.add(product);
    }


    public double getTotalCartValue() {
       double totalCartValue=0 ;

        if (productList.size() > 0) {

            for (Product product : productList) {
                totalCartValue = totalCartValue + product.getProductPrice();
            }
        }
        return totalCartValue;
    }


    public void removeProduct(Product p) {
        productList.remove(p);
    }
}





