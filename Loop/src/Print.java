public class Print {
    public static void main(String[] args) {
//        In ra hình chữ nhật
        for (int i =0 ; i < 4 ; i++){
            for (int j = 0; j < 8 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        In ra hình tam giác vuông
        for (int a=0 ; a<5 ; a++){
            for (int b=0 ; b<5-a ; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
