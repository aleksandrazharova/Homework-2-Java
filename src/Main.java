public class Main {
    public static void main(String[] args) {
        int count = 100;
        int amount = 1099;
        int bonus = amount / 100;
        int finalcount = count + amount;
        int total = 0;
        if (amount < 1000) {
            total = finalcount;
        } else {
            total = finalcount + bonus;
        }
        System.out.println("Бонус равен "+ bonus + " рублям.");
        System.out.println("Итоговая сумма на счету клиента " + total + " рублей.");
    }
}
