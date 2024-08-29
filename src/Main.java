public class Main {
    public static void main(String[] args) {
        System.out.println("Первая задача (первый вариант решения)");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        System.out.println("Первая задача (второй вариант решения)");
        switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Ничего");
            }

        System.out.println("Первый вариант решения второй задачи");
        int clientDeviceYear = 2019;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию для Android по ссылке");
            }
        }
        System.out.println("Второй варинт решения второй задачи");
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию для Android по ссылке");
        }

        System.out.println("Третья задача");
        int year = 1600;
        if ((year >= 1584 && year % 4 == 0 && year % 100 != 0) || (year >= 1584 && year % 400 == 0)) {
            System.out.println(year + " год является високосным!");
        } else if ((year >= 1584 && year % 4 != 0 && year % 100 == 0) || (year >= 1584 && year % 400 != 0)){
            System.out.println(year + " год не является високосным!");
        } else {
            System.out.println("Високосный год ещё не был введен");
        }

        System.out.println("Четвертая задача");
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Для доставки карты потребуется " + days + " день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Для доставки карты потребуется " + (days += 1) + " дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Для доставки карты потребуется " + (days += 2) + " дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

        System.out.println("Пятая задача");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к сезону - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к сезону - осень");
                break;
            default:
                System.out.println("Такого месяца не существуют");
        }
    }
}