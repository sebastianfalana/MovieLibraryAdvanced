import java.util.List;

public class MovieLibrary {

    private List<Movie> movies;


    public MovieLibrary() {
    }

    public MovieLibrary(List<Movie> movies) {
        this.movies = movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void printMovieYear(int yearStart, int yearEnd) {
        for (Movie movie : movies) {
            if (movie.getYear() >= yearStart && movie.getYear() <= yearEnd) {
                System.out.println(movie.getTitle());
            }
        }
    }

    public void printInfoAboutMovie(int randomNumber) {
        for (Movie movie : movies) {
            if (movie.equals(movies.get(randomNumber))) {
                System.out.println("Tytuł: " + movie.getTitle());
                System.out.println("Director: " + movie.getDirector());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Date: " + movie.getYear());
                System.out.print("Actors: ");
                for (Actor actor :
                        movie.getActors()) {
                    System.out.print(actor.getFirstName() + " " + actor.getLastName()+", ");
                }
            }
        }
    }

    public void printActorDetails(String actorFirstName, String actorLastName) {
        for (Movie movie : movies) {
            for (Actor actor : movie.getActors()) {
                if (actor.getFirstName().equals(actorFirstName) && actor.getLastName().equals(actorLastName)) {
                    System.out.println(movie.getTitle());
                }
            }
        }
    }
}
