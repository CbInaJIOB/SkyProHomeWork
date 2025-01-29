public class Main {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

        // Условный оператор. Урок 2(HW5)
        //1
        int clientOS = 0;// (0 — iOS, 1 — Android)
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Какая-то неправильная у вас OS");
        }
        System.out.println();// пустая строка для разделения заданий

        //2
        int clientOS1 = 1;// (0 — iOS, 1 — Android)
        int clientDeviceYear = 2015;
        if ((clientOS1 == 1) && (clientDeviceYear >= 2015)){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if ((clientOS1 == 1) && (clientDeviceYear < 2015)){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if ((clientOS1 == 0) && (clientDeviceYear >= 2015)){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ((clientOS1 == 0) && (clientDeviceYear < 2015)){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        System.out.println(); // пустая строка для разделения заданий

        //3
        int year = 200;
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println(); // пустая строка для разделения заданий

        //4
        int deliveryDistance  = 95;
        int deliveryDay = 0;
        if (deliveryDistance < 20){
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance <60) {
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 60 && deliveryDistance <100) {
            deliveryDay = deliveryDay + 3;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println(); // пустая строка для разделения заданий

        //5
        int monthNumber  = 5;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима, в этом году без снега)))");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень, даже может золотая)))");
                break;
            default:
                System.out.println("Такого месяца не бывает");
        }
    }
}
