package classroomFive.encapsulation;

public class Rinkis {
    private double radiuss;
    private String krasa;

    Rinkis(){
        System.out.println("No-arg konstruktors");
        this.radiuss = 1.0;
        this.krasa = "Sarkana";
    }

    public Rinkis(double radiuss, String krasa) {
        this.radiuss = radiuss;
        this.krasa = krasa;
    }

    public double getRadiuss() {
        return radiuss;
    }

    public void setRadiuss(double radiuss) {
        this.radiuss = radiuss;
    }

    public String getKrasa() {
        return krasa;
    }

    public void setKrasa(String krasa) {
        this.krasa = krasa;
    }

    double aprekinatLaukumu(){
        return Math.pow(radiuss, 2) * Math.PI;
    }
}
