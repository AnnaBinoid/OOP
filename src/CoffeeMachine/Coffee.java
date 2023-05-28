package CoffeeMachine;

public class Coffee {
    private String coffeeName;
    private int coffeeVolume;
    private double coffeePrice;
    private int coffeeTemperature;

    public String getCoffeeName() {
        return coffeeName;
    }

    public int getCoffeeVolume() {
        return coffeeVolume;
    }

    public double getCoffeePrice() {
        return coffeePrice;
    }

    public int getCoffeeTemperature() {
        return coffeeTemperature;
    }

    @Override
    public String toString() {
        return String.format("%s, объём: %d мл, температура: %d ℃, цена: %.2f руб\n"
                ,coffeeName, coffeeVolume, coffeeTemperature,  coffeePrice);
    }

    public Coffee(String coffeeName, int coffeeVolume, double coffeePrice, int coffeeTemperature){
        this.coffeeName = coffeeName;
        this.coffeeVolume = coffeeVolume;
        this.coffeeTemperature = coffeeTemperature;
        this.coffeePrice = coffeePrice;
    }
}
