package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public HomeWorkTwo() {
    }

    public static void main(String[] args) {
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
        printBusinessCardTwo("Līga", "Kalniņa", "+371 12312312", 1965);
        printBusinessCardTwo("Juris", "Vītols", "+371 32132132", 1930);
        sum(4, 10);
        int summa = sum(4, 10);
        System.out.println(summa);
        average(10.0, 2.0, 4.0);
        System.out.println(average(10.0, 2.0, 4.0));
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.uzdevums.");
        int x = 1;
        int y = 7;
        int z = 4;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(y > 5 && y <= 10);
        System.out.println(z <= 5 && z < 10);
        System.out.println(x == 0 && x == 10);
        System.out.println(y * y > 10);
        System.out.println("2.uzdevums.");
        System.out.println("Ievadi mēneša skaitli..");
        int menesis = scanner.nextInt();
        String menesaVards;
        switch (menesis) {
            case 1:
                menesaVards = "Janvāris";
                break;
            case 2:
                menesaVards = "Februāris";
                break;
            case 3:
                menesaVards = "Marts";
                break;
            case 4:
                menesaVards = "Aprīlis";
                break;
            case 5:
                menesaVards = "Maijs";
                break;
            case 6:
                menesaVards = "Jūnijs";
                break;
            case 7:
                menesaVards = "Jūlijs";
                break;
            case 8:
                menesaVards = "Augusts";
                break;
            case 9:
                menesaVards = "Septembris";
                break;
            case 10:
                menesaVards = "Oktobris";
                break;
            case 11:
                menesaVards = "Novembris";
                break;
            case 12:
                menesaVards = "Decembris";
                break;
            default:
                menesaVards = "Nezināms mēnesis";
        }

        System.out.println(menesaVards);
        System.out.println("3.uzdevums.");
        System.out.println("Ievadi pirmo skaitli.");
        int a = scanner.nextInt();
        System.out.println("Ievadi otro skaitli.");
        int b = scanner.nextInt();
        System.out.println("Ievadi trešo skaitli.");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println("Lielākais skaitlis ir: " + a);
        } else if (b > c) {
            System.out.println("Lielākais skaitlis ir: " + b);
        } else if (a == b && b == c) {
            System.out.println("Visi skaitļi ir vienādi: " + a);
        } else {
            System.out.println("Lielākais skaitlis ir: " + c);
        }

        System.out.println("4.uzdevums.");
        System.out.println("Luksofors - Sarkans, Dzltens, Zaļš?");
        String krasa = "Zaļš";
        if (krasa.equals("Zaļš")) {
            System.out.println("Zaļš - Ejam pāri ielai");
        } else if (krasa.equals("Dzeltens")) {
            System.out.println("Dzeltens - Pabeidzam ātri manevru.");
        } else if (krasa.equals("Sarkans")) {
            System.out.println("Sarkans - Gaidam.");
        } else {
            System.out.println("Nedeg neviena gaisma - Novērtējam satiksmi un rīkojamies.");
        }

    }

    static void printBusinessCard() {
        String vards = "Jānis";
        String uzvards = "Bērziņš";
        String telefonanr = "+371 12345678";
        int dzimsanasgads = 1990;
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: " + vards + "\nUzvārds: " + uzvards + "\nTelefona numurs: " + telefonanr + "\nDzimšanas gads: " + dzimsanasgads + "\n##########");
    }

    static void printBusinessCardTwo(String name, String surname, String telephone, int dateOfBirth) {
        System.out.println(" Vizītkarte \n ##########");
        System.out.println(String.format(" Vārds: %s \n Uzvārds: %s \n Telefona numurs: %s \n Dzimšanas gads: %s", name, surname, telephone, dateOfBirth));
        System.out.println(" ##########");
    }

    static int sum(int a, int b) {
        int summa = a + b;
        return summa;
    }

    static double average(double a, double b, double c) {
        double average = (a + b + c) / 3.0;
        return average;
    }
}
