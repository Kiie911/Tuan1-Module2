import java.util.Scanner;

public class DemoPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số : ");
        int number=scanner.nextInt();
        int count=0;
        for (int i = 2; i <=number ; i ++){
            if (number%i == 0){
                count ++;
            }
        }
        if (count == 1){
            System.out.println(number + "là số nguyên tố");
        } else {
            System.out.println(number + "không là số nguyên tố");
        }
    }
}
