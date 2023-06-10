package OOPhw04WarGames;

import OOPhw04WarGames.warriors.Archer;
import OOPhw04WarGames.warriors.Infantry;
import OOPhw04WarGames.warriors.Warrior;
import OOPhw04WarGames.weapons.meleeWeapon.Axe;
import OOPhw04WarGames.weapons.meleeWeapon.Sword;
import OOPhw04WarGames.weapons.rangedWeapon.Bow;
import OOPhw04WarGames.weapons.rangedWeapon.CrossBow;

public class MainWarGames {
    public static void main(String[] args) {
        Warrior infantry = new Infantry("Rob", 80, new Sword());
        Infantry axeInfantry = new Infantry("Bob", 85, new Axe());
        Infantry swordInfantry = new Infantry("Zob", 90, new Sword());
        Archer archer = new Archer("Rod", 30, new Bow());
        Archer bowArcher = new Archer("Bod", 31, new Bow());
        Archer crossBowArcher = new Archer("Zod", 50, new CrossBow());

        Team<Warrior> team1 = new Team();
        team1.add(infantry);
        team1.add(archer);
        team1.add(new Infantry("Who", 150, new Axe()));

        Team<Archer> archers = new Team<>();
        archers.add(bowArcher);
        archers.add(crossBowArcher);
        archers.add(new Archer("Nod", 45, new CrossBow()));

        Team<Infantry> infantries = new Team<>();
        infantries.add(axeInfantry);
        infantries.add(swordInfantry);
        infantries.add(new Infantry("Nob", 90, new Axe()));

        System.out.println(team1);
        System.out.println("*************************");
        System.out.println(archers);
        System.out.println("*************************");
        System.out.println(infantries);
        System.out.println("*************************");

    }
}
