package classroomFour;

public class House {
    int stavuSkaits;
    boolean irLifts;
    boolean irAutoStavvieta;
    String krasa;
    String ielasNosaukums;
    int majasNumurs;

    public House(int stavuSkaits, boolean irLifts, boolean irAutoStavvieta, String krasa, String ielasNosaukums, int majasNumurs) {
        this.stavuSkaits = stavuSkaits;
        this.irLifts = irLifts;
        this.irAutoStavvieta = irAutoStavvieta;
        this.krasa = krasa;
        this.ielasNosaukums = ielasNosaukums;
        this.majasNumurs = majasNumurs;
    }
    public House(){
        System.out.println(" Hello");
    }

    public void printHouse(){
        System.out.println("Mājas adrese ir " + ielasNosaukums + "  " + majasNumurs);
        System.out.println("Māja ir " + krasa + " krāsā");
        System.out.println("Mājā ir " + stavuSkaits + " stāvi");

    }
    public String adrese(){
        return ielasNosaukums + " " + majasNumurs;
    }
}
