public class Calculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void calculateMile() {
        System.out.println("Please enter the number of miles so that we may calculate the number of inches in your miles input.");
        double miletoInch = 63360; //inches
        if(scanner.hasNextDouble()) {
            double miles = scanner.nextDouble();
            double calculation = 63360 * miles;
            System.out.println("There are " + calculation + " inches in " + miles + " miles.");
        }
    }

}
