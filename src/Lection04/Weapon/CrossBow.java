package Lection04.Weapon;

public class CrossBow implements Ranged{
    @Override
    public int distance() {
        return 10;
    }

    @Override
    public int damage() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("CrossBow: %d", damage());
    }
}
