public class BmiService {
    public double calculate(double weight, double height) {
        double a = (height * height);
        double bmi =  weight / a;

        return bmi;
    }
}
