public class Carta {
    private char valore;

    private boolean coperta;
    private boolean inGioco;

    public Carta(char c) {
        this.valore = c;
        this.coperta = true;
        this.inGioco = true;
    }

    public char getValore() {
        return valore;
    }

    public boolean ugualeA(Carta secondaCarta) {
        return this.valore == secondaCarta.getValore();
    }

    public boolean isCoperta() {
        return coperta;
    }

    public boolean isNotCoperta() {
        return !coperta;
    }

    public void scopriti() {
        this.coperta = false;
    }

    public void copriti() {
        this.coperta = true;
    }

    public void mettitiFuoriDalgioco() {
        this.inGioco = false;

    }

    public boolean isNotInGioco() {
        return !this.inGioco;
    }

}
