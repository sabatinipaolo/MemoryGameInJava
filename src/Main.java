public class Main {
    public static void main(String[] args) {

        Mazzo mazzo = new Mazzo();
        Giocatore giocatore = new Giocatore();

        while (mazzo.isNotFinito()) {

            Carta primaCarta = giocatore.scopreUnaCartaDel(mazzo);
            Carta secondaCarta = giocatore.scopreUnaCartaDel(mazzo);

            if (primaCarta.ugualeA(secondaCarta)) {
                mazzo.togliDalGioco(primaCarta, secondaCarta);
            } else {
                mazzo.copri(primaCarta, secondaCarta);
            }
        }
    }
}