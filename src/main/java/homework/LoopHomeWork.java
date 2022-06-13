package homework;

import java.util.Scanner;

public class LoopHomeWork {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // 3.uzdevums

        int [] pirmaisMasivs = {1,2,3,4,5,6,7};
        String [] otraisMasivs = {"Pirmdiena","Otrdiena","Trešdiena","Ceturtdiena","Piektdiena","Sestdiena","Svētdiena"};
        char [] tresaisMasivs = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};


        System.out.println("Pirmais masīvs ar WHILE");
        int skaitlis = 1;
        while (skaitlis <= pirmaisMasivs.length) {
            System.out.println(skaitlis + ". nedēļas diena");
            skaitlis++;
        }

        System.out.println("Pirmais masīvs ar DO WHILE");

        do {
            System.out.println(skaitlis + ". diena");
            skaitlis++;

        } while (skaitlis >= pirmaisMasivs.length);










    }

}
