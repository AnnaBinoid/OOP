package Zoo.zoo;

import Zoo.animals.base.Animal;

import java.util.ArrayList;
import java.util.List;

/*public class Zoo {
    private Radio radio = new Radio();
    private List<Animal> zoo = new ArrayList<>();

    public Zoo addAnimal(Animal someAnimal){
        zoo.add(someAnimal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("In our zoo: \n");
        for (Animal animal : zoo) {
            builder.append(animal).append("\n");
        }
        return builder.toString();
    }
    private List<SoundAble> getSoundable(){
        List<SoundAble> result = new ArrayList<>(zoo);
        result.add(radio);
        return result;
    }
    public String getSound(){
        StringBuilder builder = new StringBuilder();
        for (SoundAble soundable : getSoundable()) {
            builder.append(soundable)
                    .append("\n");
        }
        return builder.toString();
    }

    private  List<Zoo.RunSpeed> runners(){
        List<Zoo.RunSpeed> runners = new ArrayList<>();
        for (Animal animal : zoo) {
            if (animal instanceof Zoo.RunSpeed) {
                runners.add((Zoo.RunSpeed) animal);
            }

        }
        return runners;
    }

    public RunSpeed getRunnerChampion(){
        List<RunSpeed> runners = runners();
        RunSpeed champ = runners.get(0);
        for (RunSpeed runner: runners) {
            if (champ.getRunSpeed() < runner.getRunSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }

    public Lis<Zoo.FlySpeed> flyers() {
        List<Zoo.FlySpeed> flyers = new ArrayList<>();
        for (Animal animal: zoo) {
            if (animal instanceof Zoo.FlySpeed) {
                flyers.add((Zoo.FlySpeed) animal);
            }
        }
        return flyers;
    }
}*/
