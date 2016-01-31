package design;

import java.util.Scanner;
import players.PlayerBarcelona;
import players.PlayerReal;

public class Design {

    public static void main(String[] args) {
        String entrada = "Elija un equipo";
        System.out.println(entrada);
        Scanner scan = new Scanner(System.in);
        entrada = scan.nextLine();
        if (entrada.toLowerCase().equals("real madrid")) {
            PlayerReal pr = new PlayerReal();
            pr.printTemplate();
            System.out.println("\n\nElija un jugador");
            entrada = scan.nextLine();
            for(int x=0;x<pr.getSize();x++){
                if((pr.getTeamplate().get(x)).equals(entrada)){
                    System.out.println(entrada);
                }
            }

        } else if (entrada.toLowerCase().equals("barcelona")) {
            PlayerBarcelona pr = new PlayerBarcelona();
            pr.printTemplate();
        }

    }
}
