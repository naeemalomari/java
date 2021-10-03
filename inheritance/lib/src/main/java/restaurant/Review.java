package restaurant;

public class Review { // implements ReviewInterface {
    String body;
    String author;
    int stars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public String printStars(int stars) {
        String print = "";
        if (stars > 0) {
            for (int i = 1; i <= stars; i++) {
                print = print + "*";
            }
        } else {
            print = "ZERO STARS";
        }
        return print;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", " + printStars(stars) +
                '}';
    }
}
