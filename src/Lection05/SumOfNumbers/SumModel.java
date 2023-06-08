package Lection05.SumOfNumbers;
// от абстрактного класса наследуем класс суммы двух чисел, переопределяем методы интерфейса
public class SumModel extends CalcModel {
    @Override
    public int sum() {
        return x + y;
    }

    @Override
    public void setFirst(int value) {
        super.x = value;
    }

    @Override
    public void setSecond(int value) {
        super.y = value;
    }
}
