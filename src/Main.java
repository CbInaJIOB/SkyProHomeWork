public class Main {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

        // Cycles_2(HW7)
        //1
        System.out.println("Задача 1:");
        int sal = 15000;
        int end = 2459000;
        int tot = 0;
        int i = 1;
        while (tot <= end){
            tot = tot + sal;
            System.out.println("Месяц " + (i) + ", сумма накоплений равна " + tot + " рублей");
            i++;
        }
        System.out.println();// пустая строка для разделения заданий

        //2.1
        System.out.println("Задача 2:");
        int number = 1;
        while (number <= 10){
            if (number <10){
                System.out.print(number +" ");
            } else {
                System.out.println(number);
            }
            number++;
        }
        //2.2
        for(number = 10; number > 0; number--){
            System.out.print(number + " ");
        }
        System.out.println();// пустая строка для разделения заданий
        System.out.println();// пустая строка для разделения заданий

        //3
        System.out.println("Задача 3:");
        int country = 12000000;
        int year = 1;
        int rozdaemost = 17;
        int smertnost = 8;
        int chisl = 1000;
        int sred = rozdaemost - smertnost;// на 1000 человек
        int x;
        for(; year <= 10; year++){
            x = country / chisl * sred;
            country = country + x;
            System.out.println("Год " + year + ", численность населения составляет " + country);
        }
        System.out.println();// пустая строка для разделения заданий

        //4
        System.out.println("Задача 4:");
        int first = 15000;
        int result = 0;
        for (int mount = 1; result <= 12000000; mount++){

            int n = first * 7 / 100;// процент прибавления
            first = first + n;
            result = result + first;
            System.out.println("Месяц " + mount + " результат накоплений "+ result);
        }
        System.out.println();// пустая строка для разделения заданий

        //5
        System.out.println("Задача 5:");
        int first1 = 15000;
        int result1 = 0;
        for (int mount1 = 1; result1 <= 12000000; mount1++){
            int n = first1 * 7 / 100;// процент прибавления
            first1 = first1 + n;
            result1 = result1 + first1;
            if (mount1 % 6 == 0) {
                System.out.println("Месяц " + mount1 + " результат накоплений " + result1);
            } else {
                continue; // можно и без else
            }
        }
        System.out.println();// пустая строка для разделения заданий

        // 6
        System.out.println("Задача 6:");
        int vklad = 15000;
        int mountTotal = 9 * 12;
        for (int mount = 1; mountTotal >= mount; mount++) {
            int n = vklad * 7 / 100;// 7 процентов
            vklad = vklad + n;
            if (mount % 6 == 0) {
                System.out.println("Месяц " + mount + " результат " + vklad);
            }
        }
        System.out.println();// пустая строка для разделения заданий

        //7
        System.out.println("Задача 7:");
        int friday = 6;
        int dayOfMount = 31;
        for (; friday <= dayOfMount; friday = friday + 7){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();// пустая строка для разделения заданий

        //8
        System.out.println("Задача 8:");
        int everyYear = 79;
        int currentYear = 2025;
        int lastYear = 200;
        int futuroYear = 100;
        int intervalLast = currentYear - lastYear;
        int intervalfuturo = currentYear + futuroYear;
        for (int interval = 0; interval <= intervalfuturo; interval += everyYear ){
            if (interval > intervalLast){
                System.out.println(interval);
            }
        }
    }
}