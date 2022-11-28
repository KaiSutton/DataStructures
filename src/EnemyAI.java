


public abstract class EnemyAI {

    int health = 100;
    int level = 1;

    public EnemyAI(int health, int level){
        this.health = health;
        this.level = level;
    }

    protected abstract void attack();

    protected abstract void takeDamage();

    protected void playVoiceLine(){
        System.out.println("You never shoulda come here!");
    }

}
