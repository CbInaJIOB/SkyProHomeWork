public class Main {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

        //1
        System.out.println("Задача 1:");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " +  middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println();

        //2
        System.out.println("Задача 2:");
        System.out.println(fullName.toUpperCase());
        System.out.println();

        //3
        System.out.println("Задача 3:");
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println(fullName1.replace('ё', 'е'));



        //1
        System.out.println("Задача 1:");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " +  middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println();

        //2
        System.out.println("Задача 2:");
        System.out.println(fullName.toUpperCase());
        System.out.println();

        //3
        System.out.println("Задача 3:");
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println(fullName1.replace('ё', 'е'));

    }
}