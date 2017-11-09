package asd.model;

public class Product {

    private int productID;
    private String productName;
    private String productDescription;
    private double price;


    //Constructor

    public Product(int productId, String productName, String
            productDescription, double price) {

        this.productID = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
    }




//getters and setters

    public Integer getProductID() {
        return productID;
    }

    public Integer setProductID() {
        this.productID = productID;
        return null;
    }

    public String getProductName() {
       return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {

        return price;
    }

    public double setProductPrice(Double price) {
        this.price = price;
        return 0;
    }
    public void setTotalPrice(double price) {
        this.price= price;
    }
    //display of informations

    public String printInfo()
    {
        return "price=       " + price + ", productDescription=          "
                + productDescription + ", productId=           " + productID
                + ", productName=              " + productName;
    }



}
