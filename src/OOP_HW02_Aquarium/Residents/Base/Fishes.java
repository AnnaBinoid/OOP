package OOP_HW02_Aquarium.Residents.Base;

import OOP_HW02_Aquarium.Residents.Base.AquaResidents;

public abstract class Fishes extends AquaResidents {


    public Fishes(String type, String name) {
        super(type, name);
    }

    @Override
    public String feed() {
        return "Fish food.";
    }

    @Override
    public String sound() {
        return "Fish says:\t\t Blop-blop";
    }

}
