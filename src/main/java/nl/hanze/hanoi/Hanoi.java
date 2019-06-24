package nl.hanze.hanoi;

public class Hanoi {


    public void hanoi(int aantal) {

        this.hanoi(aantal, 1, 2, 3);

    }

    private void hanoi(int aantal, int paal1, int paal2, int paal3) {
        if (aantal == 0) {
            return;
        }
        hanoi(aantal - 1, paal1, paal3, paal2);
        System.out.println("Move " + paal1 + " naar " + paal3);
        hanoi(aantal - 1, paal2, paal1, paal3);
    }
}
