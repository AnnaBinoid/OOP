package Zoo.animals;

import Zoo.runSpeed;
import Zoo.animals.base.Predator;

public class Bear extends Predator implements runSpeed {
    public Bear (String name) {
        super(name);
    }

    @Override
    public String sound(){
        return "Roarr";
    }

    @Override
    public String toString(){
        return String.format("Bear: %s", super.toString());
    }

    @Override
    public int getRunSpeed(){
        return 10;
    }
}
