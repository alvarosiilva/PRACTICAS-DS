public class Basico {

    public int chute(Equipos ataca,Equipos defiende) {
        if(ataca.disparo==defiende.disparo && ataca.disparo!=0){
            ataca.setPiojos(ataca.getPiojos()-1);
            if(perder(ataca)){
                return 2;
            }
            return 0;
        }else if( ataca.disparo!=0){
            return 1;
        }else{
            return 3;
        }


    }
    public boolean perder(Equipos p1){
        return p1.getPiojos() == 0;
    }
}
