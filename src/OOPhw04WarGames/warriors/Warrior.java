package OOPhw04WarGames.warriors;

import OOPhw04WarGames.weapons.Weapon;
import java.util.Random;

public abstract class Warrior<W extends Weapon> {
    private final String name; //final - если мы не планируем его менять
    private int healthPoint;
    private W weapon;

    public Warrior(String name, int healthPoint, W weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }
    public W getWeapon() {
        return weapon;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public int hit(){ //наносит урон воин
        Random rand = new Random();
        int hitDamage = rand.nextInt(0, weapon.damage() + 1);
        return hitDamage;
    }
    public void reduceHealth(int damage){ // у другого уменьшается здоровье
        healthPoint -= damage;
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Hp: %d, Weapon: %s", name, healthPoint, weapon);
    }
}
