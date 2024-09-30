public class Tablero {

    public void porteria() {
        int largo=8; int altura = 4;
        int i = 0, j = 0, cnt=0,cnt1=0,cnt2=0;
        System.out.print("\t\t");
        for (i = 1; i < largo; i++) {
            System.out.print(" _ ");
        }
        System.out.println();
        for (j = 0; j < altura; j++) {
            System.out.print("\t\t|");
            for (i = 1; i < largo*3-4 ; i++) {
                System.out.print(" ");
                if(j==1 && i==((largo*3-4))/2-1 && cnt==0){
                    System.out.print("O");
                    i=i+1;
                    cnt++;}
                if(j==2 && i==((largo*3-4))/2-4 && cnt1==0){ //mirar  que se encuadre
                    System.out.print(" / | \\  ");
                    i=i+8;
                    cnt1++;}
                if(j==3 && i==((largo*3-4))/2-4 && cnt2==0){ //mirar  que se encuadre
                    System.out.print("  / \\  ");
                    i=i+7;
                    cnt2++;}

            }
            System.out.println("|");
        }
        System.out.println("\n\n\n");
    }


    public  void pizq() {
        int largo=8; int altura = 4;
        int i = 0, j = 0, cnt=0,cnt1=0,cnt2=0;
        System.out.print("\t\t");
        for (i = 1; i < largo; i++) {
            System.out.print(" _ ");
        }
        System.out.println();
        for (j = 0; j < altura; j++) {
            System.out.print("\t\t|");
            for (i = 1; i < largo*3-4 ; i++) {
                System.out.print(" ");
                if(j==1 && i==4 && cnt==0){
                    System.out.print("O");
                    i=i+1;
                    cnt++;}
                if(j==2 && i==1 && cnt1==0){ //mirar  que se encuadre
                    System.out.print("0/ | \\  ");
                    i=i+8;
                    cnt1++;}
                if(j==3 && i==1 && cnt2==0){ //mirar  que se encuadre
                    System.out.print("  / \\  ");
                    i=i+7;
                    cnt2++;}

            }
            System.out.println("|");
        }
        System.out.println("\n\n\n");
    }

    public  void pder() {
        int largo=8; int altura = 4;
        int i = 0, j = 0, cnt=0,cnt1=0,cnt2=0;
        System.out.print("\t\t");
        for (i = 1; i < largo; i++) {
            System.out.print(" _ ");
        }
        System.out.println();
        for (j = 0; j < altura; j++) {
            System.out.print("\t\t|");
            for (i = 1; i < largo*3-4 ; i++) {
                System.out.print(" ");
                if(j==1 && i==largo+5 && cnt==0){
                    System.out.print("O");
                    i=i+1;
                    cnt++;}
                if(j==2 && i==largo+3 && cnt1==0){ //mirar  que se encuadre
                    System.out.print("/ | \\0  ");
                    i=i+8;
                    cnt1++;}
                if(j==3 && i==largo+2 && cnt2==0){ //mirar  que se encuadre
                    System.out.print("  / \\  ");
                    i=i+7;
                    cnt2++;}

            }
            System.out.println("|");
        }
        System.out.println("\n\n\n");
    }


    public  void gizq() {
        int largo=8; int altura = 4;
        int i = 0, j = 0, cnt=0,cnt1=0,cnt2=0;
        System.out.print("\t\t");
        for (i = 1; i < largo; i++) {
            System.out.print(" _ ");
        }
        System.out.println();
        for (j = 0; j < altura; j++) {
            System.out.print("\t\t|");
            for (i = 1; i < largo*3-4 ; i++) {
                System.out.print(" ");
                if(j==1 && i==largo+5 && cnt==0){
                    System.out.print("O");
                    i=i+1;
                    cnt++;}
                if(j==2 && i==largo-4 && cnt1==0){ //mirar  que se encuadre
                    System.out.print("0      / | \\");
                    i=i+12;
                    cnt1++;}
                if(j==3 && i==largo+2 && cnt2==0){ //mirar  que se encuadre
                    System.out.print("  / \\  ");
                    i=i+7;
                    cnt2++;}

            }
            System.out.println("|");
        }
        System.out.println("\n\n\n");
    }

    public  void gder() {
        int largo=8; int altura = 4;
        int i = 0, j = 0, cnt=0,cnt1=0,cnt2=0;
        System.out.print("\t\t");
        for (i = 1; i < largo; i++) {
            System.out.print(" _ ");
        }
        System.out.println();
        for (j = 0; j < altura; j++) {
            System.out.print("\t\t|");
            for (i = 1; i < largo*3-4 ; i++) {
                System.out.print(" ");
                if(j==1 && i==4 && cnt==0){
                    System.out.print("O");
                    i=i+1;
                    cnt++;}
                if(j==2 && i==1 && cnt1==0){ //mirar  que se encuadre
                    System.out.print(" / | \\        0 ");
                    i=i+16;
                    cnt1++;}
                if(j==3 && i==1 && cnt2==0){ //mirar  que se encuadre
                    System.out.print("  / \\  ");
                    i=i+7;
                    cnt2++;}

            }
            System.out.println("|");
        }
        System.out.println("\n\n\n");
    }


}