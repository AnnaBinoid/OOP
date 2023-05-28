package CoffeeMachine;

public class Main {
    /*Создать торговый кофейный автомат,
    напитки в автомате должны содержать следующие данные: наименование, объем, температура, цена.
    Проинициализировать несколько напитков в классе main и торговый автомат,
    воспроизвести логику продажи напитков.
    Сделать согласно принципам ООП, пройденным на семинаре.
     */
    public static void main(String[] args) {
        CoffeeMachine apparat = new CoffeeMachine();
        apparat.addCoffee(new Coffee("Эспрессо", 150, 50, 90))
                .addCoffee(new CoffeeWithMilk("Латте", 350,150, 90,
                        true, "ваниль"))
                .addCoffee(new CoffeeWithSupplements("Коричный моккиато", 200, 80,
                        90, "коричный порошок, какао"))
                .addCoffee(new Coffee("Не кофе", 100, 30, 50 ))
                .addCoffee(new CoffeeWithMilk("Капучино", 200, 75, 80,
                        false, null));

        System.out.println(apparat);
        Coffee coffee = apparat.saleCoffee("Латте");
        apparat.withSugar(23);
        System.out.println(apparat);
        Coffee coffee1 = apparat.saleCoffee("Капучино");
        apparat.withSugar(3);
        System.out.println(apparat);
        Coffee coffee3 = apparat.saleCoffee("Не кофе");
        apparat.withSugar(0);
        System.out.println(apparat);

    }
}
