package OOP_HW02_Aquarium;

import OOP_HW02_Aquarium.Residents.*;
import OOP_HW02_Aquarium.Residents.Base.AquaResidents;

public class Main {
    public static void main(String[] args) {
        Water water = new Water();
        NinjaTurtle don = new NinjaTurtle("Ninja-turtle", "Donatello", "purple",
                "Bo Stick", "foot-turntable");
        Turtle leo = new Turtle("turtle", "Leonardo");
        AquaMan triton = new AquaMan("seaMan", "Triton");
        Piranha piranha = new Piranha("piranha", "Sweety");
        ClownFish clown = new ClownFish("clownFish", "Nemo");

        Aqarium aqua = new Aqarium();
        aqua.addAquaResidents(don).addAquaResidents(leo).addAquaResidents(triton)
                .addAquaResidents(piranha).addAquaResidents(clown);

        System.out.println(aqua);
        System.out.println("\n *** And now be quiet to listen the sounds оf aquarium: *** ");
        System.out.println(aqua.getAquaSound());


        System.out.println("\n *** Fishguzzlers: *** ");
        for (EatingFish fishers : aqua.ateFishes()) {
            System.out.println(fishers);
        }

        System.out.println("\n *** A-a-and ... our Main Guzzler is ... /drum roll/: ... *** ");
        System.out.println(aqua.getMainGuzzler(aqua.ateFishes()));
        System.out.println(String.format(" He ate %d fishes!", aqua.getMainGuzzler(aqua.ateFishes()).eatedFishes()));

        System.out.println("\n *** This are our Heroes: *** ");
        for (HitingSuperCombo hero : aqua.heroes()) {
            System.out.println(hero.hitingSuperCombo());
        }

        System.out.println("\n *** And the most Heroic Hero is ... /drum roll/: ... ***");
        System.out.print(aqua.getSuperChamp(aqua.heroes()));
        System.out.println(String.format(" Strength of his combo is: %d."
                , aqua.getSuperChamp(aqua.heroes()).getComboStrength()));

    }
}
