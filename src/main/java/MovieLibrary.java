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

    public void printMovieYear(int yearStart, int yearEnd){
        for (Movie movie : movies){
            if (movie.getYear() >= yearStart && movie.getYear() <= yearEnd) {
                System.out.println(movie.getTitle());
            }
        }
    }

    public void printInfoAboutMovie(){

    }

    public void printActorDetails(String actorFirstName, String actorLastName ) {
        for(Movie movie: movies){
        for(Actor actor: movie.getActors()) {
            if (actor.getFirstName().equals(actorFirstName) && actor.getLastName().equals(actorLastName)) {
                System.out.println(movie.getTitle());
            }
        }
        }
    }
}
