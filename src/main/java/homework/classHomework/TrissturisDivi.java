package homework.classHomework;

public class TrissturisDivi {

    int malaA = 5;
    int malaB = 6;
    int malaC = 7;
    double laukums;
    double pusPerimetrs;


    public double TrissturaLaukumaAprekins() {
        pusPerimetrs = (malaA + malaB + malaC) / 2d;
        laukums = Math.sqrt(pusPerimetrs * (pusPerimetrs - malaA) * (pusPerimetrs - malaB) * (pusPerimetrs - malaC));
        return (laukums);
    }


    public boolean vaiVienadMalu() {
        System.out.println("Vai Trīsstūris ir vienādmalu?");
        return malaA == malaB && malaB == malaC;
    }

    public boolean vaiVienadSanu() {
        System.out.println("Vai Trīsstūris ir vienādsānu.");
        return malaA == malaB || malaA == malaC || malaB == malaC;
    }

    public boolean kadsTrissturisDivi() {
        if (malaA == malaB && malaB == malaC)
            System.out.println("Vienādmalu trīsstūris");
        else if (malaA == malaB || malaB == malaC || malaC == malaA)
            System.out.println("Vienādsānu trīsstūris");
        else
            System.out.println("Dažādmalu trīsstūris");
        return (true);
    }
}

