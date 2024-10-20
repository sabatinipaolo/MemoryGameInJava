import java.util.Scanner;

public class Giocatore {
    private Scanner sc = new Scanner(System.in);

    private static int leggeInInput(Scanner sc) {
        int indiceScelto;
        System.out.print("quale carta vuoi scoprire ? ");
        indiceScelto = sc.nextInt();
        return indiceScelto;
    }

    public Carta scopreUnaCartaDel(Mazzo mazzo) {

        int indiceScelto = leggeInInput(sc);
        while (inputNonCorretto(indiceScelto, mazzo)) {
            indiceScelto = leggeInInput(sc);
        }

        mazzo.getCartaAllaPosizione(indiceScelto).scopriti();
        mazzo.stampa();

        return mazzo.getCartaAllaPosizione(indiceScelto);
    }

    private boolean inputNonCorretto(int indiceScelto, Mazzo mazzo) {

        if ((indiceScelto < 0) || (indiceScelto > 9)) {
            System.out.println("scelta non corretta");
            return true;
        }

        if (mazzo.getCartaAllaPosizione(indiceScelto).isNotInGioco()) {
            System.out.println("scelta non corretta");
            return true;
        }

        if (mazzo.getCartaAllaPosizione(indiceScelto).isNotCoperta()) {
            System.out.println("scelta non corretta");
            return true;
        }

        return false;
    }

}
