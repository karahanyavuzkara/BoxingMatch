public class Main {

    public static void main(String[] args) {

        Fighter marc = new Fighter("ANDREW TATE" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("LOGAN PAUL" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();


    }
}