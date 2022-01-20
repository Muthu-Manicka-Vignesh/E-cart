package com.myprograms;

import java.util.*;


public class ProductList {
     List<Product> productList = new ArrayList<>();

     public void  findProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getProductType().toLowerCase().contains(name.toLowerCase()) || product.getProductBrand().toLowerCase().contains(name.toLowerCase()) || product.getProductName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
            }
        }
    }

    public  Product findProduct(int productID){
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getProductID()==productID){
                return productList.get(i);
                }
            }
        return null;
        }

    public  boolean addProduct(int productID, String productName, String productBrand, String colour, double price, String variant, String productType, int stockAvailable, String description, String sellerDetails) {
        Product product = new Product(productID, productBrand, productName, variant, colour, price, productType,stockAvailable, sellerDetails, description);
        if (findProduct(productID) != null) {
            productList.add(product);
            return true;
        }
        return false;
    }

}
