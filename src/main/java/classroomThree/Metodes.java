package classroomThree;

public class Metodes {
    public static void main(String[] args) {
        int b = 9;
        int a = kvadrataLaukums(3);
        float c = taisnsturaLaukums(3.4F, 5.3F);

        printetTekstu(kvadrataLaukums(5), taisnsturaLaukums(3.3F, 5.6F));
        printetTekstu(a,c);
        System.out.println(prettyPrint("#######"));

        System.out.println("Kvadrāta laukums "+ a);
        System.out.println(" Taisnstūra laukums "+ c);

    }
    static String prettyPrint(String s){
        return "asdasdasd" + "asdadasdddddd";

    }

    static void printetTekstu( int a, float c){
//        System.out.println("Kvadrāta laukums "+ );
//        System.out.println("Taisnstūra laukums "+ );
    }
    static float taisnsturaLaukums( float a, float b){
        float s = a * b;
        return s;
    }


    //metode, kas aprēkina kvadrāta laukumu
    //int - tips ko atgriez
    //kvadratlaukums - metodes nosaukums
    //int ma;a - arguments/parametrs


    static int kvadrataLaukums(int mala) {
        int laukums = mala * mala;
        return laukums;
    }
}



