package restaurant;

public class Restaurant  {

    private String name;
    private int rate;
    private int price;

    public Restaurant(String name, int rate, int price) {
        this.name = name;
        this.rate = rate;
        this.price = price;
    }

    public int verifyRate(int rate) {
        int defaults = 5;
        while (rate > 5 || rate < 0) {
            System.out.println("Choose a number between 0 and 5");
            System.out.println("DEFAULT NUMBER WILL BE RATED");
            return defaults;
        }
        return defaults=rate;
    }

    public String verifyPrice(int price) {
        if (price <= 10) {
            return "$";
        } else if (price < 10 || price <= 25) {
            return "$$";
        }if (price < 25 || price <= 50) {
            return "$$$";
        } else {
            return "$$$$";
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rate=" + verifyRate(rate) +
                ", priceCategory=" + verifyPrice(price) +
                '}';
    }


}
