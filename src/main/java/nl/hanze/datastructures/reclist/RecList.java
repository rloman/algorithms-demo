package nl.hanze.datastructures.reclist;

public class RecList {

    private Integer head;
    private RecList tail;

    public void add(int n) {
        if (this.head == null) {
            this.head = n;
            this.tail = new RecList();
        } else {
            this.tail.add(n);
        }
    }

    public void print() {
        if (this.head != null) {
            System.out.print(this.head + ", ");
            this.tail.print();
        }
    }

    public int size() {
        if (head == null) {

            return 0;
        } else {
            return 1 + this.tail.size();
        }
    }
}
