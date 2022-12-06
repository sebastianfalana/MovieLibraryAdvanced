import java.util.Scanner;

public class StandardVersion {

    public static void main(String[] args) {

        MovieLibrary movieLibrary = new MovieLibrary();

        switch (Menu.printOption()){
            case 1:
                System.out.println("Podaj dwie daty");
                System.out.println("Pierwsza data");
                int startDay = new Scanner(System.in).nextInt();
                System.out.println("Druga data");
                int endDay = new Scanner(System.in).nextInt();
                movieLibrary.printMovieYear(startDay,endDay);
                break;
            case 2:
                break;
            case 3:
                System.out.println("Podaj imie Aktora");
                String actorFirstName = new Scanner(System.in).next();
                System.out.println("Podaj nazwisko Aktora");
                String actorLastName = new Scanner(System.in).next();
                movieLibrary.printActorDetails(actorFirstName,actorLastName);

        }
    }
}
