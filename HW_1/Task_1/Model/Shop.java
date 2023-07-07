package HW_1.Task_1.Model;

import HW_1.Task_1.Model.Product;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Category> shop;

    public Shop() {
        this.shop = new ArrayList<>();
    }

    public List<Category> getShop() {
        return shop;
    }

    public void setShop(List<Category> shop) {
        this.shop = shop;
    }

    public void addCategory(Category category) {
        shop.add(category);
    }

    public void printCatalog() {
        for (Category category : shop) {
            System.out.println(category.getName());
            List<Product> products = category.getProducts();
            for (Product product : products) {
                System.out.println(
                        "- " + product.getName() + " - " + product.getPrice() + " - " + product.getRating() + " -");
            }

        }
    }

}