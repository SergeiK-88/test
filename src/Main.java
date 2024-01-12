import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первый операнд");
        int operand1 = scanner.nextInt();
        System.out.println("Операция");
        char operation = scanner.next().charAt(0);
        System.out.println("Второй операнд");
        int operand2 = scanner.nextInt();

        switch (operation) {
            case '+':
                System.out.println("Сумма:" + (operand1 + operand2));
                break;
            case '-':
                System.out.println("Разность:" + (operand1 - operand2));
                break;
            case '*':
                System.out.println("Произведение:" + (operand1 * operand2));
                break;
            case '/':
                System.out.println("Частное:" + (operand1 / operand2));
                break;
            default:
                System.out.println("Неподдерживаемая операция");


        }

    }
}
