package homework.classHomework;

public class Trissturis {
    int malaA;
    int malaB;
    int malaC;
    double laukums;
    double pusPerimetrs;


    Trissturis() {
        System.out.println("Mēs veidojam trīsstūri");
    }

    public double TrissturaLaukumaAprekins() {
        pusPerimetrs = (malaA + malaB + malaC) / 2d;
        laukums = Math.sqrt(pusPerimetrs * (pusPerimetrs - malaA) * (pusPerimetrs - malaB) * (pusPerimetrs - malaC));
        return (laukums);
    }

    public boolean vaiVienadMalu() {
        System.out.println("Vai Trīsstūris ir vienādmalu?");
        if (malaA == malaB && malaB == malaC) {
            return true;
        } else {
            return (false);
        }
    }

    public boolean vaiVienadSanu() {
        System.out.println("Vai Trīsstūris ir vienādsānu.");
        if (malaA == malaB || malaA == malaC || malaB == malaC) {
            return true;
        } else {
            return (false);
        }
    }

    public boolean kadsTrissturisViens() {

        if (malaA == malaB && malaB == malaC )
            System.out.println("Vienādmalu trīsstūris");
        else if (malaA == malaB || malaB == malaC || malaC == malaA )
            System.out.println("Vienādsānu trīsstūris");
        else
            System.out.println("Dažādmalu trīsstūris");
        return true;
    }

}