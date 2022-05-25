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

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public int compareRating(Movie anotherMovie) {
        if (rating > anotherMovie.rating) {
            return 1;
        } else if (rating == anotherMovie.rating) {
            return 0;
        } else {
            return -1;
        }
    }
}
