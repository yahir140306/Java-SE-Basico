import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Casting {
    public static void main(String[] args) {

        // en una año ubicar 30 perritos
        // cuantos perritos ubique al mes
        // manera 1

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //manera 2
        double mesesPerritos = 30.0;
        System.out.println(mesesPerritos/12.0);

        // manera 3
        double mesesperritos = 30.0;
        mesesperritos = mesesperritos / 12.0;
        System.out.println(mesesperritos);

        // Estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        // Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double)a/b);
// clase de casteo entre tipos de datos

        double c1 = a/b;
        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);


    }
}
