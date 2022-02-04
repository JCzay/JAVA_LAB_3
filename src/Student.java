
public class Student{
    String imie;
    String nazwisko;
    int wiek;
    boolean male;

    @Override
    public String toString(){
        return this.imie + " " + this.nazwisko + " (" + this.wiek + ") - " + (this.male ? "Mężczyzna" : "Kobieta");
    }
}