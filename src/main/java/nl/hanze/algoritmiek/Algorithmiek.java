package nl.hanze.algoritmiek;

public class Algorithmiek {

    public static int faculteit(int n) {

        if(n==0) {
            return 1;
        }

        else {
            return n * faculteit(n-1);
        }
    }
}
