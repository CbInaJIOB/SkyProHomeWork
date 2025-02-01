public class Main {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

        //1
        System.out.println("Задача 1:");
        int[] arrayInt = {1, 2, 3};// массив целых чисел
        float[] arrayFloat = {1.57f, 7.654f, 9.986f};// массив действительных чисел
        int[] numbers = new int[30];// произвольный массив(0 - 29)
        for (int i = 0; i < 30; i++) {
            numbers[i] += i;
        }
        System.out.println();// Пустая стока для отделения заданий

        //2
        System.out.println("Задача 2:");
        //2.1
        int arrIntSize = arrayInt.length;
        for (int a = 0; a < arrIntSize; a++) {
            if (a < (arrIntSize - 1)) {
                System.out.print(arrayInt[a] + ", ");
            } else {
                System.out.println(arrayInt[a]);
            }
        }

        //2.2
        int arrFloatSize = arrayFloat.length;
        for (int b = 0; b < arrFloatSize; b++) {
            if (b < arrFloatSize - 1) {
                System.out.print(arrayFloat[b] + ", ");
            } else {
                System.out.println(arrayFloat[b]);
            }
        }

        //2.3
        int arrNumbersSize = numbers.length;
        for (int c = 0; c < arrNumbersSize; c++) {
            if (c < arrNumbersSize - 1) {
                System.out.print(numbers[c] + ", ");
            } else {
                System.out.println(numbers[c]);
            }
        }
        System.out.println();// Пустая стока для отделения заданий


        //3
        System.out.println("Задача 3:");
        //3.1
        for (int a = arrIntSize; a > 0; a--) {
            if (a > 1) {
                System.out.print(arrayInt[a - 1] + ", ");
            } else {
                System.out.println(arrayInt[a - 1]);
            }
        }

        //3.2
        for (int b = arrFloatSize; b > 0; b--) {
            if (b > 1) {
                System.out.print(arrayFloat[b - 1] + ", ");
            } else {
                System.out.println(arrayFloat[b - 1]);
            }
        }

        //3.3
        for (int c = arrNumbersSize; c > 0; c--) {
            if (c > 1) {
                System.out.print(numbers[c - 1] + ", ");
            } else {
                System.out.println(numbers[c - 1]);
            }
        }
        System.out.println();// Пустая стока для отделения заданий

        //4
        System.out.println("Задача 4:");
        int[] array = {1, 2, 3};
        int n = array.length - 1;
           for (int i = 0; i <= n; i++) {
            if (array[i] % 2 != 0) {
                System.out.print((array[i] = array[i] + 1) + " ");
            } else {
                System.out.print(array[i] + " ");
            }
        }


    }
}
