public class Mazzo {
    private int carteInGioco ;
    private Carta [ ] carte = new Carta[10];
    public Mazzo(){
        carteInGioco = 10;
        carte[0]= new Carta('A');
        carte[1]= new Carta('A');
        carte[2]= new Carta('B');
        carte[3]= new Carta('B');
        carte[4]= new Carta('C');
        carte[5]= new Carta('C');
        carte[6]= new Carta('D');
        carte[7]= new Carta('D');
        carte[8]= new Carta('E');
        carte[9]= new Carta('E');
        stampa();
    }

    public void stampa() {
        for (int i = 0; i < 10; i++) {
            //TODO: extract method in carta char toStampa () oppure toString() ?
            if (carte[i].isNotInGioco())
                System.out.print(" " + " ");
            else if (carte[i].isCoperta())
                System.out.print("X" + " ");
            else
                System.out.print(carte[i].getValore() + " ");
        }

        System.out.println();

        for (int i= 0 ; i<10 ; i++){
            if (carte[i].isNotInGioco() ||
                carte[i].isNotCoperta())
                    System.out.print(" " + " ");
            else
                    System.out.print( i + " ");

        }
        System.out.println();

    }

    public boolean isNotFinito() {
        return ( carteInGioco > 0 ) ;
    }

    public void togliDalGioco(Carta primaCarta, Carta secondaCarta) {
        primaCarta.mettitiFuoriDalgioco();
        secondaCarta.mettitiFuoriDalgioco();
        System.out.println("Ottimo !!");
        stampa();
        carteInGioco -= 2;
    }

    public void copri(Carta primaCarta, Carta secondaCarta) {
        primaCarta.copriti();
        secondaCarta.copriti();
        System.out.println("Mi dispiace ..");
        stampa();
    }

    public Carta getCartaAllaPosizione(int i) {
        return carte[i];
    }
}
