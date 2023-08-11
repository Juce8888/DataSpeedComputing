import java.util.Scanner;

public class Main {

    private final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Build a scanner

        //Prompt and store double amount
        double dataAmount = promptForAmount();
        //Prompt and store String unit
        String dataType = promptForDataType();
        //Prompt and store download speed (in megabits
        double downloadSpeed = promptForDownloadSpeed();
        //Build a Data object with these three values
        Data entry1 = new Data(dataAmount, dataType, downloadSpeed);
        //Print out the data Object with your toString();
    }

    public static double promptForAmount() {
        System.out.println("Enter the amount of data: ");
        double inputAmount = 0;
        boolean validEntry = false;
        while (!validEntry) {
            try {
                inputAmount = input.nextDouble();
                validEntry = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid entry.");
                input.nextDouble();
            }
        }
        return inputAmount;
    }

    public static String promptForDataType() {
        System.out.println("Enter the unit (bytes, kilobytes, megabytes, gigabytes): ");
        String inputDataType = "";
        boolean validEntry = false;
        while (!validEntry) {
            try {
                inputDataType = input.next();
                validEntry = true;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid entry.");
                input.next();
            }
        }
        return inputDataType;
    }

    public static double promptForDownloadSpeed() {
        System.out.println("Enter download speed (in megabits per second): ");
        double inputDownloadSpeed = 0;
        boolean validEntry = false;
        while (!validEntry) {
            try {
                inputDownloadSpeed = input.nextDouble();
                validEntry = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid entry.");
                input.nextDouble();
            }
        }
        return inputDownloadSpeed;
    }
}
