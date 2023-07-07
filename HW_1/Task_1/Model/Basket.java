package HW_1.Task_1.Model;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products;

    public Basket() {
        this.products = new ArrayList<Product>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void printOfListBasket(){
        System.out.println("------List of Basket-------");
        System.out.println();
        for (Product pr: products) {
            System.out.println("Name: " + pr.getName());
            System.out.println("Price: " + pr.getPrice());
            System.out.println("Rating: " + pr.getRating());
            System.out.println();
        }
    }
}