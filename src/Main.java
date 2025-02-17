public class Main {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

        //1
        System.out.println("Задача 1:");
        int cost[] = {123, 456, 789, 321, 345};
        int sumCost = 0;
        for (int i = 0; i < cost.length; i++) {
            sumCost = sumCost + cost[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumCost + " рублей");
        System.out.println();

        //2
        System.out.println("Задача 2:");
        int trata[] = {1234, 2143, 4325, 53234, 6546};
        int min = trata[0];
        int max = min;
        // минимум
        for (int i = 0; i < trata.length; i++) {
            if (trata[i] < min) {
                min = trata[i];
            }
        }
        //максимум
        for (int i = 0; i < trata.length; i++) {
            if (trata[i] > max) {
                max = trata[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();

        //3
        System.out.println("Задача 3:");
        int arrSred[] = {123, 456, 789, 1234, 2345};
        double sum = 0;
        double x;
        double size = arrSred.length;
        for (int i = 0; i < arrSred.length; i++) {
            sum += arrSred[i];
        }
        x = sum / size;
        System.out.println("Средняя сумма трат за месяц составила " + x + " рублей");
        System.out.println();

        //4
        System.out.println("Задача 4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

    }
}