import java.util.Scanner;
import java.util.SimpleTimeZone;

public class RetangleProgram {
    public static void main(String[] args) {
        float witdh;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width : ");
        witdh = scanner.nextFloat();

        System.out.println("Enter height : ");
        height = scanner.nextFloat();

        float area=witdh*height;

        System.out.println("Area is : " + height);
        System.out.println("Area is : " + area);
    }
}
