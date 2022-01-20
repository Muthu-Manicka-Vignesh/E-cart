package com.myprograms;


import java.util.Comparator;


public class Product  {
    private int productID;
    private String productBrand;
    private String productName;
    private String variant;
    private String colour;
    private double price;
    private String sellerDetails;
    private String description;
    private String productType;
    private int stockAvailable;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Product(int productID, String productBrand, String productName, String variant, String colour, double price, String productType, int stockAvailable, String sellerDetails, String description) {
        this.productID = productID;
        this.productName = productName;
        this.productBrand = productBrand;
        this.colour = colour;
        this.price = price;
        this.variant = variant;
        this.sellerDetails = sellerDetails;
        this.description = description;
        this.productType= productType;
        this.stockAvailable = stockAvailable;

    }

    public Product() {
    }

    public String getDescription() {
        return description;
    }

    public int getStockAvailable() {
        return stockAvailable;
    }

    public void setStockAvailable(int stockAvailable) {
        this.stockAvailable = stockAvailable;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getSellerDetails() {
        return sellerDetails;
    }

    public void setSellerDetails(String sellerDetails) {
        this.sellerDetails = sellerDetails;
    }

    @Override
    public String toString() {
        return " Product ID : " + productID  + ", " + productBrand + " " + productName + " | " + variant + " | " + colour +
                " | Rs." + price + " | sold by " + sellerDetails + " | " + stockAvailable + " stock(s) left ";
    }

    public String toStrings() {
        return " Product ID : " + productID  + ", " + productBrand + " " + productName + " | " + variant + " | " + colour ;
    }

}


