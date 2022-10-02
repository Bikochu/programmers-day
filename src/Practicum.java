import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Ввести год.");
            System.out.println("2 - Выход.");
            int choose = scanner.nextInt();
            if (choose == 1) {
                System.out.println("Введите год:");
                int year = scanner.nextInt();
                if (isLeapYear(year)) {
                    System.out.println("12.09." + year + " - Високостный год.");// здесь нужно вывести результат
                } else {
                    System.out.println("13.09." + year + " - Не високостный год.");
                }
            } else if (choose == 2) {
                break;
            }
        }
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0){
            return false;// здесь нужно определить, является ли переданный год високосным
        }else if (year % 400 != 0) {
            return false;
        } else if (year % 100 == 0){
            return true;
        } else{
            return true;
        }
    }
}