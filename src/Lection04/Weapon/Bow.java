package Lection04.Weapon;

public class Bow implements Ranged {
    @Override
    public int distance() {
        return 20;
    }

    @Override
    public int damage() {
        return 8;
    }

    @Override
    public String toString() {
        return String.format("Bows: %d", damage());
    }
}
