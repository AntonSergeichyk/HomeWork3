package examples;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        //условие не позволяет задавать отрицательную дату
        if (day >= 1 && year >= 0) {
            nextDay(day, month, year);
        }else System.out.println("дата указана не верно");
    }

    private static void nextDay(int day, int month, int year) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                //для месяца в котором 31 день
                if (++day <= 31) {
                    System.out.println(day + "." + month + "." + year);
                } else if (day > 31 && (month >= 1 && month < 12)) {
                    System.out.println("1." + (++month) + "." + year);
                } else System.out.println("1.1." + (++year));
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                //для месяца в котором 30 дней
                if (++day <= 30) {
                    System.out.println(day + "." + month + "." + year);
                } else System.out.println("1." + (++month) + "." + year);
                break;
            }
            case 2: {
                // для февраля:
                if (++day <= 28) {
                    System.out.println(day + "." + month + "." + year);
                } else System.out.println("1." + (++month) + "." + year);
                break;
            }
            //если выходим из диапазона 12 месяцев
            default:
                System.out.println("Дата указана неверно");
        }
    }
}
