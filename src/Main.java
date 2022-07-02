import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner arearectangle = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the length of the rectangle = ");
        double length = arearectangle.nextDouble();

        System.out.print("Enter the width of the rectangle = ");
        double width = arearectangle.nextDouble();

        double area = length * width;
        System.out.printf("AREA = " + "%.2f", area);

    }
}