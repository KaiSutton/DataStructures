


public class MeleeAI extends EnemyAI{


    public MeleeAI(int health, int level) {
        super(health, level);
    }

    @Override
    protected void attack() {
        System.out.println("Melee AI swings his sword.");
    }

    @Override
    protected void takeDamage() {
        System.out.println("Melee Ai cries");
    }


}
