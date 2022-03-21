package hw03;

public class Movie {
    private String title;
    private String genre;
    private double rating;
    private int ageLimit;

    public Movie(String title, String genre, double rating, int ageLimit) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.ageLimit = ageLimit;
    }

    public int compareRating(Movie anotherMovie) {
        if (rating > anotherMovie.rating) {
            return 1;
        } else if (rating < anotherMovie.rating) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public double getRating() {
        return this.rating;
    }

    public int getAgeLimit() {
        return this.ageLimit;
    }

}
