package Lection04.Weapon;

public class Axe implements Melee {
    @Override
    public int damage() {
        return 7;
    }

    @Override
    public String toString() {
        return String.format("Axe: %d", damage());
    }
}
