package restaurant;

import com.google.common.primitives.Booleans;

import java.util.HashMap;
import java.util.LinkedList;

public class Theater {

    String name;
    private LinkedList<String> moviesName = new LinkedList<>();
    private HashMap<Review, String> theaterReviews = new HashMap<>();

    public Theater(String name) {
        this.name = name;
    }

    public HashMap<Review,String> getTheaterReviews() {
        return theaterReviews;
    }

    public LinkedList<String> getMoviesName() {
        return moviesName;
    }

    public void addMovie(String movie) {
        moviesName.add(movie);
    }

    public void removeMovie(String movie) {
        moviesName.remove(movie);
    }

    //    public LinkedList<Review> getReview() {
//        return theaterReviews;
//    }
//
//    public void addReview(Review review) {
//        theaterReviews.add(review);
//    }
    public void addReview(Review review, String movie){

        if(!getTheaterReviews().containsValue(movie)){
            getTheaterReviews().put(review,movie);
        }else {
            System.out.println("YOU ALREADY RATED THIS MOVIE");
        }
    }




    public void removeReview(Review review) {
        theaterReviews.remove(review);
    }

    public void checkDuplication() {
//        if()
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies='" + moviesName + '\'' +
                ", theaterReviews=" + theaterReviews +
                '}';
    }
}
