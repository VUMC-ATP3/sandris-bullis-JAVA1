package homework.oop_homeWork;

public class ServiceDiscount {
//    p-20, g-15, s-10
//    nav abonamentu nav atlaide
//    ir abonaments ir 10% atlaide
//    atlaide tikai par Pakalpojumu
//    pakalpojuma cena
//    produkta cena
//    discount metode  - static

    public double premium, gold, silver;

    public int pakCena;
    public int pAtlaide = 20;
    public int gAtlaide = 15;
    public int sAtlaide = 10;

    public DiscountRate(double premium, double gold, double silver, int pakCena) {
        this.premium = premium;
        this.gold = gold;
        this.silver = silver;
        this.pakCena = pakCena;
    }

    public void Premium(){
        premium = pakCena - (pakCena * (pAtlaide / 100));
    }
    public void Gold(){
        gold = pakCena - (pakCena * (gAtlaide / 100));
    }
    public  void Silver(){
        silver = pakCena - (pakCena * (sAtlaide / 100));
    }

}
