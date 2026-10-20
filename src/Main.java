import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PytanieZamkniete[] pytania = {
                new PytanieZamkniete("Które to schronisko?","zad1.jpg",
                        "Na Rysiance.",
                        "Na Wielkiej Raczy.",
                        "Na Wielkiej Rycerzowej.",
                        'B'),
                new PytanieZamkniete("Zwierzę na zdjęciu to","zad2.jpg",
                        "owczarek.",
                        "wilk.",
                        "kozica.",
                        'A'),
                new PytanieZamkniete("W oddali są widoczne","zad3.jpg",
                        "Himalaje.",
                        "Alpy.",
                        "Tatry.",
                        'C')
        };
        for(int i = 0; i < pytania.length; i++){
            pytania[i].wyswietlPytanie();
            System.out.println("Podaj odpowiedź (A/B/C): ");
            char odpowiedz = scanner.next().charAt(0);

            while (odpowiedz != 'A' && odpowiedz != 'B' && odpowiedz != 'C' &&
                    odpowiedz != 'a' && odpowiedz != 'b' && odpowiedz != 'c') {
                System.out.println("Podaj A, B lub C: ");
                odpowiedz = scanner.next().charAt(0);
            }

            if(pytania[i].sprawdzOdpowiedz(odpowiedz)){
                System.out.println("Poprawna odpowiedź!");
            }else {
                System.out.println("Zła odpowiedź!");
            }
        }
        scanner.close();
    }
}