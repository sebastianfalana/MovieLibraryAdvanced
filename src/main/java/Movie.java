import java.util.List;

public class Movie {
    String title;
    Director director;
    String genre;
    int year;
    List<Actor> mainCharacterNames;

    public Movie(String title, Director director, String genre, int year, List<Actor> mainCharacterNames) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.mainCharacterNames = mainCharacterNames;
    }
}
