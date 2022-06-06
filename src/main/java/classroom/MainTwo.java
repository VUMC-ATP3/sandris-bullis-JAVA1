package classroom;

public class MainTwo {
    public static void main(String[] args) {
        String vards = "Sandris";
        String uzvards = "Bullis";
        int vecums = 36;
        boolean isPresent = true;

        System.out.println("Vārds: " + vards + "\n" + "Uzvārds: " + uzvards + "\n"
        + "Vecums: " + vecums + "\n" + "Vai bija nodarbībā? " + isPresent);

        String teikums = String.format(" Vārds: %s \n Uzvārds %s \n Vecums %s \n isPresent %s",vards, uzvards, vecums, isPresent);

        System.out.println(teikums);

        double lowestTemperature = -20.4;
        float highestTemperature = 40.65512312F;
        System.out.println("Augstaka temp ir " + highestTemperature + "zemaka temp ir " + lowestTemperature);
//        String teikums = String.format("Augstākā temperatūra ir %.2f Zemākā temperatūra ir %s",highestTemperature,lowestTemperature);
//        System.out.println(teikums);
//        String teikums = String.format("Augstākā temperatūra ir %.2f Zemākā temperatūra ir %2Ss. Zemāka temp %2$s. Augstaka Temo %1$.4f",highestTemperature,lowestTemperature);






    }
}
