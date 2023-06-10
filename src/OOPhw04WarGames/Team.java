package OOPhw04WarGames;

import OOPhw04WarGames.warriors.Archer;
import OOPhw04WarGames.warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// команда, куда мы складываем только типы объектов, наследуемые от класса Warrior
public class Team<T extends Warrior> implements Iterable<T> {
    private List<T> team = new ArrayList<>();

    public void add(T typeOfWarrior){
        team.add(typeOfWarrior);
    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }

    public int getTeamHealth(){
        int teamHealth = 0;
        for (T t: this) {
            teamHealth += t.getHealthPoint();
        }
        return teamHealth;
    }

    public int getTeamDamage(){
        int teamDamage = 0;
        for (T war: this) {
            teamDamage += war.getWeapon().damage(); // нельзя ставить хит, т.к. там рандом.
        }                                           // сначала обращаемся к конкретному оружию, и берем его урон.
        return teamDamage;
    }

    public int getTeamAttackDistance(){
        int maxTeamAttackDistance = 0;
        for (T t: this){
            if (!(t instanceof Archer)){
                continue;
            }
            int currentDistance = ((Archer)t).dinstance();
            if (maxTeamAttackDistance < currentDistance);
            maxTeamAttackDistance = currentDistance;
        }
        return maxTeamAttackDistance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Our team: \n");
        for (T t : this) {
            sb.append(t).append("\n");
        }
        sb.append(String.format("Team damage: %s.\n", getTeamDamage()))
                .append(String.format("Team distance: %d.\n", getTeamAttackDistance()))
                .append(String.format("Team health: %d.\n", getTeamHealth()));
        return sb.toString();
    }
}