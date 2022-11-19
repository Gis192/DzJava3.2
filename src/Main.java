public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        {
            // вес в КГ
            double weight = 100;
            // рост в Метрах
            double height = 1.75;
            double bmi = service.calculate(weight, height);
            System.out.println(bmi);
            System.out.println();
            System.out.println(service.calculate(90,1.65));
            System.out.println(service.calculate(118,1.68));
            System.out.println(service.calculate(110,1.68));
            System.out.println(service.calculate(200,1.68));
            System.out.println(service.calculate(140,1.68));

        }
    }
}