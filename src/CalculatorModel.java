public class CalculatorModel implements IModel {
    private int result;

    @Override
    public void add(int num1, int num2) {
        result = num1 + num2;
    }

    @Override
    public void subtract(int num1, int num2) {
        result = num1 - num2;
    }

    @Override
    public void divide(int num1, int num2) {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            // Обработка деления на ноль
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
    }

    @Override
    public void multiply(int num1, int num2) {
        result = num1 * num2;
    }

    @Override
    public int getResult() {
        return result;
    }
}