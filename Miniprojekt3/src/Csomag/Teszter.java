import java.util.ArrayList;
import java.util.Comparator;
import Csomag.Film;
import Csomag.IKorhataros;
import Csomag.HorrorFilm;


public class Teszter {
    public static void main(String[] args) {
        ArrayList<Film> filmek = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            filmek.add(new Film("Film" + (i + 1), (i + 1) * 1000));
            filmek.add(new HorrorFilm("HorrorFilm" + (i + 1), (i + 1) * 2000, 18));
        }

        for (Film film : filmek) {
            System.out.println(film);
        }

        filmek.sort(Comparator.comparing(Film::getAr));

        System.out.println("\nRendezett lista:");
        for (Film film : filmek) {
            System.out.println(film);
        }

        IKorhataros[] korhatarosFilmek = filmek.stream()
                .filter(film -> film instanceof HorrorFilm)
                .toArray(IKorhataros[]::new);

        System.out.println("\nHorrorFilm-ek:");
        for (IKorhataros film : korhatarosFilmek) {
            System.out.println(film);
        }

        int kor = 16;
        int buntetes = 0;
        for (IKorhataros film : korhatarosFilmek) {
            buntetes += film.Buntetes(kor);
        }
        System.out.println("\nA büntetés összege " + kor + " éves kor esetén: " + buntetes);
    }
}
