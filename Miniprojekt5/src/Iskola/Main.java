package Iskola;

public class Main {
    public static void main(String[] args) {
        Hallgato hallgato = new Hallgato("Nagy", "Elemer");
        hallgato.ujBejegyzes(new Jegy("Matek", 10));
        hallgato.ujBejegyzes(new Jegy("Matek", 8));
        hallgato.ujBejegyzes(new Jegy("Roman", 7));
        hallgato.ujBejegyzes(new Jegy("Roman", 8));
        hallgato.ujBejegyzes(new Jegy("Magyar", 9));
        hallgato.listazas();

        Naplo naplo = new Naplo("hallgatok.csv","jegyek.csv");
        naplo.listazNevek();

        Naplo naplo2 = new Naplo("hallgatok.csv", "jegyek.csv");
        naplo.listazHallgatoiAdatok();
    }
}
