package players;

import java.util.ArrayList;
import teams.Barcelona;

public class PlayerBarcelona extends Barcelona {

    ArrayList<String> teamplate = new ArrayList<>();

    public PlayerBarcelona() {
        teamplate.add("1 Marc André Ter-Stegen");
        teamplate.add("2 Douglas");
        teamplate.add("3 Gerard Piqué");
        teamplate.add("4 Ivan Rakitic");
        teamplate.add("5 Sergio Busquets");
        teamplate.add("\n6 Dani Alves");
        teamplate.add("7 Arda Turan");
        teamplate.add("8 Andrés Iniesta");
        teamplate.add("9 Luis Suaréz");
        teamplate.add("10 Lionel Messi");
        teamplate.add("\n11 Neymar");
        teamplate.add("12 Rafinha");
        teamplate.add("13 Claudio Bravo");
        teamplate.add("14 Javier Mascherano");
        teamplate.add("15 Marc Bartra");
        teamplate.add("\n17 Munir El Haddadi");
        teamplate.add("18 Jordi Alba");
        teamplate.add("19 Sandro Ramirez");
        teamplate.add("20 Sergi Roberto");
        teamplate.add("21 Adriano");
        teamplate.add("22 Aleix Vidal");
        teamplate.add("23 Thomas Vermalen");
        teamplate.add("24 Jeremy Mathieu");
        teamplate.add("25 Jordi Masip");
    }

    public PlayerBarcelona(String brc) {
        super(brc);
    }
     public void printTemplate() {
        System.out.println("Jugadores del Barcelona: " + "\n\n"+ teamplate);
    }
}
