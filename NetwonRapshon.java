package netwonrapshon;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Scanner;

public class NetwonRapshon {

    public static void main(String[] args) {

        ArrayList a = new ArrayList();

        double x = 1.5;

        for (int i = 0; i < 6; i++) {

            double fx = (x * x * x) - (x) - 1;

            double f1x = 3 * (x * x) - 1;

            a.add(x - ((fx) / (f1x)));

            x = (double) a.get(i);

        }

        for (int i = 0; i < a.size(); i++) {
            System.out.println("Root " + a.get(i));
        }

        for (int i = 0; i < a.size() - 1; i++) {
            double ea = (abs((double) a.get(i + 1) - (double) a.get(i)) / (double) a.get(i + 1)) * 100;
            System.out.println("Error " + ea);
        }

    }
}
