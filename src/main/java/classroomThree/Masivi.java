package classroomThree;

import java.util.Random;
import java.util.Scanner;

public class Masivi {
    public static void main(String[] args) {

        Random skaitluGenerators = new Random();
        for (int i = 0; i <100 ; i++) {
            System.out.println(skaitluGenerators.nextInt(100));
        }

        int nejaussSkaitlis = skaitluGenerators.nextInt(50);
        System.out.println(nejaussSkaitlis);




        majuParbaude(1, 50, 20);
        majuParbaude(10, 20, 15);

        int sakotnejs = 0;
        while(sakotnejs<=100){
            System.out.println(sakotnejs);
            // sakotnejs++;
            sakotnejs = sakotnejs +2; //visi pāra skaitļi
        }

        String pietura = "Centrālā stacija";
        //saraksts/array/masivs
        String[] stacijas = {"Centrālā", "Torņkalns", "Majori", "Jūrmala", "Brasla"};
        String[] pieturas = {"Centrālā stacijas", "Marijas iela", "Bērnu pasaule", "Ziedoņdārzs", "PieturaX"};

        printetTekstaMasivu(stacijas);
        printetTekstaMasivu(pieturas);


        int[] majuNumuri = {1,2,3,4,5,6,7,8,9};
        for (int numuri : majuNumuri){
            System.out.println("For numuri: " + numuri);
        }
        printetIntMasivu(majuNumuri);


        char [] patskani = {'a', 'e', 'u', 'i'};

        System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);
        pieturas[3] = "Zemitanu STACIJA";
        System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);


        System.out.println("Cik pieturas ir masīvā? " + pieturas.length);
        System.out.println("Cik mājas ir uz ielas? " + majuNumuri.length);

        String[] hokejaCempioniTopTris = new String[3];
        System.out.println("Cik vietas ir čempionātā? " + hokejaCempioniTopTris.length);
        String pirmaVieta = "Somija";
        String otraVieta = "Kanāda";
        String tresaVieta = "Čehija";

        hokejaCempioniTopTris[0] = pirmaVieta;
        hokejaCempioniTopTris[1] = otraVieta;
        hokejaCempioniTopTris[2] = tresaVieta;

        System.out.println(hokejaCempioniTopTris[0] + "\n" + hokejaCempioniTopTris[1] + "\n" + hokejaCempioniTopTris[2]);


        System.out.println("Cikls sākās");
        int i = 0;
        //infinite loop
        //bezgalīgs cikls
        while(i<5){
            //kods, kurš izpidas, ja nosacījums ir true(patiess)
            System.out.println(i);
            i = i +1;
        }
        System.out.println("Cikls beidzās");



//        int y = 0;
//        do {
//            System.out.println("DO WHILE: " + y);
//            y++;
//        }while (y < 10);
//
//        Scanner scanner = new Scanner(System.in);
//        String parole = "VislabakaParole";
//        String lietotajaIevaditaParole;
//
//        do {
//            System.out.println("Ievadi paroli!");
//            lietotajaIevaditaParole = scanner.nextLine();
//            System.out.println("Notiek paroles pārbaude.");
//        }while (!lietotajaIevaditaParole.equals(parole));
//        System.out.println("Pareiza Parole");
//
//
//        int number;
//        do {
//            System.out.println("Ievadi pozitīvu skaitli" );
//            number = scanner.nextInt();
//        }while (number <= 0);
//        System.out.println("Skaitlis ir pozitivs:" + number);





        for (int j = 0; j < 5; j++) {
            System.out.println("FOR Cikls: " + j);
        }

        for (int j = 5; j <= 10; j++ ) {
            System.out.println("FOR Cikls no 5: " + j);
        }

        for (int j = 0; j <= 10; j=j+2) {
            System.out.println(j);
        }

        String[] mansMasivs = {"Juris", "Anna", "Peteris", "Janis"};
        for (String randomString : mansMasivs){
            System.out.println("For Each: " + randomString);
        }


        for (int j = 0; j < mansMasivs.length; j++){
            System.out.println(mansMasivs[j]);
        }

        System.out.println("Cikla sākums!");
        for (int j = 0; j < 10; j++) {
            if(j==5){
                System.out.println("J ir 5, laužam ciklu!");
                break;
            }
            System.out.println("Print Break Example: " + j);
        }
        System.out.println("Cikla beigas!");



        int [] skaitluMasivs = {3,4,6,7,2,1,-5,-4,2,6,-4,-3,3};
        for (int j = 0; j < skaitluMasivs.length; j++) {
            System.out.println("Viss masīvs: " + skaitluMasivs[j]);
            if(skaitluMasivs[j] < 0){
                System.out.println("Pirmais negatīvais skaitlis: " + skaitluMasivs[j]);
                System.out.println("Indekss ir: " + j);
                break;
            }
        }

        int [] skaitluMasivs2 = {3,4,6,7,2,1,-5,-4,2,6,-4,-3,3};
        for (int j = 0; j < skaitluMasivs2.length; j++) {
            if(skaitluMasivs2[j] < 0) {
                continue;
            }
            System.out.println("Vertība no skaitļu masīva: " + skaitluMasivs2[j]);
        }








    }

    static void printetTekstaMasivu(String[] randomMasivs){
        int skaititajs = 0;
        while (skaititajs < randomMasivs.length) {
            System.out.println(randomMasivs[skaititajs]);
            skaititajs = skaititajs + 1;
        }

    }

    static void printetIntMasivu(int[] kautko){
        int i = 0;
        System.out.println("==========Masīvs sākas==========");
        while(i< kautko.length){
            System.out.println(kautko[i]);
            i++;
        }
        System.out.println("==========Masīvs beidzas==========");

    }

    static void majuParbaude(int sakums, int beigas, int iznemums) {
        int majuNr = sakums;
        while (majuNr <= beigas) {
            if (majuNr % 3 == 0 || majuNr % 5 == 0 || majuNr == iznemums){
                System.out.println("Šie māju nr neder: " + majuNr);
        } else{
            System.out.println("Šie māju nr der: " + majuNr);
        }
                majuNr++;
        }
//        static void majuParbaude(int sakums, int beigas, int iznemums) {
//            int majuNumuri = sakums;
//        while (majuNumuri <= beigas)
//            for (int i = majuNumuri; i <= beigas; i++)
//            {
//                if (majuNumuri % 3 == 0 || majuNumuri % 5 == 0 || majuNumuri == iznemums) {
//                    System.out.println("šie māju numuri neder" + majuNumuri);
//                } else {
//                    System.out.println("šie māju numuri DER " + majuNumuri);
//                }
//            }
//        }
        for (int j = 0; j >= -100; j-- ){
            System.out.println("For Cikls: " + j);
        }









    }


}
