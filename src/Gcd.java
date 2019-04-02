public class Gcd {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (args.length < 2 || args.length > 2) {
            System.out.println("ERROR!");
        } else {
            int h = 0;
            if (a == 0) {
                System.out.println(a);
            } else if (b == 0) {
                System.out.print(b);
            } else {
                do {
                    h = a % b;
                    a = b;
                    b = h;
                } while (b != 0);
                System.out.println(a);
            }
        }
    }
}
