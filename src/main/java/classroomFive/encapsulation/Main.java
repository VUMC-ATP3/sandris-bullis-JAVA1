package classroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.printWeather();
   //   weather.metodeDivi(); //nevar izsaukt, jo privara metode
        weather.metodeTris();
        weather.isRaining = true;
        weather.temperatureAtNight = 13.4;

        Human cilveks = new Human();
        Human cilveks2 = new Human();
        Human cilveks3 = new Human(12,154.2,"Peteris");


        System.out.println(cilveks3.toString());
        cilveks3.setAge(-3);
        System.out.println(cilveks3.toString());
        System.out.println(cilveks3.getAge());
        cilveks3.setAge(18);
        System.out.println(cilveks3.getAge());
        System.out.println(cilveks3.getName());
        System.out.println(cilveks3.toString());

        System.out.println("Taisam Riņķi!!!");

        Rinkis rinkis = new Rinkis();
        rinkis.setRadiuss(2.0);


        Rinkis rinkis2 = new Rinkis(3.0, "Zils");
        rinkis2.setKrasa("Zaļa");




    }
}
