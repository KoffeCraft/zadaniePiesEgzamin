public abstract class Pytanie {
    protected String tresc, zdjecie;
    protected boolean czy_poprawna;

    public Pytanie(String tresc, String zdjecie){
        this.tresc = tresc;
        this.zdjecie = zdjecie;
        this.czy_poprawna = false;
    }

    public abstract boolean sprawdzOdpowiedz(char odpowiedz);
}
