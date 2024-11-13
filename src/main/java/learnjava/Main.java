package learnjava;

public class Main {
    public static void tricky(Point arg1, Point arg2) {
        arg1.setX(100);
        arg1.setY(100);
        Point temp = arg1;
        arg1 = arg2;
        arg2 = temp;
        arg1.printPoint();
        arg2.printPoint();
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        Point pnt1 = new Point(0, 0);
        Point pnt2 = new Point(0, 0);
        pnt1.printPoint();
        pnt2.printPoint();
        System.out.println();
        tricky(pnt1, pnt2);
        pnt1.printPoint();
        pnt2.printPoint();
    }
}
