


public class Match implements Consumable, Flamable, Visible{
    @Override
    public void consume() {
        System.out.println("you consumed it");
    }

    @Override
    public void gain() {
        System.out.println("You got another one");
    }

    @Override
    public void lightFire() {
        System.out.println("it fire");
    }

    @Override
    public void putOut() {
        System.out.println("it no longer fire");
    }

    @Override
    public void see() {
        System.out.println("you see it");
    }

    @Override
    public void observe() {
        System.out.println("you see it but more");
    }
}
