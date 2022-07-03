package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //    1.uzdevums.
        System.out.println("#####  1. Uzdevums.  #####");
        int input;
        int sum = 0;

        while (sum < 100) {
            System.out.println("Ievadi veselu skaitli: ");
            input = scanner.nextInt();
            sum += input;
        }
        System.out.println("GATAVS" + "\n" + "Ievadīto skaiļu summa ir : " + sum);

//    2.uzdevums.
        System.out.println("#####  2. Uzdevums.  #####");

        int a, b, c, d = 0;

        System.out.println("Ievadi veselu skaitli: ");
        a = scanner.nextInt();
        c = a / 2;
        if (a == 0 || a == 1) {
            System.out.println(a + " nav Pirmskaitlis");
        } else {
            for (b = 2; b <= c; b++) {
                if (a % b == 0) {
                    System.out.println(a + " nav Pirmskaitlis");
                    d = 1;
                    break;
                }
            }
            if (d == 0) {
                System.out.println(a + " ir Pirmskaitlis");
            }
        }

        // 3. Uzdevums.
        System.out.println("#####  3. Uzdevums.  #####");

        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strArray = new String[]{"Audi", "BMW", "Volvo", "Honda", "Nissan", "Subaru", "Toyota", "Ford", "Kia", "MINI"};
        char[] charArray = new char[]{'a', 'b', 'v', 'h', 'n', 's', 't', 'f', 'k', 'm'};

        int index;

        System.out.println("Ar 'while' ciklu: ");

        index = 0;
        while (index < intArray.length) {
            System.out.println(intArray[index]);
            index++;
        }

        index = 0;
        while (index < strArray.length){
            System.out.println(strArray[index]);
            index++;
        }

        index = 0;
        while (index < charArray.length){
            System.out.println(charArray[index]);
            index++;
        }


        System.out.println("Ar 'do-while' ciklu: ");

        index = 0;
        do {
            System.out.println(intArray[index]);
            index++;
        }
        while(index<intArray.length);

        index = 0;
        do {
            System.out.println(strArray[index]);
            index++;
        }
        while(index<strArray.length);

        index = 0;
        do {
            System.out.println(charArray[index]);
            index++;
        }
        while(index<charArray.length);


        System.out.println("Ar 'for' ciklu: ");

        for (index = 0; index < intArray.length; index++) {
            System.out.println(intArray[index]);
        }
        for (index = 0; index < strArray.length; index++) {
            System.out.println(strArray[index]);
        }
        for (index = 0; index < charArray.length; index++) {
            System.out.println(charArray[index]);
        }


        System.out.println("Ar 'for-each' ciklu: ");

        for (int intTemp : intArray ){
            System.out.println(intTemp);
        }
        for (String strTemp : strArray){
            System.out.println(strTemp);
        }
        for (char charTemp : charArray) {
            System.out.println(charTemp);
        }

//    4.Uzdevums.
        System.out.println("#####  4. Uzdevums.  #####");

        int array[] = new int[100];
        for(int i = 2; i<= array.length; i= i+2)
            System.out.print(i);

//    5. Uzdevums.
        System.out.println("\n#####  5. Uzdevums.  #####");

        int num;
        long factorial = 1;

        System.out.println("Ievadi veselu skaitli: ");
        num = scanner.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.printf("Skaitļa %d factoriālā vērtība ir %d. ", num, factorial);

//    6.Uzdevums
        System.out.println("\n#####  6. Uzdevums.  #####");

        final int PIN = 1234;
        int meginajums = 1;
        int kods;
        System.out.println("Lūdzu ievadiet PIN kodu: ");
        kods = scanner.nextInt();
        while (kods != PIN && meginajums < 3) {
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz.");
            System.out.println("Lūdzu ievadiet PIN kodu: ");
            kods = scanner.nextInt();
            meginajums++;
        }
        if (kods == PIN)
            System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ.");
        else if (meginajums >= 3)
            System.out.println("Atvainojiet, bet jūs esat bloķēts.");

    }
}
