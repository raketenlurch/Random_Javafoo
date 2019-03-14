public class Schaltjahr {
    public static void main(String[] args) {
        int jahr = Integer.parseInt(args[0]);

        if (args.length < 1 || args.length > 1) {
            System.out.println("ERROR! Das Programm benötigt genau einen Parameter.");
        } else {
            /* 1. Ein Jahr ist eine Schaltjahr, wenn es restlos durch 4 teilbar ist.
            *  2. Falls sich die Jahreszahl durch 100 restlos teilen lässte, ist es kein Schaltjahr.
            *  3. Falls auch eine Teilung durch 400 ganzzahlig möglich ist, dann ist es ein Schaltjahr.*/
            if (jahr%4 == 0) {
                System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr.");
            } else if (jahr%100 == 0 && jahr%400 == 0) {
                System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr.");
            } else if (jahr%100 == 0) {
                System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr.");
            } else {
                System.out.println("ERROR.");
            }
        }
    }
}
