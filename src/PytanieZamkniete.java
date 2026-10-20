public class PytanieZamkniete extends Pytanie{
    private String odpA, odpB, odpC;
    private char poprawnaOdpowiedz;

    public PytanieZamkniete(String tresc, String zdjecie, String odpA, String odpB, String odpC, char poprawnaOdpowiedz){
        super(tresc, zdjecie);
        this.odpA = odpA;
        this.odpB = odpB;
        this.odpC = odpC;
        this.poprawnaOdpowiedz = poprawnaOdpowiedz;
    }

    @Override
    public boolean sprawdzOdpowiedz(char odpowiedz){
        if(Character.toUpperCase(odpowiedz) == poprawnaOdpowiedz){
            czy_poprawna = true;
        }else {
            czy_poprawna = false;
        }
        return czy_poprawna;
    }

    public void wyswietlPytanie(){
        System.out.println(tresc);
        System.out.println("A: " + odpA);
        System.out.println("B: " + odpB);
        System.out.println("C: " + odpC);
    }
}
