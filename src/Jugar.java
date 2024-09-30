import java.util.Scanner;

public class Jugar {


    public static void Juego() {
        int cnt=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese uno de estos numeros segun el modo: \n" +
                "1 si quiere el modo Multijugador basico \n" +
                "2 si quiere el modo VS la CPU \n" +
                "3 si quiere el modo extremo\n");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir el carácter de nueva línea

        while (numero != 1 && numero != 2 && numero != 3) {
            System.out.print("Modo seleccionado no valido\n");
            System.out.print("Ingrese uno de estos numeros segun el modo: \n" +
                    "1 si quiere el modo  Multijugador basico \n" +
                    "2 si quiere el modo VS la CPU\n" +
                    "3 si quiere el modo extremo\n");
            numero = scanner.nextInt();
            scanner.nextLine(); // Consumir el carácter de nueva línea
        }


        StringBuilder p1marcador = new StringBuilder();
        StringBuilder p2marcador = new StringBuilder();

        if (numero==1){
            System.out.print("Ingrese el nombre del equipo 1: ");
            String nombre1 = scanner.nextLine();
            Equipos p1 = new Equipos(nombre1, 0);

            System.out.print("Ingrese el nombre del equipo 2: ");
            String nombre2 = scanner.nextLine();
            Equipos p2 = new Equipos(nombre2, 0);

            Facil Partida = new Facil();
            while (cnt!=-1) {
                if (cnt % 2 == 0) {
                    int x = Partida.Jugar(p1, p2);
                    if(x==2){ p1marcador.append(" X ");System.out.println("MARCADOR \n "+p1.name +"\t "+p1marcador+"\n "+p2.name +"\t "+p2marcador+"\n ");
                        System.out.print("EL GANADOR ES  ");
                        if (p1.getPiojos() == 0) {
                            System.out.println(p2.name);
                        } else {
                            System.out.println(p1.name);
                        }
                    break;}else if(x==1){
                        p1marcador.append(" 1 ");
                        System.out.println("MARCADOR \n "+p1.name +"\t "+p1marcador+"\n "+p2.name +"\t "+p2marcador+"\n ");
                        cnt++;}else{
                        p1marcador.append(" X ");
                        System.out.println("MARCADOR \n "+p1.name +"\t "+p1marcador+"\n "+p2.name +"\t "+p2marcador+"\n ");
                        cnt++;
                        }
                } else {
                int x = Partida.Jugar(p2, p1);
                if(x==2){ p2marcador.append(" X ");System.out.println("MARCADOR \n "+p1.name +"\t "+p1marcador+"\n "+p2.name +"\t "+p2marcador+"\n ");
                    break;}else if(x==1){
                    p2marcador.append(" 1 ");
                    System.out.println("MARCADOR \n "+p1.name +"\t "+p1marcador+"\n "+p2.name +"\t "+p2marcador+"\n ");
                    cnt++;}else{
                    p2marcador.append(" X ");
                    System.out.println("MARCADOR \n "+p1.name +"\t "+p1marcador+"\n "+p2.name +"\t "+p2marcador+"\n ");
                    cnt++;
                }
            }
                }
            }else if( numero ==2){
            System.out.print("Ingrese el nombre del equipo 1: ");
            String nombre1 = scanner.nextLine();
            Equipos p1 = new Equipos(nombre1, 0);

          Equipos p2 = new Equipos("Cpu",0);
            maquina Partida = new maquina();
            while (cnt!=-1) {
                if (cnt % 2 == 0) {
                    int x = Partida.Jugar(p1, p2);
                    if(x==2){ p1marcador.append(" X ");System.out.println("MARCADOR \n "+p1.name +"\t "+p1marcador+"\n "+p2.name +"\t "+p2marcador+"\n ");
                        break;}else if(x==1){
                        p1marcador.append(" 1 ");
                        System.out.println("MARCADOR \n "+p1.name +"\t "+p1marcador+"\n "+p2.name +"\t "+p2marcador+"\n ");
                        cnt++;}else{
                        p1marcador.append(" X ");
                        System.out.println("MARCADOR \n "+p1.name +"\t "+p1marcador+"\n "+p2.name +"\t "+p2marcador+"\n ");
                        cnt++;
                    }
                } else {
                    int x = Partida.Jugar(p2, p1);
                    if(x==2){ p2marcador.append(" X ");System.out.println("MARCADOR \n "+p1.name +"\t "+p1marcador+"\n "+p2.name +"\t "+p2marcador+"\n ");
                        System.out.print("EL GANADOR ES  ");
                        if (p1.getPiojos() == 0) {
                            System.out.println(p2.name);
                        } else {
                            System.out.println(p1.name);
                        }
                        break;}else if(x==1){
                        p2marcador.append(" 1 ");
                        System.out.println("MARCADOR \n "+p1.name +"\t "+p1marcador+"\n "+p2.name +"\t "+p2marcador+"\n ");
                        cnt++;}else{
                        p2marcador.append(" X ");
                        System.out.println("MARCADOR \n "+p1.name +"\t "+p1marcador+"\n "+p2.name +"\t "+p2marcador+"\n ");
                        cnt++;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Juego();
    }
}
