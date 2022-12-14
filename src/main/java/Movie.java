import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Movie {
    private String title;
    private Director director;
    private String genre;
    private int year;
    private List<Actor> actors;

    public Movie(String title, Director director, String genre, int year, List<Actor> actors) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.actors = actors;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public static void printMovieLibrary() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        File file = new File("src/main/resources/movies.json");
        MovieLibrary movieLibrary = objectMapper.readValue(file, MovieLibrary.class);
        System.out.println(movieLibrary);
    }
}
