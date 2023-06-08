package Lection02;

public class Foo {
    public Integer value;

    private static Integer count;

    public static Integer getCount(){
                      // static работает через имя типа,
        return count; // поэтому нет this и super, тк нет иерархии.
    }

    static {
        count = 0; // так правильно присваивать значение
    }

    public Foo(){
        count ++;
    }

    public void printCount(){
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
