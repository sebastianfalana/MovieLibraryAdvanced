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
        }
    }
}
