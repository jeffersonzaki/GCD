import javax.swing.*;

//Euclid's Algorithm
public class GCD {

    public static String output = "";

    public static long gcd(int a, int b){
        while(b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }




    // * Main Method * //
    public static void main(String[] args) {

        //while(true) means infinity
        while (true) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Numerator e.g. 70"));
            int denom = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Denominator e.g. 120"));

            long GCD = gcd(num, denom);
            output += "\nGCD ( " + num + " , " + denom + " ) = " + GCD;
            JOptionPane.showMessageDialog(null, output);
        }
    }

}
