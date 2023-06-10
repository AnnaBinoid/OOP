package OOPhw04WarGames.warriors;

import OOPhw04WarGames.weapons.meleeWeapon.Melee;

public class Infantry extends Warrior<Melee>{
    public Infantry(String name, int healthPoint, Melee weapon) {
        super(name, healthPoint, weapon);
    }

    @Override
    public String toString() {
        return String.format("Infantry: %s",super.toString());
    }
}
