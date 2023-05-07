// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int balance = 13676;
        int payment = 1050;
        int bonus = 0;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int total = balance + payment + bonus;
        System.out.println("Итоговый счет = " + total);
        System.out.println("Количество бонусных рублей = " + bonus);
    }
}