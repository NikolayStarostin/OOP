package HW_1.Task_1;

import HW_1.Task_1.Model.Basket;
import HW_1.Task_1.Model.Category;
import HW_1.Task_1.Model.Product;
import HW_1.Task_1.Model.Shop;
import HW_1.Task_1.Model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("Food");
        Category category2 = new Category("Cloth");

        category1.getProducts().add(new Product("Flour", 200, 1));
        category1.getProducts().add(new Product("Sugar", 60, 2));
        category1.getProducts().add(new Product("Millet", 80, 2));
        category1.getProducts().add(new Product("Buckwheat", 160, 3));
        category1.getProducts().add(new Product("Pasta", 200, 5));
        category1.getProducts().add(new Product("Potato", 30, 1));
        category1.getProducts().add(new Product("Rice", 90, 4));

        category2.getProducts().add(new Product("Jeans", 1500, 4));
        category2.getProducts().add(new Product("Pullover", 800, 2));
        category2.getProducts().add(new Product("Mens pants", 1200, 3));
        category2.getProducts().add(new Product("Shirt", 500, 5));
        category2.getProducts().add(new Product("Suit", 2500, 4));

        category1.printOfListCategory();
        category2.printOfListCategory();

        User user1 = new User("user1_login", "user1_password");
        User user2 = new User("user2_login", "user2_password");

        user1.getUserBasket().getProducts().add(category1.getProducts().get(2));
        user2.getUserBasket().getProducts().add(category2.getProducts().get(0));

        category1.getProducts().remove(2);
        category2.getProducts().remove(0);

        System.out.println("User name: " + user1.getUserLogin());
        System.out.println();
        user1.getUserBasket().printOfListBasket();
        System.out.println("User name: " + user2.getUserLogin());
        System.out.println();
        user2.getUserBasket().printOfListBasket();
        shop.printCatalog();
    }
}