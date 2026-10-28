public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
        double weightInKg = 1.87;
        double heightInMeters = 98;
        int bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println(bmi);

    }
}