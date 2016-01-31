package players;

import teams.RealMadrid;
import java.util.*;

public class PlayerReal extends RealMadrid {

    ArrayList<String> teamplate = new ArrayList<String>();

    public PlayerReal() {
        teamplate.add("1 Keylor Navas");
        teamplate.add("2 Raphael Varane");
        teamplate.add("3 Pepe");
        teamplate.add("4 Sergio Ramos");
        teamplate.add("6 Nacho Fernandez");
        teamplate.add("\n7 Cristiano Ronaldo");
        teamplate.add("8 Toni Kroos");
        teamplate.add("9 Karim Benzema");
        teamplate.add("10 James Rodríguez");
        teamplate.add("11 Gareth Bale");
        teamplate.add("\n12 Marcelo");
        teamplate.add("13 Kiko Casillas");
        teamplate.add("14 Casemiro");
        teamplate.add("15 Daniel Carvajal");
        teamplate.add("16 Mateo Kovacic");
        teamplate.add("\n17 Álvaro Arbeloa");
        teamplate.add("18 Lucas Vázquez");
        teamplate.add("19 Luka Modric");
        teamplate.add("20 Jesé");
        teamplate.add("21 Denis Cheryshev");
        teamplate.add("22 Isco");
        teamplate.add("23 Danilo");
        teamplate.add("31 Rubén Yañez");

    }

    public PlayerReal(String rmd) {
        super(rmd);

    }

    public ArrayList<String> getTeamplate() {
        return teamplate;
    }

    public void printTemplate() {
        System.out.println("Jugadores del Real Madrid: " + "\n\n" + teamplate);
    }
    public int getSize(){
        return teamplate.size();
    }
}
