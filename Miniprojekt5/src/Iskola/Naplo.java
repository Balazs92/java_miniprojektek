package Iskola;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Naplo {
    private final ArrayList<Hallgato> hallgatok;

    public Naplo(String hallgatokFajl, String jegyekFajl) {
        hallgatok = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(hallgatokFajl))) {
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] adatok = sor.split(",");
                String vezeteknev = adatok[0].trim();
                String keresztnev = adatok[1].trim();
                Hallgato hallgato = new Hallgato(vezeteknev, keresztnev);
                hallgatok.add(hallgato);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(jegyekFajl))) {
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] adatok = sor.split(",");
                int hallgatoID = Integer.parseInt(adatok[0].trim());
                String tantargy = adatok[1].trim();
                int jegy = Integer.parseInt(adatok[2].trim());
                for (Hallgato hallgato : hallgatok) {
                    if (hallgato.getID() == hallgatoID) {
                        hallgato.ujBejegyzes(new Jegy(tantargy, jegy));
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listazNevek() {
        for (Hallgato hallgato : hallgatok) {
            System.out.println("ID: " + hallgato.getID() + ", Név: " + hallgato.getVezeteknev() + " " + hallgato.getKeresztnev());
        }
    }

    public void listazHallgatoiAdatok() {
        for (Hallgato hallgato : hallgatok) {
            System.out.println(hallgato.getVezeteknev() + " " + hallgato.getKeresztnev() + ":");
            for (String tantargy : hallgato.getTantargyak()) {
                double atlag = hallgato.tantargyAtlag(tantargy);
                System.out.println("  " + tantargy + ": " + atlag);
            }
        }
    }
}
