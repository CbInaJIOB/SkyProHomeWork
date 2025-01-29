public class Main {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

        // Циклы(HW6)
        // 1
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println();

        //2
        for (int a = 10; a > 0; a--){
            System.out.println(a);
        }
        System.out.println();

        //3
        for (int b = 2; b < 17; b += 2){
            System.out.println(b);
        }
        System.out.println();

        //4
        for (int c = 10; c >= -10; c--){
            System.out.println(c);
        }
        System.out.println();

        //5
        for (int year = 1904; year < 2096; year += 4){
            System.out.println(year + " год является високосным");
        }
        System.out.println();

        //6
        for (int d = 7; d < 100; d += 7){
            System.out.println(d);
        }
        System.out.println();

        //7
        for (int e = 1; e < 1024; e *= 2){
            System.out.println(e);
        }
        System.out.println();

        //8
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + (i+1) + ",сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        //9
        int sal= 29000;
        int tot = 0;
        for (int i = 0; i < 12; i++) {
            tot = tot + tot/100;
            tot = tot + sal;
            System.out.println("Месяц " + (i + 1) + ",сумма накоплений равна " + tot + " рублей");
        }
        System.out.println();

        //10
        int f = 2;
        for (int g = 1; g < 11; g++){
            System.out.println(f + "*" + g + "=" + f*g);
        }
        System.out.println();



    }
}
