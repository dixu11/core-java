package collections.implementations.arra_list.md;

public class Uzytkownik {

    // pola

  public String imie;
   public String nazwisko;
    public int wiek;




    // metody

    public void zmienImie(String noweImie) {
        imie = noweImie;
    }






    @Override
    public String toString() {
        return "imie: " +  imie + " wiek: " + wiek;
    }
}
