package classroomFour;

public class Kompanija {
    String nosaukums;
    String darbibasJoma;
    String atrašnāsVieta;
    int darbiniekuSkaits;
    int kompanijasVecums;

    public void printKompanija(){
        System.out.println("Kompānijas nosaukums ir " + nosaukums);
        System.out.println("Darbības joma ir " + darbibasJoma);
        System.out.println("Atrašanās vieta "+ atrašnāsVieta);
        System.out.println("Kompānija pastāv jau " + kompanijasVecums + " gadus un kopā ir "+ darbiniekuSkaits + " darbinieki.");


    }

}
