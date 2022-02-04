import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student[] tab = {new Student(), new Student(), new Student()};

        tab[0].imie = "Julian";
        tab[0].nazwisko = "Czaja";
        tab[0].wiek = 23;
        tab[0].male = true;

        tab[1].imie = "Nikodem";
        tab[1].nazwisko = "Dyzma";
        tab[1].wiek = 41;
        tab[1].male = true;

        tab[2].imie = "Justyna";
        tab[2].nazwisko = "Kowalczyk";
        tab[2].wiek = 44;
        tab[2].male = false;

        for (Student student : tab) {
            System.out.println(student);

        }
    }
}
