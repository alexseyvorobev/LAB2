import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        int a;
        int b;
        int flag = 1;
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите значение от 1 до 15: ");
            a = s.nextInt();
            s.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Error");
            flag=0;
            a=-1;
        }
        int result = 1;
        int result1 = 1;
        b=a;
        if ((a<=15)&(flag == 1)) {
            while ((b >= 1)) {
                result = result * b;
                b = (b - 1);

            }
        }
            else;
            if ((a <= 15)&(a>=0)&(flag == 1)) {
                for (int i = 1; i <= a; i++) {
                result1= result1*i;
                }
            }
        System.out.println("Факториал равен:");
        System.out.println(result);
        System.out.println(result1);
    }
}