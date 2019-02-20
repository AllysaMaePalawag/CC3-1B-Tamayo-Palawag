package rpgg;

public class TestCharacter {

    /**
     *
     */
    public static void fight() {
        
        Character a = new Character("A", 15, 15, 15);
        Character b = new Character("B", 15, 15, 15);

        int abc = 1;

        while (a.getCurrentLife() > 0 && b.getCurrentLife() > 0) {

            int dam = a.attack();
            int dama = b.attack();
            

            System.out.println(" Round " + abc + " ");
            System.out.println(a.getName() + " : " + a.getCurrentLife());
            System.out.println(b.getName() + " : " + b.getCurrentLife());
            System.out.println(a.getName() + " attacks " + b.getName() + " with damage " + dam);
            b.wound(dam);
            System.out.println(b.getName() + " attacks " + a.getName() + " with damage " + dama);
            a.wound(dama);
            ++abc;
        }

        if (a.getCurrentLife() < b.getCurrentLife()) {
            System.out.println(b.getName()+ " wins!");
        } else if (b.getCurrentLife() < a.getCurrentLife()) {
            System.out.println(a.getName() + " wins!");
        } else if (a.getCurrentLife() == b.getCurrentLife()) {
            System.out.println("Draw!");
        }

    }

}
