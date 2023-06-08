package Lection03;

import java.util.Collections;
import java.util.List;

public class MainLect {

    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Ivan", "Ivanov", 25))
                .addUser(new User("Fido", "Juh", 1))
                .addUser(new User("Vova", "Petin", 13))
                .addUser(new User("Nikolay", "Sidorov", 22))
                .addUser(new User("Nikolay", "Sidorov", 82));


        for (User user : personal){
            System.out.println(user);
        }
//принимаем лист юзеров
        List<User> users = personal.toList();
        System.out.println("\n");
//сортируем коллекцию
        Collections.sort(users);
        for (User user : personal){
            System.out.println(user);
        }

/*        User bigBoss = new User("Big", "Boss", 40);
        bigBoss.setPersonal(personal);
        User littleBoss = new User("Little", "Boss", 50);
        personal.addUser(littleBoss);
        littleBoss.setPersonal(new Personal()
                .addUser(new User("Small", "Boss", 20)));
        System.out.println("+++++++++++++++++++");
        Company company = new Company(bigBoss);
        for (User user: company){
            System.out.println(user);
        }
        */
    }

}
