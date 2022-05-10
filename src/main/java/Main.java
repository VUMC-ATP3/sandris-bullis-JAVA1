public class Main {
    public static void main(String[] args) {
        // (mainīgā tips) (mainīgā nosaukusms) = (vērtība);
        int vecumsSuns = 3;         // Vesels skaitlis
        String vardsSuns = "Reksis"; // Teksts
        String vardsSuns1 = "Lesija";
        double svarsSuns = 15.8;      // Daļskaitlis
        float augumsSuns = 60.2F;   // Daļskaitlis
        boolean irIzsalcis = false;  // Tikai true = 1 vai false = 0
        boolean irSkirnesSuns = false;


        char dzimums = 'V';
        char dzimumsDivi = 'S';
        char vaditajaKategorija = 'B';

        boolean isStringsTheSame = vardsSuns.equals(vardsSuns1);
        System.out.println("Vai abi vārdi ir vienādi?" + isStringsTheSame);


        System.out.println("Mans suns" + "\n" );
        System.out.println("Vecums");
        System.out.println(vecumsSuns);
        System.out.println("Vārds");
        System.out.println(vardsSuns);
        System.out.println("Suņa svars");
        System.out.println(svarsSuns+" kg");
        System.out.println("Mana suņa augstums" + " " + augumsSuns + " cm");
        System.out.println("Vai mans suns ir izsalcis");
        System.out.println(irIzsalcis);
        System.out.println("Vai mans suns ir šķirnes suns");
        System.out.println(irSkirnesSuns);

        System.out.println();
        System.out.println();

        int vecumsKakis = 7;
        String vardsKakis = "Muris";
        double svarsKakis = 4.6;

        System.out.println("Mans kaķis");
        System.out.println("Vecums");
        System.out.println(vecumsKakis);
        System.out.println("Vārds");
        System.out.println(vardsKakis);
        System.out.println("Kaķa svars");
        System.out.println(svarsKakis+" kg");

        System.out.println("Kaķa un suņa kopējais vecums ir");
        System.out.println(vecumsKakis+vecumsSuns);
        System.out.println(vardsKakis+" " + vardsSuns);
        System.out.println();

        System.out.println("Hello Sandris");
        System.out.println();

        // (mainīgā tips) (mainīgā nosaukusms) = (vērtība);
        byte menesiGada = 12;
        int gadaApgrozijums = 2147483647;
        long gadaApgrozijumsDolaros = 2147483699L;
        short dienasGada = 365;
        System.out.println(gadaApgrozijums + "\n" + menesiGada + "\n" + gadaApgrozijumsDolaros + "\n" + dienasGada);


        int summa;
        int starpiba;
        int reizinajums;
        double dalijums;
        int atlikums;

        int x = 5;
        int y =10;

        double z = 5;
        double q = 10;
        double w = 12;

        summa = x + y;
        starpiba = x - y;
        reizinajums = x * y;
        dalijums = z / q;
        atlikums = 12%5;
                

        int skaitlis = 6;
        System.out.println("Ja atbilde ir 0, šis ir pāra skaitlis " + skaitlis%2); // Ja 1, tad nepāra.

        System.out.println("SUMMA " + summa);
        System.out.println("STARPIBA " + starpiba);
        System.out.println("Reizinajums " + reizinajums);
        System.out.println("Dalijums " + dalijums);
        System.out.println("Atlikums " + atlikums);




    }


}
