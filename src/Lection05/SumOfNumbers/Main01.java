package Lection05.SumOfNumbers;

import Lection05.SumOfNumbers.Presenter;
import Lection05.SumOfNumbers.SumModel;
import Lection05.SumOfNumbers.View;

public class Main01 {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new SumModel(),new View());
        presenter.buttonClick();
        presenter.buttonClick();



    }
}
