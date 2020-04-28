public class Demo20PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int countNumber = 0;
        int a = 2;
        while (countNumber < 20) {
            for (int j = 2; j <= a; j++) {
                if (a % j == 0) {
                    count++;
                }
            }
            if (count == 1){
                System.out.println(a);
                countNumber++;
            }
            a++;
            count=0;
        }
    }
}