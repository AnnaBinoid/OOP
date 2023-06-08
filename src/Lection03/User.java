package Lection03;

import java.util.List;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private int age;
    private Personal personal;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

/*
    public void setPersonal (Personal personal){
        this.personal = personal;
    }
    public Personal getPersonal(){
        return personal;
    }
*/

    public String toString(){
        return String.format("firstname: %s, lastname: %s, " +
                "age: %d", firstName, lastName, age);
    }
    // Compare to - сравнивает. Если текущий объект < о -1; если равны = 0; если больше = положительное
    // работает только на списках, соответственно, в персонале надо юзерс отправить в лист.
    @Override
    public int compareTo(User o) {
        int firstCompareTo = this.firstName.compareTo(o.firstName);
        if (firstCompareTo != 0) {return firstCompareTo;}
        int secondCompareTo = this.lastName.compareTo(o.lastName);
        if (secondCompareTo !=0) {return secondCompareTo;}
        return this.age - o.age;
    }
}
