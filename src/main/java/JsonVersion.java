import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class JsonVersion {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        File file = new File("src/main/resources/movies.json");
        MovieLibrary movieLibrary = objectMapper.readValue(file, MovieLibrary.class);
//        System.out.println(movieLibrary);

//        movieLibrary.printMovieYear(2001,2002);
//        movieLibrary.printActorDetails("John", "Macan");

        Menu menu = new Menu();

        switch (menu.printOption()) {
            case 1:
                System.out.println("Podaj dwie daty");
                System.out.println("Pierwsza data");
                int startDay = new Scanner(System.in).nextInt();
                System.out.println("Druga data");
                int endDay = new Scanner(System.in).nextInt();
                movieLibrary.printMovieYear(startDay, endDay);
                break;
            case 2:
                Random r = new Random();
                int randomitem = r.nextInt(movieLibrary.getMovies().size());
                movieLibrary.printInfoAboutMovie(randomitem);
                break;
            case 3:
                System.out.println("Podaj imie Aktora");
                String actorFirstName = new Scanner(System.in).next();
                System.out.println("Podaj nazwisko Aktora");
                String actorLastName = new Scanner(System.in).next();
                movieLibrary.printActorDetails(actorFirstName, actorLastName);
                break;
            default:
                System.out.println("Podałeś cyfre z poza zakresu");

        }

    }
}
