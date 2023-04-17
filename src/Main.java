public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для стоимости билета и количества рублей для одной бонусной мили
        double ticketPrice = 13676.0;
        double milesPerRub = 20.0;

        // Рассчитываем количество бонусных миль
        int miles = (int) (ticketPrice / milesPerRub);

        // Выводим результат на экран
        System.out.println("Количество бонусных миль: " + miles);
    }
}
