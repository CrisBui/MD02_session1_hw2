import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.print("Nhập số thứ nhất: ");
        firstNumber = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        secondNumber = sc.nextInt();
        System.out.println("--- Kết quả ---");
        System.out.printf("Tổng = %d\n", firstNumber + secondNumber);
        System.out.printf("Hiệu = %d\n", firstNumber - secondNumber);
        System.out.printf("Tích = %d\n", firstNumber * secondNumber);
        System.out.printf("Thương = %d\n", firstNumber / secondNumber);
        System.out.printf("Phần dư = %d", firstNumber % secondNumber);
    }
}
