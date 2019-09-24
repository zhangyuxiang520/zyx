import java.util.*;

public class dingjifen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.println("输入上限、下限");

            double a = input.nextDouble();

            double b = input.nextDouble();

            double sum = 0;

            double c =cha(a, b, 100000.0);

            for (int j = 1; j <= 100000; j++) {

                double x = y(a, b,100000.0, j);

                sum = sum + f(x);

            }

            System.out.print("f(x)=sinx积分为：");

            System.out.println(sum * c);

        }

    public static double f(double x) {

        return Math.sin(x); 

    }

    public static double y(double a, double b, double n, int i) {

        return a + i * (b - a) / n;

    }

    public static double cha(double a, double b, double n) {

        return (b - a) / n;

    }

}