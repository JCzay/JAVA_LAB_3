import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę: ");
        Scanner scan = new Scanner(System.in);
        while (true) {
            int number = scan.nextInt();
            switch (number) {
                case 0:
                    System.out.println("Podana przez Ciebie liczba to 0 więc program zostanie zakończony! " + StatusEnum.KONIEC);
                    return;
                case 1:
                    System.out.println("Słowny zapis liczby: " + LiczbyEnum.JEDEN);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 2:
                    System.out.println("Słowny zapis liczby: " + LiczbyEnum.DWA);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 3:
                    System.out.println("Słowny zapis liczby: " + LiczbyEnum.TRZY);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 4:
                    System.out.println("Słowny zapis liczby: " + LiczbyEnum.CZTERY);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 5:
                    System.out.println("Słowny zapis liczby: " + LiczbyEnum.PIEC);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 6:
                    System.out.println("Słowny zapis liczby: " + LiczbyEnum.SZESC);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                default:
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
            }
        }

    }

    enum LiczbyEnum {
        JEDEN, DWA, TRZY, CZTERY, PIEC, SZESC
    }
    enum StatusEnum {
        KONTYNUUJEMY, KONIEC
    }
}
