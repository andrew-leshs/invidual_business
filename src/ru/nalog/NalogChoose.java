package ru.nalog;

public class NalogChoose {
    public static int nalogEarn(int earnings) {
        return (earnings / 100) * 6;
    }

    public static int nalogEarnSpend(int earnings, int spendings) {
        int temp = earnings - spendings;
        int nalog;
        if (temp < 0) {
            return 0;
        } else {
            nalog = (temp / 100) * 15;
        }

        return nalog;
    }

    public static void chooseNalog(int earnings, int spendings) {
        if (nalogEarn(earnings) > nalogEarnSpend(earnings, spendings)) {
            System.out.println("Вам подходит налог доходы минус расходы (15%)");
            System.out.println("Ваш налог составит: " + nalogEarnSpend(earnings, spendings) +" рублей");
            System.out.println("Налог на другой системе составит: " + nalogEarn(earnings) +" рублей");
            System.out.println("Экономия: " + (nalogEarn(earnings) - nalogEarnSpend(earnings, spendings)));

        } else {
            System.out.println("Вам подходит налог доходы (6%)");
            System.out.println("Ваш налог составит: " + nalogEarn(earnings) +" рублей");
            System.out.println("Налог на другой системе составит: " + nalogEarnSpend(earnings, spendings) +" рублей");
            System.out.println("Экономия: " + (nalogEarnSpend(earnings, spendings) - nalogEarn(earnings)));

        }
    }
}
