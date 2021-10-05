package restaurant;

import java.util.LinkedList;

public class Shop {
    private String name;
    private String description;
    private int price;

    public Shop(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    private LinkedList<Review> shopReview = new LinkedList<>();

    public void addReview(Review review) {
        this.shopReview.add(review);

    }

    public LinkedList<Review> getShopReview() {
        return shopReview;
    }

    public String verifyPrice(int price) {
        if (price <= 10) {
            return "$";
        } else if (price < 10 || price <= 25) {
            return "$$";
        }
        if (price < 25 || price <= 50) {
            return "$$$";
        } else {
            return "$$$$";
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + verifyPrice(price) +
                '}';
    }

}

