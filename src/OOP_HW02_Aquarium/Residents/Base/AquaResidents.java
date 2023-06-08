package OOP_HW02_Aquarium.Residents.Base;

import OOP_HW02_Aquarium.AquaSoundAble;


public abstract class AquaResidents implements AquaSoundAble {

    private String type;
    private String name;

    public AquaResidents(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("- Oh, look! This is %s %s!", type, name);
    }
}
