package CoffeeMachine;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Coffee> coffeeMachine = new ArrayList<>();
    private double cash = 0;
    private int shugarPortion = 100;

    public double getCash() {
        return cash;
    }

    public List<Coffee> getCoffeeMachine() {
        return coffeeMachine;
    }

    public CoffeeMachine addCoffee(Coffee prod) {
        coffeeMachine.add(prod);
        return this;
    }

    public Coffee findCoffee(String name){
        for (Coffee coffee:coffeeMachine) {
            if (name.equals(coffee.getCoffeeName())){
                return coffee;
            }
        }
        return null;
    }

    public void whatWasSold (String name){
        String result = String.format("Продано: %s", name);
        System.out.println(result);
    }

    public Coffee saleCoffee(String name){
        Coffee founded = findCoffee(name);
        if (founded != null){
            cash = cash + founded.getCoffeePrice();
            coffeeMachine.remove(founded);
            whatWasSold(name);
        }
        return founded;

    }

    public int withSugar (int countSugar){
        shugarPortion = shugarPortion - countSugar;
        System.out.println("Добавлено порций сахара: " + countSugar);
        System.out.println("Осталось: " + shugarPortion + " порций сахара.");
        return shugarPortion;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        builder.append("Сальдо: ").append(cash).append(" руб.").append("\n");
        for (Coffee coffee:coffeeMachine) {
            builder.append(i).append(") ").append(coffee);
            i++;
        }
        return builder.toString();
    }
}
