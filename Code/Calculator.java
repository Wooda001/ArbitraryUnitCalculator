public class Calculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void unitofMeasurement() {
        System.out.println("Please enter your unit of measurement: ");
        String choice = scanner.next();
        switch (choice) {
            case "cm":
                System.out.println("Enter the number of centimeters here: ");
                double chosen = scanner.nextDouble();
                scanner.nextLine();
                if (chosen <= 0) {
                    System.out.println("Please enter a valid value");
                    break;
                } else if (chosen > 0) {
                    System.out.println("Please enter the unit of measurement you would like to calculate to: ");
                    String nextChoice = scanner.next();
                    switch (nextChoice) {
                        case "ft":
                            double numberofcmInFOOT = 30.48;
                            double calculation = chosen / numberofcmInFOOT;

                            System.out.println(chosen + "cm is equal to " + calculation + " feet");
                    }
                }
                break;
            case "in":
                System.out.println("Enter the number of inches here: ");
                chosen = scanner.nextDouble();
                scanner.nextLine();
                if (chosen <= 0) {
                    System.out.println("Please enter a valid value");
                    break;
                } else if (chosen > 0) {
                    System.out.println("Please enter the unit of measurement you would like to calculate to: ");
                    String nextChoice = scanner.next();
                    switch (nextChoice) {
                        case "ft":
                            double numberofinchesInFOOT = 12;
                            double calculation = chosen / numberofinchesInFOOT;

                            System.out.println(chosen + "in is equal to " + calculation + " feet");
                    }
                }
                break;
            default:
                System.out.println("Please enter cm, ft, or in");
                unitofMeasurement();
        }
    }

}
