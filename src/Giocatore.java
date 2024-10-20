import java.util.Scanner;

public class Giocatore {
    public Carta scopreUnaCartaDel(Mazzo mazzo) {

        int indice = 0;

        while (true) {
            try {
                indice = letturaInInput(mazzo);
                break;
            } catch (MemoryGameException e) {
                System.out.println(e.getMessage());
            }
        }
        Carta carta_scelta = mazzo.getCarta(indice);
        carta_scelta.scopriti();
        mazzo.stampa();

        return mazzo.getCarta(indice);
    }


    public int letturaInInput(Mazzo mazzo) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Scegli una carta ");
            String input  = sc.nextLine();
            input=input.trim();

            int indice = Integer.parseInt( input);

            if ((indice <0 ) || (indice>9))
                throw new MemoryGameException( "errore: indice non consentito ");
            if (mazzo.getCarta(indice).isNotInGioco())
                throw new MemoryGameException( "errore: la carta indicata non è in gioco");
            if ( mazzo.getCarta(indice).isNotCoperta() )
                throw new MemoryGameException( "errore: la carta indicata è già scoperta");


            return indice;

        } catch (NumberFormatException e) {
            throw new MemoryGameException( "errore: non hai inserito un intero ");
        }

    }

}
