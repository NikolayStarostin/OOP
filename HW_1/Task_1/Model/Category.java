package HW_1.Task_1.Model;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void printOfListCategory(){
        System.out.println("--------------------");
        System.out.println("Category: " + name);
        System.out.println();
        for (Product pr: products) {
            System.out.println("Name: " + pr.getName());
            System.out.println("Price: " + pr.getPrice());
            System.out.println("Rating: " + pr.getRating());
            System.out.println();
        }
    }

}