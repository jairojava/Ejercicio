package design;

import java.util.*;

public class PlayerReal extends RealMadrid {

    public PlayerReal() {

    }

    public PlayerReal(String rmd) {
        super(rmd);

        List<String> list = new ArrayList<String>();
        list.add("1 Keylor Navas");
        list.add("2 Raphael Varane");
        list.add("3 Pepe");
        list.add("4 Sergio Ramos");
        list.add("6 Nacho Fernandez");
        list.add("7 Cristiano Ronaldo");
        list.add("8 Toni Kroos");
        list.add("9 Karim Benzema");
        list.add("10 James Rodríguez");
        list.add("11 Gareth Bale");
        list.add("12 Marcelo");
        list.add("13 Kiko Casillas");
        list.add("14 Casemiro");
        list.add("15 Daniel Carvajal");
        list.add("16 Mateo Kovacic");
        list.add("17 Álvaro Arbeloa");
        list.add("18 Lucas Vázquez");
        list.add("19 Luka Modric");
        list.add("20 Jesé");
        list.add("21 Denis Cheryshev");
        list.add("22 Isco");
        list.add("23 Danilo");
        list.add("31 Rubén Yañez");

    }

    public List<String> getTemplate(List<String> list) {
        return list;
    }

}
