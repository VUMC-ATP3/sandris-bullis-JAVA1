package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        Trissturis pirmais = new Trissturis();
        pirmais.malaA = 5;
        pirmais.malaB = 6;
        pirmais.malaC = 7;
        pirmais.laukums = pirmais.TrissturaLaukumaAprekins();
        System.out.println(pirmais.laukums);
        System.out.println(pirmais.vaiVienadMalu());
        System.out.println(pirmais.vaiVienadSanu());

        System.out.println(pirmais.kadsTrissturisViens());



        TrissturisDivi otrais = new TrissturisDivi();
        otrais.laukums = otrais.TrissturaLaukumaAprekins();
        System.out.println(otrais.laukums);
        System.out.println(otrais.vaiVienadMalu());
        System.out.println(otrais.vaiVienadSanu());
        System.out.println(otrais.kadsTrissturisDivi());
    }

}
