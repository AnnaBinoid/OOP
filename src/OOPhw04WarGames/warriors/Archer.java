package OOPhw04WarGames.warriors;

import OOPhw04WarGames.weapons.rangedWeapon.Range;

public class Archer extends Warrior<Range>{
    public Archer(String name, int healthPoint, Range weapon) {
        super(name, healthPoint, weapon);
    }

    public int dinstance(){
        return (super.getWeapon()).distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d", super.toString(), dinstance());
    }
}
