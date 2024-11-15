public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 55.0; // Вес в кг
        double height = 1.65; // Рост в м
        int bmi = service.calculate(weight, height);
        System.out.println("Индекс массы тела: " + bmi);
    }
}