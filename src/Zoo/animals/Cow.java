package Zoo.animals;

import Zoo.runSpeed;
import Zoo.animals.base.Herbivores;

public class Cow extends Herbivores implements runSpeed {
    public Cow (String name){
        super(name);
    }

    @Override
    public String sound(){
        return "Moo";
    }

    @Override
    public String toString(){
        return String.format("Cow: %s", super.toString());
    }

    @Override
    public int getRunSpeed(){
        return 40;
    }
}
