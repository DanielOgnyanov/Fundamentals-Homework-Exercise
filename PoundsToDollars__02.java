import java.util.Scanner;

public class PoundsToDollars__02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pound = Double.parseDouble(scanner.nextLine());

        double convert = pound * 1.31;

        System.out.printf("%.3f", convert);
    }
}
