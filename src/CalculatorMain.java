public class CalculatorMain {
    public static void main(String[] args) {

        // ПЕРВЫЙ ПРИНЦИП SOLID - принцип единственной ответственности.
        // В данном случае больше всего методов в классе модели - пять.
        // Я не уверен, что есть смысл разделять их по отдельным классам
        // вроде Adder, Subtractor, Multiplexer и Divider

        // ВТОРОЙ ПРИНЦИП SOLID - Принцип открытости/закрытости
        // Для реализации этого принципа сделан класс CheckingCalculatorController
        // При его реализации текст базового класса CalculatorController не затрагивался

        // ТРЕТИЙ ПРИНЦИП SOLID - принцип подстановки Лисков
        // В данном коде можно в качестве контроллера использовать как CheckingCalculatorController,
        // так и базовый класс CalculatorController. Функциональность не нарушается

        // ЧЕТВЕРТЫЙ ПРИНЦИП SOLID - принцип разделения интерфейсов
        // В соответствии с ним можно для модели сделать несколько отдельных интерфейсов.
        // Я сделал IAdder, ISubtractor, IMultiplier, IDivider

        // ПЯТЫЙ ПРИНЦИП SOLID - принцип инверсии зависимостей.
        // В соответствии с ним создаем отдельные интерфейсы для контроллера, представления и модели.

        IModel model = new CalculatorModel();
        IView view = new CalculatorView();
        IController controller = new CalculatorController(model, view);

        String operation = view.getOperation();
        int num1 = view.getOperand();
        int num2 = view.getOperand();

        controller.perfomeOperation(operation, num1, num2);
    }
}