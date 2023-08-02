import java.util.Scanner;

public class CalculatorView implements IView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void displayResult(int result) {
        System.out.println("Результат: " + result);
    }

    @Override
    public String getOperation() {
        System.out.println("Введите опeрацию:(+,-,*,/)");
        return scanner.nextLine();
    }
    @Override
    public int getOperand(){
        System.out.println("Введите число: ");
        return Integer.parseInt(scanner.nextLine());// Получаем строку и преобразуем в целое число.
    }
}