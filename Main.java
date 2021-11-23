package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Viết chương trình giải phương trình bậc nhất 1 ẩn ax + b = 0, với a và b nhập vào từ bàn phím
        System.out.println("Giải phương trình bậc nhất 1 ẩn ax + b = 0");
        System.out.print("Giá trị a là: ");
        double a1 = sc.nextDouble();
        System.out.print("Giá trị b là: ");
        double b1 = sc.nextDouble();
        System.out.print("Đáp án x là: " + (-b1 / a1));

        //Viết chương trình giải phương trình bậc hai 1 ẩn ax 2 + bx + c = 0 (a!=0), với a, b, c nhập vào từ bàn phím
        System.out.println("\n\nGiải phương trình bậc hai 1 ẩn ax 2 + bx + c = 0");
        System.out.print("Giá trị a là: ");
        double a2 = sc.nextDouble();
        System.out.print("Giá trị b là: ");
        double b2 = sc.nextDouble();
        System.out.print("Giá trị c là: ");
        double c2 = sc.nextDouble();
        double delta2 = Math.pow(b2, 2) - 4 * a2 * c2;
        if (delta2 < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta2 == 0) {
            System.out.println("Phương trình chứa nghiệm kép = " + (-b2 / (2 * a2)));
        } else if (delta2 > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt là: " + ((-b2 + Math.sqrt(delta2)) / (2 * a2)) + " và " + ((-b2 - Math.sqrt(delta2)) / (2 * a2)));
        }

        //Viết chương trình liệt kê các số nguyên tố nhỏ hơn 20
        int n = 0;
        int i = 0;
        String numbers = "";
        System.out.println("\nCác số nguyên tố nhỏ hơn 20 là: ");
        for (n = 1; n <= 20; n++) {
            int count = 0;
            for (i = n; i >= 1; i--) {
                if (n % i == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                numbers = numbers + n + " ";
            }
        }
        System.out.println(numbers);
    }
}
