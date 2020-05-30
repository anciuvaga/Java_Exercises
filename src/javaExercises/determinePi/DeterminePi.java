package javaExercises.determinePi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class DeterminePi {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of terms: ");
        int n = Integer.parseInt(reader.readLine());

        /*
         * pi = 3 + 4/(2 * 3 * 4) - 4/(4 * 5 * 6) + 4/(6 * 8 * 10) ...
         */
        BigDecimal pi = new BigDecimal(3.0);
        ;
        double lastNr = 2;
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                pi = pi.add(new BigDecimal(String.valueOf((double) 4 / ((lastNr) * (lastNr + 1) * (lastNr + 2)))));
            } else {
                pi = pi.subtract(new BigDecimal(String.valueOf((double) 4 / ((lastNr) * (lastNr + 1) * (lastNr + 2)))));
            }
            lastNr += 2;
        }
        System.out.println(pi);
    }
}
