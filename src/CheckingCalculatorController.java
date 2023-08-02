public class CheckingCalculatorController extends CalculatorController {
    public CheckingCalculatorController(IModel model, IView view) {
        super(model, view);
    }

    @Override
    public void perfomeOperation(String operation, int num1, int num2) {
        try {
            super.perfomeOperation(operation, num1, num2);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
