import java.util.Scanner;
import ru.nalog.NalogChoose;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static int earnings = 0;
    public static int spendings = 0;
    public static void printDelim() {
        System.out.println("Выберите операцию и введите её номер:\n" +
                "1. Добавить новый доход\n" +
                "2. Добавить новый расход\n" +
                "3. Выбрать ситему налогооблажения >>");

    }


    public static void main(String[] args) {


        while (true) {
            printDelim();
            String chooseNumber = scanner.nextLine();

            if ("end".equals(chooseNumber)) {
                System.out.println("Программа завершена. Спасибо за использование нашего софта :)");
                break;
            }

            switch (Integer.parseInt(chooseNumber)) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = scanner.nextLine();
                    int earn = Integer.parseInt(moneyStr);
                    earnings += earn;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String strSpend = scanner.nextLine();
                    int spend = Integer.parseInt(strSpend);
                    spendings += spend;
                    break;
                case 3:
                    NalogChoose.chooseNalog(earnings, spendings);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
    }
}
