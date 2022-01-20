package com.myprograms;

import java.io.IOException;
import java.util.*;

public class eCart {
     Scanner scanner = new Scanner(System.in);
     static ProductList productList = new ProductList();
     static List<Product> cart = new ArrayList<>();

     public void startECart(){
         addingProducts();
         eCartPage();
     }

    public void eCartPage() {
        System.out.println("E-cart");
        System.out.println("Options : ");
        System.out.println("1 - Search for product");
        System.out.println("2 - View all products");
        System.out.println("3 - TVs");
        System.out.println("4 - Mobile Phones");
        System.out.println("5 - Watches");
        System.out.println("6 - Exit");
        System.out.println("Please enter a number corresponding to the option.");
        int x = getAChoice();
        scanner.nextLine();
        switch (x) {
            case 1:
                search();
            case 2:
                printProductList();
                categories();
            case 3:
                productList.findProduct("TV");
                categoriesTV();
            case 4:
                productList.findProduct("Mobile Phone");
                categoriesMp();
            case 5:
                productList.findProduct("Watch");
                categoriesW();
            case 6:
                System.exit(0);
            default:
                System.out.println("please enter only from the available options");
                eCartPage();
        }

    }

    public int getAChoice(){
        while (true){
            try{
                return scanner.nextInt();
            }catch (InputMismatchException e ){
                scanner.nextLine();
                System.out.println("Please enter on a number based on the available options options");
            }
        }
    }

    public void search(){
        System.out.println("Enter what you are looking for");
        String y= scanner.nextLine();
        productList.findProduct(y);
        System.out.println("Options : ");
        System.out.println("0 - Return to Main Menu");
        System.out.println("1 - Add a product to cart");
        System.out.println("Please enter a number corresponding to the option.");
        int x= getAChoice();
        scanner.nextLine();
        subMenuSearch(x);
    }

    public void subMenuSearch(int x){
        switch (x){
            case 0:
                eCartPage();
            case 1:
                addingProductToCart();
            default:
                System.out.println("Choose only from available options");
                int s= scanner.nextInt();
                subMenuSearch(s);
        }
    }




    //watches
    public void categoriesW() {
        System.out.println("Options : ");
        System.out.println("0 - Return to Main Menu");
        System.out.println("1 - Sort by");
        System.out.println("2 - Add a product to cart");
        System.out.println("Please enter a number corresponding to the option.");
        int x = getAChoice();
        scanner.nextLine();
        subMenuW(x);
    }

    public void subMenuW(int x){
        if(x<=2 && x>=0){
            switch (x){
                case 0:
                    eCartPage();
                    break;
                case 1:
                    sortingW();
                case 2:
                    addingProductToCart();
                    System.out.println("Available options:");
                    System.out.println("0 - Return to Main Menu");
                    System.out.println("1 - Proceed to payment");
                    System.out.println("Please enter a number corresponding to the option.");
                    int z= getAChoice();
                    scanner.nextLine();
                    subMenu2(z);
                default:
                    System.out.println("Enter only from available options");
                    int a= getAChoice();
                    subMenuW(a);
            }
        }
    }
    public void sortingW(){
        System.out.println("Available options:");
        System.out.println("0 - Return to Main Menu");
        System.out.println("1 - Sort by price : higher to lower");
        System.out.println("2 - Sort by price : lower to higher");
        System.out.println("Please enter a number corresponding to the option.");
        int y=getAChoice();
        scanner.nextLine();
        switch (y){
            case 0:
                eCartPage();
            case 1:
                priceSorter2W();
            case 2:
                priceSorterW();

            default:
                System.out.println("Enter an option only from available options");
                int z= scanner.nextInt();
                sortingW();
        }
    }

    public void subMenu(int x){
        if(x<=2 && x>=0){
            switch (x){
                case 0:
                    eCartPage();
                    break;
                case 1:
                    System.out.println("Available options:");
                    System.out.println("0 - Return to Main Menu");
                    System.out.println("1 - Sort by price : higher to lower");
                    System.out.println("2 - Sort by price : lower to higher");
                    System.out.println("Please enter a number corresponding to the option.");
                    int y=getAChoice();
                    scanner.nextLine();
                    sorting(y);
                case 2:
                    addingProductToCart();
                    System.out.println("Available options:");
                    System.out.println("0 - Return to Main Menu");
                    System.out.println("1 - Proceed to payment");
                    System.out.println("Please enter a number corresponding to the option.");
                    int z= getAChoice();
                    scanner.nextLine();
                    subMenu2(z);
                default:
                    System.out.println("Enter only from available options");
                    int a= getAChoice();
                    subMenu(a);
            }
        }
    }

    //TV

    public void categoriesTV() {
        System.out.println("Options : ");
        System.out.println("0 - Return to Main Menu");
        System.out.println("1 - Sort by");
        System.out.println("2 - Add a product to cart");
        System.out.println("Please enter a number corresponding to the option.");
        int x= getAChoice();
        scanner.nextLine();
        subMenuTV(x);
    }

    public void subMenuTV(int x){
        if(x<=2 && x>=0){
            switch (x){
                case 0:
                    eCartPage();
                    break;
                case 1:
                    System.out.println("Available options:");
                    System.out.println("0 - Return to Main Menu");
                    System.out.println("1 - Sort by price : higher to lower");
                    System.out.println("2 - Sort by price : lower to higher");
                    System.out.println("Please enter a number corresponding to the option.");
                    int y=getAChoice();
                    scanner.nextLine();
                    sortingTV(y);
                case 2:
                    addingProductToCart();
                    System.out.println("Available options:");
                    System.out.println("0 - Return to Main Menu");
                    System.out.println("1 - Proceed to payment");
                    System.out.println("Please enter a number corresponding to the option.");
                    int z= getAChoice();
                    scanner.nextLine();
                    subMenu2(z);
                default:
                    System.out.println("Enter only from available options");
                    int a= getAChoice();
                    subMenuTV(a);
            }
        }
    }

    public void sortingTV(int y){

        switch (y){
            case 0:
                eCartPage();
            case 1:
                priceSorter2TV();
            case 2:
                priceSorterTV();
            default:
                System.out.println("Enter an option only from available options");
                int z= scanner.nextInt();
                sortingTV(z);
        }
    }

    //mobile

    public void categoriesMp() {
        System.out.println("Options : ");
        System.out.println("0 - Return to Main Menu");
        System.out.println("1 - Sort by");
        System.out.println("2 - Add a product to cart");
        System.out.println("Please enter a number corresponding to the option.");
        int x= getAChoice();
        scanner.nextLine();
        subMenuMp(x);
    }

    public void subMenuMp(int x){
        if(x<=2 && x>=0){
            switch (x){
                case 0:
                    eCartPage();
                    break;
                case 1:
                    System.out.println("Available options:");
                    System.out.println("0 - Return to Main Menu");
                    System.out.println("1 - Sort by price : higher to lower");
                    System.out.println("2 - Sort by price : lower to higher");
                    System.out.println("Please enter a number corresponding to the option.");
                    int y=getAChoice();
                    scanner.nextLine();
                    sortingMP(y);
                case 2:
                    addingProductToCart();
                    System.out.println("Available options:");
                    System.out.println("0 - Return to Main Menu");
                    System.out.println("1 - Proceed to payment");
                    System.out.println("Please enter a number corresponding to the option.");
                    int z= getAChoice();
                    scanner.nextLine();
                    subMenu2(z);
                default:
                    System.out.println("Enter only from available options");
                    int a= getAChoice();
                    subMenuMp(a);
            }
        }
    }

    public void sortingMP(int x){
        switch (x){
            case 0:
                eCartPage();
            case 1:
                priceSorter2mp();
            case 2:
                priceSorterMp();
            default:
                System.out.println("Enter an option only from available options");
                int z= scanner.nextInt();
                sortingMP(z);
        }
    }

    //general
    public void categories() {
        System.out.println("Options : ");
        System.out.println("0 - Return to Main Menu");
        System.out.println("1 - Sort by");
        System.out.println("2 - Add a product to cart");
        int x= getAChoice();
        scanner.nextLine();
        subMenu(x);
    }
    public void sorting(int x){
        switch (x){
            case 0:
                eCartPage();
            case 1:
                priceSorter2();
                categories();
            case 2:
                priceSorter();
                categories();
            default:
                System.out.println("Enter an option only from available options");
                int z= scanner.nextInt();
                sorting(z);
        }
    }


    public void subMenu2(int x){
        switch (x){
            case 0:
                eCartPage();
            case 1:
                payment();
            default:
                System.out.println("Choose only from available options");
                int z=getAChoice();
                subMenu2(z);
        }
    }

    public void printProductList() {
        productList.productList.sort(new NameSorter());
        for (Product product : productList.productList) {
            System.out.println(product);
        }
    }

    public void addingProductToCart () {
        System.out.println("Enter the Product ID");
        int productID = getAChoice();
        addingProductsToCart(productID);
    }
    public static void addingProductsToCart(int productID) {
        for (int i = 0; i < productList.productList.size(); i++) {
            if (productList.productList.get(i).getProductID()==(productID)) {
                cart.add(productList.findProduct(productID));
                System.out.println("Cart");
                for (int j = 0; j< cart.size(); j++){
                    String s = " Product ID : " + cart.get(j).getProductID()  + ", " + cart.get(j).getProductBrand() + " " + cart.get(j).getProductName() + " | " + cart.get(j).getVariant() + " | " + cart.get(j).getColour();
                    String p = ""+ cart.get(j).getPrice();
                    System.out.printf("%-50s%10s%n", s,p);
                }
            }
        }
    }
    public void priceSorter(){
        productList.productList.sort(new priceSorter01());
        for (Product product : productList.productList) {
            System.out.println(product);
        }
    }
    public void priceSorter2(){
        Collections.sort(productList.productList, Collections.reverseOrder(new priceSorter01()));
        for (Product product : productList.productList) {
            System.out.println(product);
        }
    }
    public void priceSorterTV() {
        productList.productList.sort(new priceSorter01());
        for (Product product : productList.productList) {
            if (product.getProductType().toLowerCase().contains("tv")) {
                System.out.println(product);
            }
        }
        categoriesTV();
    }
    public void priceSorter2TV() {
        Collections.sort(productList.productList, Collections.reverseOrder(new priceSorter01()));
        for (Product product : productList.productList) {
            if (product.getProductType().toLowerCase().contains("tv")) {
                System.out.println(product);
            }
        }
        categoriesTV();
    }
    public void priceSorterMp() {
        productList.productList.sort(new priceSorter01());
        for (Product product : productList.productList) {
            if (product.getProductType().toLowerCase().contains("mobile")) {
                System.out.println(product);
            }
        }
        categoriesMp();
    }
    public void priceSorter2mp(){
        Collections.sort(productList.productList, Collections.reverseOrder(new priceSorter01()));
        for (Product product : productList.productList) {
            if (product.getProductType().toLowerCase().contains("mobile")) {
                System.out.println(product);
            }
        }
        categoriesMp();
    }
    public void priceSorterW() {
        productList.productList.sort(new priceSorter01());
        for (Product product : productList.productList) {
            if (product.getProductType().toLowerCase().contains("watch")) {
                System.out.println(product);
            }
        }
        categoriesW();
    }
    public void priceSorter2W() {
        Collections.sort(productList.productList, Collections.reverseOrder(new priceSorter01()));
        for (Product product : productList.productList) {
            if (product.getProductType().toLowerCase().contains("watch")) {
                System.out.println(product);
            }
        }
        categoriesW();
    }
    public void payment() {
        double total=0;
         try {
            for (int j = 0; j< cart.size(); j++){
                String s = " Product ID : " + cart.get(j).getProductID()  + ", " + cart.get(j).getProductBrand() + " " + cart.get(j).getProductName() + " | " + cart.get(j).getVariant() + " | " + cart.get(j).getColour();
                String p = ""+ cart.get(j).getPrice();
                System.out.printf("%-50s%10s%n", s,p);
                total+=cart.get(j).getPrice();
            }
             System.out.println("Total = " + total);
            System.out.println("Directing to payment Gateway");
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("Payment completed");
            checkout();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void checkout() {
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your phone number");
        try {
            long phone = scanner.nextLong();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Please enter only numbers");

        }
        System.out.println("Enter your email id");
        String email = scanner.nextLine();
        System.out.println("Enter your address");
        String address = scanner.nextLine();
        System.out.println("Thank you for Shopping with us " + name);
        try {
            Thread.sleep(1000);
            System.out.println("Your invoice has been sent to " + email);
            Thread.sleep(1000);
            System.out.println("Your products: ");
            for (int j = 0; j < cart.size(); j++) {
                Thread.sleep(1000);
                String s = " Product ID : " + cart.get(j).getProductID() + ", " + cart.get(j).getProductBrand() + " " + cart.get(j).getProductName() + " | " + cart.get(j).getVariant() + " | " + cart.get(j).getColour();
                String p = "" + cart.get(j).getPrice();
                System.out.printf("%-50s%10s%n", s, p);
                cart.get(j).setStockAvailable(cart.get(j).getStockAvailable()-1);
            }
            Thread.sleep(1000);
            System.out.println("Expected Delivery time 2-3 days");
            Thread.sleep(1000);
            System.out.println("Thank you");
            System.out.println("Options: ");
            System.out.println("0 - Return to main menu");
            System.out.println("1 - Exit");
            System.out.println("Please enter a number corresponding to the option.");
            int x=getAChoice();
            end(x);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void end(int x){
         switch (x){
             case 0 :
                 eCartPage();
             case 1:
                 System.exit(0);
             default:
                 System.out.println("Choose only from available options");
                 int y = scanner.nextInt();
                 end(y);
         }
    }

    public  void addingProducts(){
        Product mp1 = new Product(1001, "Xiaomi", "11X Pro", "8GB RAM||128GB Storage", "Cosmic Black", 39000.00, "Mobile phone", 10000, "Xiaomi", "Package contents\n" +
                "Xiaomi 11X Pro , 33W power adapter, USB Type-C cable, warranty card, user guide, SIM insertion tool\n" +
                "\n");
        productList.productList.add(mp1);
        Product mp2 = new Product(1002, "Xiaomi", "11X Pro", "8GB RAM||128GB Storage", "Lunar White", 39000.00, "Mobile phone", 5000, "Xiaomi", "Package contents\n" +
                "Xiaomi 11X Pro , 33W power adapter, USB Type-C cable, warranty card, user guide, SIM insertion tool\n" +
                "\n");
        productList.productList.add(mp2);
        Product mp3 = new Product(1003, "Xiaomi", "11X Pro", "8GB RAM||128GB Storage", "Celestial Silver", 39000.00, "Mobile phone", 10000, "Xiaomi", "Package contents\n" +
                "Xiaomi 11X Pro , 33W power adapter, USB Type-C cable, warranty card, user guide, SIM insertion tool\n" +
                "\n");
        productList.productList.add(mp3);
        Product mp4 = new Product(1004, "Xiaomi", "Redmi Note 11T 5G", "6GB RAM||64GB Storage", "Matte Black", 22000.00, "Mobile phone", 1000, "Poorvika Mobiles", "Package contents\\n" +
                "Xiaomi Redmi Note 11T 5G , 33W power adapter, USB Type-C cable, warranty card, user guide, SIM insertion tool\n" +
                "\n");
        productList.productList.add(mp4);
        Product mp5 = new Product(1005, "Xiaomi", "Redmi Note 11T 5G", "6GB RAM||64GB Storage", "Aquamarine Blue", 22000.00, "Mobile phone", 1000, "Poorvika Mobiles", "Package contents\\n" +
                "Xiaomi Redmi Note 11T 5G , 33W power adapter, USB Type-C cable, warranty card, user guide, SIM insertion tool\n" +
                "\n");
        productList.productList.add(mp5);
        Product mp6 = new Product(1006, "Xiaomi", "Redmi Note 11T 5G", "6GB RAM||64GB Storage", "Stardust White", 22000.00, "Mobile phone", 1000, "Poorvika Mobiles", "Package contents\\n" +
                "Xiaomi Redmi Note 11T 5G , 33W power adapter, USB Type-C cable, warranty card, user guide, SIM insertion tool\n" +
                "\n");
        productList.productList.add(mp6);
        Product mp7 = new Product(1007, "SAMSUNG", "M52 5G", "8GB RAM||128GB Storage", "Black", 30000.00, "Mobile phone", 7000, "SAMSUNG", "Package contents\\n" +
                "SAMSUNG M52 , 25W power adapter, USB Type-C cable, warranty card, user guide, SIM insertion tool\n" +
                "\n");
        productList.productList.add(mp7);
        Product mp8 = new Product(1008, "SAMSUNG", "M52 5G", "8GB RAM||128GB Storage", "Cloud Mint", 30000.00, "Mobile phone", 7000, "SAMSUNG", "Package contents\\n" +
                "SAMSUNG M52 , 25W power adapter, USB Type-C cable, warranty card, user guide, SIM insertion tool\n" +
                "\n");

        Product mp9 = new Product(1009, "SAMSUNG", "M52 5G", "8GB RAM||128GB Storage", "Light Blue", 30000.00, "Mobile phone", 7000, "SAMSUNG", "Package contents\\n" +
                "SAMSUNG M52 , 25W power adapter, USB Type-C cable, warranty card, user guide, SIM insertion tool\n" +
                "\n");
        productList.productList.add(mp9);
        Product mp10 = new Product(1010, "SAMSUNG", "Galaxy Z Flip3", "8GB RAM||256 GB Storage", "Mirror Black", 78000.00, "Mobile phone", 7000, "SAMSUNG", "Package contents\\n" +
                "SAMSUNG Galaxy Z Flip3 ,  USB Type-C to Type-C cable, warranty card, user guide, SIM insertion tool\n" +
                "\n");
        productList.productList.add(mp10);
        Product mp11 = new Product(1011, "SAMSUNG", "Galaxy Z Flip3", "8GB RAM||256 GB Storage", "Mirror Purple", 78000.00, "Mobile phone", 7000, "SAMSUNG", "Package contents\\n" +
                "SAMSUNG Galaxy Z Flip3 ,  USB Type-C to Type-C cable, warranty card, user guide, SIM insertion tool\n" +
                "\n");
        productList.productList.add(mp11);
        Product mp12 = new Product(1012, "SAMSUNG", "Galaxy Z Flip3", "8GB RAM||256GB Storage", "Gold", 78000.00, "Mobile phone", 7000, "SAMSUNG", "Package contents\\n" +
                "SAMSUNG Galaxy Z Flip3 ,  USB Type-C to Type-C cable, warranty card, user guide, SIM insertion tool\n" +
                "\n");
        productList.productList.add(mp12);
        Product mp13 = new Product(1013, "Apple", "iPhone 13 Pro", "4GB RAN||512GB Storage", "Graphite", 149000.00, "Mobile phone", 1000, "Apple", "In the Box\n" +
                "iPhone with iOS 15" + "USB‑C to Lightning Cable" + "Documentation" +
                "\n");
        productList.productList.add(mp13);
        productList.productList.add(mp8);
        Product tv1 = new Product(2001, "SAMSUNG", "LED Smart TV", "HD||32 inches", "Black", 16000.00, "TV", 5000, "SAMSUNG", "Box contains TV, user Manual, Remote Control, 2 AAA size batters, Power chord\n");
        productList.productList.add(tv1);
        Product tv2 = new Product(2002, "SAMSUNG", "Crystal 4K LED Smart TV", "UHD||48 inches", "Black", 39999.00, "TV", 5000, "SAMSUNG", "Box contains TV, user Manual, Remote Control, 2 AAA size batters, Power chord\n");
        productList.productList.add(tv2);
        Product watch1 = new Product(3001, "Xiaomi", "Redmi Smart Watch", "3", "Black", 2000.00, "Watch", 2000, "Xiaomi", "Package contains : Redmi Smart Watch, USB B=type cable, User manual, 4 watch straps \n");
        productList.productList.add(watch1);
    }
}
class priceSorter01 implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
class NameSorter implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (o1.getProductBrand()+o1.getProductName()).compareTo(o2.getProductBrand()+o2.getProductName());
    }
}