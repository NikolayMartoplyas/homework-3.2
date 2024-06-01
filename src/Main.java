//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(1.95,105);
        System.out.println("Ваш индекс мыссы тела " + index);
        }
    }