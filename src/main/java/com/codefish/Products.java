package com.codefish;

import java.util.Arrays;
import java.util.Scanner;

public class Products {

    /*
	 * Please add more vending machine features
	 * - Buy a product
	 * - Search for a product
	 * - Get list of products
	 */

    private static String[] products  = new String[] {"Monitor", "Mouse", "Keyboard", "USB cable", "Charger", "Mouse pad"};
    private static int[]    prices    = new int[] {100, 70, 89, 17, 99, 5};
    private static int[]    inventory = new int[] {4, 10, 5, 10, 5, 7};



    //method for first case
    public static void allProducts(){
        System.out.println(Arrays.toString(products));
    }
    public static boolean productAvailability(String productName){
    for (String product:products){
        if (productName.equalsIgnoreCase(product)){
           return true;
        }
    } System.out.println("Sorry, we do not have this item");
    return false; }

    public static void getProductInfo(String productName){
        if (productAvailability(productName)){
            System.out.println(productName);
            int price=getProductPrice(productName);
            int amount=getProductInventory(productName);
            System.out.println("Product: " + productName + "\n Price: " + price + "\n Amount: " + amount);
        }
    }


    public static String[] getAllPrices() {
        System.err.println("Product: price");
        for (int j = 0; j < products.length; j++) {
            System.out.println(products[j] + ": $" + prices[j]);
        }
        return products;
    }

    public static int getProductPrice(String productName) {
        int index = 0;
        for (String s : products) {
            if (productName.equalsIgnoreCase(s)) {
                return prices[index];
            }
            index++;
        }
        System.out.println("Sorry the product you entered is not available");
        return -1;
    }
    public static int getProductInventory(String productName){
        int index = 0;
        for (String s : products) {
            if (productName.equalsIgnoreCase(s)) {
                return inventory[index];
            }
            index++;
        }
        System.out.println("Sorry the product you entered is not available");
        return -1;
    }


    public static void selectProduct(String productName) {
        getProductInfo(productName);
        System.out.println("Do you want to buy it");
        String choice= new Scanner(System.in).nextLine();
        if (choice.equalsIgnoreCase("yes")){
            buyAProduct(productName);
        }else{
            System.out.println("Please choose other option");
        }

    	//loop over the product list to find out if it is available in our vending machine
		//if yes find the price (tip: call a specific method)
		//and verify this product is available in inventory
		//ask if customer wants to buy it -> if yes call another method to buy a product
//											-> if no call method to cancel it
    }


    public static void buyAProduct(String productName) {
        getProductPrice(productName);
        System.out.println("Please enter the payment amount");
        Scanner scanner=new Scanner(System.in);


        /*
        Apply payment logic.
        Apply give back change logic
        Apply inventory update logic: if someone buys an item, we should decrement number of available items.
         */

    }
}
