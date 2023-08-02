public class CalculatorMain {
    public static void main(String[] args) {

        // Первый принцип SOLID - принцип единственной ответственности

        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        String operation = view.getOperation();
        int num1 = view.getOperand();
        int num2 = view.getOperand();

        controller.perfomeOperation(operation, num1, num2);
    }
}