# java-fundemantals


## **Lab: 03 - Maps and File I/O**
- ### **Files : 1- "Main.java", "Library.java" , "LibraryTest.java" inside "basiclibrary" folder in project directory.**
  ### **2- "App.java", "gates.js" , "AppTest.java" inside "linter" folder in project directory.**
- ### **Methods :**
* **maxAndMin()**: This method accepts an **int array of arrays** and iterate through all of the data to find the min and max values. And Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month and return that String.
* **tally()**: This method accepts a **List of Strings representing votes** and returns one string to show what got the most votes.
* **linter()**: This method accepts a **String path**. the path is the path of the javaScript file. The parpouse of this method is generates an error message whenever it finds a line that doesn’t end in a semi-colon.
* ## **Lab: 07 -  Inheritance, day 2**
### Overview
In this lab I added a two new class the first one is **Shop** class and the second one is **Theater** class.
### Methods
1. **Shop Class**: The Constructor of Shop class accept three variables:
    * `String name`: For the shop name.
    * `String description`: For store a description about the shop.
    * `int numOfDollarSigns`: For store the number of DollarSigns.
* `getShopReviews()`: The Type of this method is  LinkedList<Review>` and it is for store the all reviews in the list.
* `addShopReview(Review review)`: This method is the Override method from the *ShopInterface*, and it accepts a `Review` variable type. Its purpose to add the review in the list of reviews. also, inside this method I call the `updateStars()`.
* `toString()`: To print the Shop data.
2. **Theater Class**: The Constructor of Theater class accept one variable:
    * `String name`: For the theater name.
* `getTheaterReviews()`: This method to store the all reviews in the map.
* `addTheaterReview(Review rev, String movieName)`: This method accept `Review` value for the review and `String` value for the movie name. This method check if the movie is existing in the list of movies or not. If it is existing, you can write a review about it.
* `addMovie(String movie)`: This method accept `String` value for movie title. Its purpose to add any movie you want in the movies list.
* `removeMovie(String movie)`: This method accept `String` value for movie title. Its purpose to remove any movie you want in the movies list.