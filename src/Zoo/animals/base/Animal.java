package Zoo.animals.base;

import Zoo.zoo.SoundAble;

public abstract class Animal implements SoundAble {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String sound();

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Имя = %s. Кормим - %s.", name, feed());
    }
}
