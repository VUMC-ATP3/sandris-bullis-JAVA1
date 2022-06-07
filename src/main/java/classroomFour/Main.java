package classroomFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       House majaViens = new House(4,true,false,"Zaļa","Brīvības", 21);
       majaViens.printHouse();

       House majaDivi = new House(55, false, true, "Zila", "Stabu", 99);
       majaDivi.printHouse();

       House majaTris = new House();

       Velosipeds zzk = new Velosipeds();
       zzk.bremzuTips = 'D';
       zzk.printetAtrumu();
       System.out.println("Cilvēks uzkāpj uz velosipēda in min pedāļus");
       zzk.spiestPedalus();
       zzk.spiestPedalus();
       zzk.spiestPedalus();
       zzk.spiestPedalus();
       zzk.printetAtrumu();
       System.out.println("Priekšā izlec kaķis, vajag bremzēt");
       zzk.bremzet();
       zzk.bremzet();
       System.out.println("Velo ātrums ir " + zzk.atrums);

       Velosipeds merida = new Velosipeds();
       merida.bremzuTips = 'V';
       merida.printetAtrumu();

       Velosipeds vecsVelosipeds = new Velosipeds();
       vecsVelosipeds.bremzuTips = 'S';
       vecsVelosipeds.bremzet();


       Kompanija displeji = new Kompanija();
       displeji.nosaukums = "Displeji";
       displeji.kompanijasVecums = 20;
       displeji.darbibasJoma = "Multimediju ierīces";
       displeji.atrašnāsVieta = "Rīga";
       displeji.darbiniekuSkaits = 10;
       displeji.printKompanija();

       Rinkis mansRinkis = new Rinkis(5);
       System.out.println(Math.PI);
       System.out.println(mansRinkis.radiuss);
       System.out.println(mansRinkis.aprekinatLaukumu());
       mansRinkis.printCreatedTime();

       Rinkis mansRinkis2 = new Rinkis();
       System.out.println(Math.PI);
       mansRinkis2.radiuss = 50;
       System.out.println(mansRinkis2.radiuss);
       System.out.println(mansRinkis2.aprekinatLaukumu());
       System.out.println(mansRinkis2.aprekinatRinkaLinijasGarumu());
       mansRinkis2.printCreatedTime();



       System.out.println("======================");
       Rinkis mansRinkis3 = new Rinkis(12.3);
       System.out.println(mansRinkis3.laukums);
       System.out.println(mansRinkis3.rinkaLinijasGarums);
       System.out.println("======================");


       Suns reksis = new Suns();
       reksis.name = "Dingo";
       reksis.vaiRej = false;
       System.out.println(reksis.vaiRej);
       reksis.astesGarums = 10;
       reksis.printName();
       reksis.izdodSkanu();

       Animal dzivnieks = new Animal();
       dzivnieks.name = "Dzīvnieks";
       dzivnieks.printName();
       dzivnieks.izdodSkanu();

       Cat cat = new Cat();
       cat.name = "Muris";
       cat.printName();
       cat.izdodSkanu();


    }
}
