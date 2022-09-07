package pl.klemi;

public class Main {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int delta;

        /*switch (delta)
        case 1:
        case 2:
        default:
        */


    }

    public static int countDelta(int a, int b, int c) {
        return b*b+4*a*c;
    }
    public static int root1(int a, int b, int delta) {
        return (-b-((int)Math.sqrt(delta)))/2*a;
    }

    public static int root2(int a, int b, int delta) {
        return (-b+((int)Math.sqrt(delta)))/2*a;
    }
}
