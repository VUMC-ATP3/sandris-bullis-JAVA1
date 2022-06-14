package classroomFive.Static;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cik auto uztaisīti: " + Auto.totalCarsCreated);
        Auto masina = new Auto("BMW");
        Auto masinaDivi = new Auto("Mercedes");
        System.out.println("Cik auto uztaisīti: " + Auto.totalCarsCreated);
        Auto masinaTris = new Auto("Opel");
        Auto masinaCetri = new Auto("Fiat");
        System.out.println("Cik auto uztaisīti: " + Auto.totalCarsCreated);
        Auto.printText();



    }
}
