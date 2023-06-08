package Lection05.SumOfNumbers;
// работает с моделью и представлением. Здесь программируем объединяющую кнопку.
public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v){
        model = m;
        view = v;
    }

    public void buttonClick() {
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setFirst(a);
        model.setSecond(b);
        int sum = model.sum();
        view.print(sum, "Sum: ");

    }
}
