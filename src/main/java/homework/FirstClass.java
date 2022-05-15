package homework;

public class FirstClass {
    public static void main(String[] args) {
        // Šeit būs jāraksta mājasdarbs!!!

        // Nosaukums
        String valstsNosaukums = "Moldovas republika";

        // Iedzīvotājus skaits
        int iedivotajuSkaits = 2913281;

        // Platība
        double platiba = 33.843;

        // Galvaspilsēta
        String galvasPilseta = "Kišiņeva";

        // Oficiāla valoda
        String oficialaValoda = "rumāņu";

        // Vai ir ES dalībvalsts
        boolean esDalibvalsts = false;

        // Valūta (viens simbols)
        char valuta= 'L';

        System.out.println("\n" + "Pirmais variants - ");
        System.out.println(
                "Nosaukums: " + valstsNosaukums + "\n" + "Iedzīvotāju skaits: " + iedivotajuSkaits + "\n" +
                        "Platība: " + platiba + " km^2" + "\n" + "Galvaspilsēta: " + galvasPilseta + "\n" +
                        "Oficiālā valoda: " + oficialaValoda + "\n" + "ES dalībvalsts: " + esDalibvalsts + "\n" +
                        "Valūta: " + valuta
        );

        System.out.println("\n" + "Otrais variants - ");
        String valstsInfo = String.format(
                " Nosaukums: %s \n Iedzīvotāju skaits: %s \n Platība: %s \n Galvaspilsēta: %s \n Oficiālā valoda: %s \n ES dalībvalsts: %s \n Valūta %s",
                valstsNosaukums, iedivotajuSkaits, platiba + " km^2", galvasPilseta, oficialaValoda, esDalibvalsts, valuta
        );
        System.out.println(valstsInfo);

        System.out.println("\n" + "Trešais variants - ");
        System.out.println("Nosaukums: ");
        System.out.println(valstsNosaukums);
        System.out.println("Iedzīvotāju skaits: ");
        System.out.println(iedivotajuSkaits);
        System.out.println("Platība: ");
        System.out.println(platiba + " km^2");
        System.out.println("Galvaspilsēta: ");
        System.out.println(galvasPilseta);
        System.out.println("Oficiālā valoda: ");
        System.out.println(oficialaValoda);
        System.out.println("ES dalībvalsts: ");
        System.out.println(esDalibvalsts);
        System.out.println("Valūta: ");
        System.out.println(valuta);


                System.out.println("\n" + "Ceturtais variants - ");
                String str1 = String.format("Nosaukums: %s", valstsNosaukums);
                String str2 = String.format("Iedzīvotāju skaits: %s", iedivotajuSkaits);
                String str3 = String.format("Platība: %s", platiba + " km^2");
                String str4 = String.format("Galvaspilsēta: " + galvasPilseta); //Kāpēc te nevajag %s? Ar nestrādā.
                String str5 = String.format("Oficiālā valoda: %s", oficialaValoda);
                String str6 = String.format("ES dalībvalsts: %s", esDalibvalsts);
                String str7 = String.format("Valūta: %s", valuta);
                System.out.println(str1);
                System.out.println(str2);
                System.out.println(str3);
                System.out.println(str4);
                System.out.println(str5);
                System.out.println(str6);
                System.out.println(str7);

        System.out.println("\n" + "Aritmētiskie operatori - ");

// Trīs piemēri ar katru
//      + Saskaitīšana
//      - Atņemšana
//      * Reizināšana
//      / Dalīšana
//      % Atlikums

        double summa;
        int starpiba;
        double reizinajums;
        double dalijums;
        double atlikums;

        int a = 5;
        int b = 7;
        double c = 10;
        double d = 12;
        double e = 15;

        System.out.println("\n" + "Pirmais piemērs - ");

        summa = a + b;
        starpiba = a - b;
        reizinajums = a * b;
        dalijums = c / d;
        atlikums = e%b;

        System.out.println("SUMMA1: " + summa);
        System.out.println("STARPĪBA1: " + starpiba);
        System.out.println("REIZINĀJUMS1: " + reizinajums);
        System.out.println("DALĪJUMS1: " + dalijums);
        System.out.println("ATLIKUMS1: " + atlikums);

        System.out.println("\n" + "Otrais piemērs - ");

        summa = summa + starpiba;
        starpiba = (int) (starpiba - reizinajums);
        reizinajums = reizinajums * dalijums;
        dalijums = dalijums / atlikums;
        atlikums = summa%starpiba;


        System.out.println("SUMMA2: " + summa);
        System.out.println("STARPĪBA2: " + starpiba);
        System.out.println("REIZINĀJUMS2: " + reizinajums);
        System.out.println("DALĪJUMS2: " + dalijums);
        System.out.println("ATLIKUMS2: " + atlikums);

        System.out.println("\n" + "Trešais piemērs - ");

        summa = a + b + c + d;
        starpiba = (a+b) - (a-b);
        reizinajums = (a+b) * (a-b);
        dalijums = (a+b) - (a-b);

        System.out.println("SUMMA3: " + summa);
        System.out.println("STARPĪBA3: " + starpiba);
        System.out.println("REIZINĀJUMS3: " + reizinajums);
        System.out.println("DALĪJUMS3: " + dalijums);

        System.out.println("\n" + "Daži piemēri ar % : ");

        int skaitlis = 13795, skaitlis1 = 789658;

        System.out.println("Atrast skaitļa " + skaitlis + " pēdējo ciparu: " + skaitlis%10);
        System.out.println("Atrast skaitļa " + skaitlis1 + " pēdējo ciparu: " + skaitlis1%10);
        System.out.println();
        System.out.println("Vai skaitlis " + skaitlis + " ir pāra skaitlis? 0-jā, 1-nē. - " + skaitlis%2);
        System.out.println("Vai skaitlis " + skaitlis1 + " ir pāra skaitlis? 0-jā, 1-nē. - " + skaitlis1%2);
        System.out.println();
        dalijums = 15 / 7;
        atlikums = 15 % 7;

        System.out.println("15 un 7 dalījums ir " + dalijums + ", bet atlikums (%) ir " + atlikums);




    }
}
