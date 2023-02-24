// Написать программу вычисления n-ого треугольного числа. 
import java.util.Scanner;
/**
 * Task_1
 */
public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = iScanner.nextInt();
        iScanner.close();
        System.out.println("Треугольное число = " + Triangle(a) );
    }

    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
    
}