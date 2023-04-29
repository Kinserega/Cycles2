public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int summaMonth = 15000;
        int month = 0;
        int total = 0;
        while (total < 2_459_000) {
            month += 1;
            total = total + summaMonth;
            System.out.println("Месяц " +month+  ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        for (int i=1; i<=10; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int a = 11;
        while (a > 1){
            a -= 1;
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birth = 17;
        int mortality = 8;
        int year = 1;
        for (; year<=10; year += 1){
            population += (birth-mortality) * population/1000;
            System.out.println("год " + year + ", численность населения составляет " + population);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int summaMonth = 15000;
        int month = 0;
        int total = 0;
        while (total < 12_000_000) {
            month += 1;
            total = (total * 107/100) + summaMonth;
            System.out.println("Месяц " +month+  ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int summaMonth = 15000;
        int month = 0;
        int total = 0;
        while (total < 12_000_000) {
            month += 1;
            total = (total * 107/100) + summaMonth;
            if (month % 6 ==0){
                System.out.println("Месяц " +month+  ", сумма накоплений равна " + total + " рублей");
            }

        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        long summaMonth = 15000;
        int month = 0;
        int year = 9;
        int totalmonth = 12 * year;
        while (month <= totalmonth) {
            month += 1;
            summaMonth = summaMonth * 107/100;
            if (month % 6 ==0){
                System.out.println("Месяц " +month+  ", сумма накоплений равна " + summaMonth + " рублей");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        {
            int friday = 6;
            while (friday<31){
                System.out.println("Сегодня пятница " + friday + "число. Необходимо подготовить отчет");
                friday = friday + 7;
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int period = 79;
        int year = 0;
        int yearAnder = 2023 - 200;
        int yearAfter = 2023 + 100;
        while (year<2023){
            year = year + period;
            if (year > yearAnder || year > yearAfter){
                System.out.println(year);
            }

        }
    }
}