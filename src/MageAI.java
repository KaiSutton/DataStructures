public class MageAI extends EnemyAI{

    public MageAI(int health, int level) {
        super(health, level);
    }

    @Override
    protected void attack() {
        System.out.println("Mage AI hits you wit a stick");
    }

    @Override
    protected void takeDamage() {
        System.out.println("Made AI dodges your attack");
    }

    @Override
    protected void playVoiceLine() {
        System.out.println("Mmmm mage");
    }
}
