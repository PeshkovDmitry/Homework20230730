public class CalculatorController implements IController {
    private IView view;
    private IModel model;

    public CalculatorController(IModel model, IView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void perfomeOperation(String operation, int num1, int num2) {
        switch (operation) {
            case "+":
                model.add(num1, num2);
                break;
            case "-":
                model.subtract(num1, num2);
                break;
            case "*":
                model.multiply(num1, num2);
                break;
            case "/":
                model.divide(num1, num2);
                break;
            default:
                System.out.println("Некорректная операция!");
        }
        view.displayResult(model.getResult());
    }
}