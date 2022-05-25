package hw03;

import java.util.ArrayList;
import java.util.List;

public class MovieAudienceTest {
    public static void main(String[] args) {
        List<Movie> theater = new ArrayList<>();
        List<Audience> audiences = new ArrayList<>();

        theater.add(new Movie("Avengers Infinity War", "Action", 8.5, 12));
        theater.add(new Movie("Parasite", "Black comedy", 8.6, 15));
        theater.add(new Movie("Joker", "Thriller", 8.4, 15));
        theater.add(new Movie("Forest Gump", "Romantic", 9.1, 12));

        audiences.add(new Audience("Nicholas Fletcher", 18, "Black comedy"));
        audiences.add(new Audience("Bradley Knight", 9, "Thriller"));
        audiences.add(new Audience("Jasmine Chambers", 13, "Romantic"));
        audiences.add(new Audience("Kayleigh Hall", 14, "Romantic"));

        for (Audience audience : audiences) {
            for (Movie movie : theater) {
                if (audience.canWatch(movie) && audience.isFavorite(movie)) {
                    System.out.printf("%s는 %s를 좋아하며, 나이제한에 걸리지 않는다!\n", audience.getName(), movie.getTitle());
                }
            }
        }
    }
}
