import java.util.List;

public class MovieLibrary {

    private List<Movie> movies;

    public MovieLibrary() {
    }

    public List<Movie> getMovies() {
        return movies;
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
}
