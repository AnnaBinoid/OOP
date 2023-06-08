package Lection03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Personal implements Iterable<User>{

    private List<User> users = new ArrayList<>();
//анонимный класс здесь будет
    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < users.size();
            }

            @Override
            public User next() {
                return users.get(index++);
            }
        };
    }

    public Personal addUser(User user){
        users.add(user);
        return this;
    }
//Сейчас мы вернем лист наших юзеров
    public List<User> toList(){
        List<User> results = new ArrayList<>();
        for (User users: this) {
            results.add(users);
        }
        return results;
    }

/*    private class PersonalIterator implements Iterator<User>{

        int index = 0;

        @Override
        public boolean hasNext() {
            return  (index < users.size());
        }

        @Override
        public User next() {
            User user = users.get(index);
            index++;
            return user;
        }
    }*/
}
