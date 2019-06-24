package nl.hanze.algoritmiek;

public class Algorithmiek {

    public static int faculteit(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * faculteit(n - 1);
        }
    }


    public static int ggd(int a, int b) {

        if (a % b == 0) {
            return b;
        } else {
            return ggd(b, a % b);
        }
    }


    public static int kgv(int a, int b) {

        int result = (a*b)/ggd(a,b);

        return result;
    }
}
