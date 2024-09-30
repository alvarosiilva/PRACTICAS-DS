import java.util.Scanner;

public class Facil extends Juego {
    @Override
    public int Jugar(Equipos p1,Equipos p2) {


        Basico partida1 = new Basico();
        Tablero porteria = new Tablero();
        porteria.porteria();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Elija a donde quiere disparar\n" +
                    "1 : Izquierda\n 2: Derecha");


            int disparo = scanner.nextInt();
            scanner.nextLine();
            p1.setDisparo(disparo);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Elija a donde quiere disparar\n" +
                    "1 : Izquierda\n 2: Derecha");

            int disparo2 = scanner.nextInt();
            scanner.nextLine();
            p2.setDisparo(disparo2);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                if (partida1.chute(p1, p2) == 0) {
                    if (p1.getDisparo() == 1) {
                        porteria.pizq();
                    } else {
                        porteria.pder();
                    }
                    return 0;
                } else if (partida1.chute(p1, p2) == 1) {
                    if (p1.getDisparo() == 1) {
                        porteria.gizq();
                    } else {
                        porteria.gder();
                    }

                    return 1;
                }else{

                    return 2;
                }

}}


