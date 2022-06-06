package classroomTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticalTaskTwo {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi savu 'vardu!");
//        String name = scanner.nextLine();
//        System.out.println("Ievadi savu vecumu");
//        int age = scanner.nextInt();
//        System.out.println(String.format("Mani sauc %s", name));
//        System.out.println("Esi sveicināts: " +name+ "!");
//        System.out.println("Jūsu vecums ir: " + age);
//
//
//
//        System.out.println("Ievadi pirmo skitli: ");
//        int a = scanner.nextInt();
//        System.out.println("Ievadi otro skaitli: ");
//        int b = scanner.nextInt();
//        int summa = a + b;
//        System.out.println("Šo skaitļu summa ir " + summa);
//

        int a = 5;
        int b = 10;
        int c = 5;
        int d = 11;
        //Lielāks >
        System.out.println(b > a);    //True
        System.out.println(a > b);    //False
        //Mazāks <
        System.out.println(a < b);    //True
        System.out.println(b < a);    //False
        //Vienāds ==
        System.out.println(a == c);   //True
        System.out.println(a == b);   //False
        System.out.println(b == c);   //False
        //Nav vienāds !=
        System.out.println(a != b);   //True
        System.out.println(a != c);   //False
        //Mazāks vienāds <=
        System.out.println(a <= c);   //True
        //Lielāks vienāds >=
        System.out.println(b >= d);   //False

        int vecums = 18;
        boolean vaiDrikstBalsot = (vecums >= 18);
        System.out.println("Vai cilvēks drīkst balsot? " + vaiDrikstBalsot);

        String name = "Sandris";
        String secondName = "Jānis";
        boolean vaiVardiSakrit = (name.equals(secondName));
        System.out.println("vai vardi sakrit? " + vaiVardiSakrit);

        System.out.println();

        int e = 4;

        boolean vaiIrPatiess = ((e < 5) && (e < 10));  //Loģiskais operators 'un' &&
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = ((e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);

        vaiIrPatiess = ((e < 5) || (e < 10));       //Loģiskais 'vai' ||
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = (!(e < 5));                   //Loģiskais 'nē' ! (vai nepatiess)
        System.out.println(vaiIrPatiess);

        System.out.println(!(false == true));


        int vecumsDivi = 17;
        if (vecumsDivi >= 18) {
            System.out.println("Cilvēks drīkst balsot!");
        } else {
            System.out.println("Cilvēks nedrīkst balsot!");
        }

        System.out.println("Koda turpinājums");
        System.out.println("Ievadi savu vecumu...");

        int vecumsTris = scanner.nextInt();
        if (vecumsTris >= 18) {
            System.out.println("Cilvēks drīkst balsot!");
        } else {
            System.out.println("Cilvēks nedrīkst balsot!");
        }


        System.out.println("Koda turpinājums.");

        System.out.println("Ievadi skaitli...");
        int skaitlisViens = scanner.nextInt();
        if (skaitlisViens == 10) {
            System.out.println(" Printējam skaitlis 10");
        } else if (skaitlisViens == 15) {
            System.out.println(" Printējam skaitlis 15");
        } else if (skaitlisViens == 20) {
            System.out.println(" Printējam skaitlis 20");
        } else {
            System.out.println("Skaitlis ir nezināms");
        }

        System.out.println("Koda turpinājums.");


        // Janodefine cilveks :
        // Civēka vecums,
        // Cilvēka dzimums - V vai S
        // Sieviete drīkst doties pensijā no 60 gadiem
        // Vīrietis drīkst doties pensija no 65 gadiem

        int cilvekaVecums = 63;
        char cilvekaDzimums = 'V';
        boolean drikstDotiesPensija = false;

        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
            System.out.println("Vīrietis drīkst doties pensijā");
        }
        else if (cilvekaVecums >=60 && cilvekaDzimums == 'S'){
            System.out.println("Sieviete drīkst doties pensijā");
        }
        else {
            System.out.println("Pensijā nedrīkst doties");
        }

        System.out.println("Koda turpinājums.");

        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
            drikstDotiesPensija = true;
        }
        else if (cilvekaVecums >=60 && cilvekaDzimums == 'S'){
            drikstDotiesPensija = true;
        }
        if(drikstDotiesPensija){
            System.out.println("Cilvēks drīkst doties pensijā!");
        }




        int diena = 7;
        String dienasVards;

        switch (diena) {
            case 1:
                dienasVards = "Pirmdiena";
                break;
            case 2:
                    dienasVards = "Otrdiena";
                    break;
            case 3:
                    dienasVards = "Trešdiena";
                    break;
            case 4:
                    dienasVards = "Cetrudiena";
                    break;
            case 5:
                dienasVards = "Piekdiena";
                break;
            case 6:
                dienasVards = "Sestdiena";
                break;
            case 7:
                dienasVards = "Svētdiena";
                break;
            default:
                dienasVards = "Nezināma diena";

        }
        System.out.println(dienasVards);

        System.out.println("Uzdevumi!!!");

//        int skaitlis1;
//        try {
//            skaitlis1 = scanner.nextInt();
//            if (skaitlis1 > 0) {
//                System.out.println("Lielaks par 0");
//            } else if (skaitlis1 < 0){
//                System.out.println("Mazaks par 0");
//            } else{
//                System.out.println("Skaitlis ir 0");
//            }
//        }
//        catch (InputMismatchException e){
//            System.out.println("Tas nav skaitlis");
//        }


        System.out.println("Ievadi veselu skaitli!");
        int veselsSlaitlis = scanner.nextInt();
        if(veselsSlaitlis > 0) {
            System.out.println("Skaitlis " + veselsSlaitlis + " ir lielāks par 0");
        }
        else if(veselsSlaitlis < 0) {
            System.out.println("Skaitlis " + veselsSlaitlis+ " nav lielāks par 0");
        }
        else{
            System.out.println("Skaitlis ir 0");
        }

        int skaitlisJauns = 4;
        if(skaitlisJauns%2 == 0){
            System.out.println("Skaitlis ir pāra skaitlis");
        }else {
            System.out.println("Skaitlis ir nepāra skaitlis");
        }







    };
}
