public class Main {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

        // Переменные. Урок 2(HW3)
        // 1
        int a;
        byte b;
        short c;
        long d;
        float e;
        double f;
        a = 100;
        b = 127;
        c = 32000;
        d = 1000000;
        e = 1.23f;
        f = 123.567;

        System.out.println("Значение переменной " + "a " + "с типом int " + "равно " + a );
        System.out.println("Значение переменной " + "b " + "с типом byte " + "равно " + b );
        System.out.println("Значение переменной " + "c " + "с типом short " + "равно " + c );
        System.out.println("Значение переменной " + "d " + "с типом long " + "равно " + d );
        System.out.println("Значение переменной " + "e " + "с типом float " + "равно " + e );
        System.out.println("Значение переменной " + "f " + "с типом double " + "равно " + f);
        System.out.println();

        //2
        float a1 = 27.12f;
        long b1 = 987678965549L;
        float c1 = 2.786f;  // В задании указанна запятая, такой тип в JAVA не поддерживается. Если нужно указать тип данных именно с разделителем ",", то я думаю нужно указывать тип данных String
        short d1 = 569;
        short e1 = -159;
        short f1 = 27897;
        byte g1 = 67;

        //3
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short sum = 480;
        int res = sum / (lP + aS + eA);
        System.out.println("На каждого ученика рассчитано " + res + " листов бумаги");
        System.out.println();

        //4
        int min = 16/2; // Производительность за одну минуту
        int min20 = 20 * min;
        int day = 24 * 60 * min;
        int day3 = 3 * 24 * 60 * min;
        int mounth = 30 * 24 * 60 * min;
        System.out.println("За " + "20 минут " + "машина произвела " + min20 + " штук бутылок");
        System.out.println("За " + "сутки " + "машина произвела " + day + " штук бутылок");
        System.out.println("За " + "3 дня " + "машина произвела " + day3 + " штук бутылок");
        System.out.println("За " + "1 месяц " + "машина произвела " + mounth + " штук бутылок");
        System.out.println();

        //5
        int wh = 2;
        int br = 4;
        int total = 120;
        int kab = total / (wh + br);
        int kabWh = kab * wh;
        int kabBr = kab * br;
        System.out.println("В школе, где " + kab + " классов, нужно " + kabWh + " банок белой краски и " + kabBr + " банок коричневой краски");
        System.out.println();

        //6
        int banana = 5;
        int bananaSum = banana * 80;
        int milk = 200 / 100;
        int milkSum = milk * 105;
        int iceCream = 2;
        int iceCreamSum = iceCream * 100;
        int egg = 4;
        int eggSum = egg * 70;
        int resultGr = bananaSum + milkSum + iceCreamSum + eggSum;
        float resultKg = (float)resultGr / 1000;
        System.out.println("В граммах " + resultGr);
        System.out.println("В килограммах " + resultKg);
        System.out.println();

        //7
        int weight = 7;
        int version1 = 250;
        int version2 = 500;
        int weightGr = weight * 1000; // переводим в граммы
        int answer1 = weightGr / version1;
        int answer2 = weightGr / version2;
        float sred = (float)weightGr / ((version1 + version2) / 2);

        System.out.println("Если каждый день сбрасывать по " + version1 + " грамм, то понадобиться " + answer1 + " дней");
        System.out.println("Если каждый день сбрасывать по " + version2 + " грамм, то понадобиться " + answer2 + " дней");
        System.out.println("Средний результат: " + "Если каждый день сбрасывать по " + ((version1 + version2) / 2) + " грамм, то понадобиться " + sred + " дней");
        // Или так
        System.out.println("В среднем чтобы добиться результата понадобиться " + ((answer1 + answer2)/2) + " дней");
        System.out.println();

        //8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int year = 12;

        int mashaYear = masha * year;//Маша заработала за год до идексации
        int mashaIndex = masha * 10 / 100; // индексация Маши за месяц
        int mashaNew = masha + mashaIndex; // новая зп Маши
        int mashaNewYear = mashaNew * year;// Маша заработала за год после идексации
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + (mashaNewYear - mashaYear) + " рублей");

        int denisYear = denis * year;//Денис заработала за год до идексации
        int denisIndex = denis * 10 / 100; // индексация Денис за месяц
        int denisNew = denis + denisIndex; // новая зп Денис
        int denisNewYear = denisNew * year;// Денис заработала за год после идексации
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + (denisNewYear - denisYear) + " рублей");

        int kristinaYear = kristina * year;//Кристина заработала за год до идексации
        int kristinaIndex = kristina * 10 / 100; // индексация Кристина за месяц
        int kristinaNew = kristina + kristinaIndex; // новая зп Кристина
        int kristinaNewYear = kristinaNew * year;// Кристина заработала за год после идексации
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + (kristinaNewYear - kristinaYear) + " рублей");

    }
}