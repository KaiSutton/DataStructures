public class RangedAI extends EnemyAI{


    public RangedAI(int health, int level) {
        super(health, level);
    }

    @Override
    protected void attack() {
        System.out.println("Ranged AI shoots at you");
    }

    @Override
    protected void takeDamage() {
        System.out.println("Ranged AI takes damage");
    }
}
