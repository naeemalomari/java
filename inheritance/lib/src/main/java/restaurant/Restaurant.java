package restaurant;

import java.util.LinkedList;

public class Restaurant  {

    private String name;
    private double rate;
    private int price;


    public Restaurant(String name, double rate, int price) {

        this.name = name;
        this.rate = rate;
        this.price = price;
        this.reviews = reviews;
    }

    private LinkedList<Review> reviews = new LinkedList<>();



    public LinkedList<Review> getReviews() {
        return reviews;
    }

    public double verifyRate(double rate) {
        double defaults = 5;
        while (rate > 5 || rate < 0) {
            System.out.println("Choose a number between 0 and 5");
            System.out.println("DEFAULT NUMBER WILL BE RATED");
            return defaults;
        }
        return defaults = rate;
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

    public void addReview(Review review) {
        this.reviews.add(review);
        updateRate();
    }

    public void updateRate() {
        double current = 0;
        for (int i = 0; i < getReviews().size(); i++) {
            current = current + getReviews().get(i).getStars();
        }
        current = current / (getReviews().size());
//        current = Math.round(current);
        this.rate = current;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rate=" + verifyRate(rate) +
                "," + verifyPrice(price) +
                '}';
    }


//    @Override
//    public String getName() {
//        return null;
//    }
//
//    @Override
//    public double getNumberOfStars() {
//        return 0;
//    }
//
//    @Override
//    public String getPriceCategory() {
//        return null;
//    }
//
//    @Override
//    public void addReview(Review review) {
//
//    }
//
//    @Override
//    public void updateStars() {
//
//    }
}
