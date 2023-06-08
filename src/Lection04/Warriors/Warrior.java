/*
package Lection04.Warriors;

import Lection04.Weapon.Weapon;

import java.util.Random;*/

/*public abstract class Warrior<W extends Weapon> {
    private  String name;
    private int healthPoint;
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Warrior(String name, int healthPoint, Weapon weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public Weapon W getWeapon() {
        return weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int hit(){
        Random rnd = new Random();
        int hitDamage = rnd.nextInt(0, weapon.damage() + 1);

        return hitDamage;
    }

    public void rediceHealth(int damage){
        healthPoint -= damage;
        if (healthPoint < 0){
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s" +
                ", HP: %d", name, weapon, healthPoint );
    }
}
*/