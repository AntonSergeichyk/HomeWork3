package examples;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double disc;

        disc = discriminant(a, b, c);

        if (disc > 0) {
            isPositiv(a, b, disc);
        }else if (disc==0){
            isZero(b, a);
        }else System.out.println("Дискриминант уравнения отрицательный!!!");
    }




    private static double discriminant(double a, double b, double c) {
        return  Math.pow(b,2)-4*a*c;
    }

    private static void isPositiv(double a, double b,  double disc) {
        double res1 = (-b+Math.pow(disc,0.5))/2*a;
        double res2 = (-b-Math.pow(disc,0.5))/2*a;
        System.out.println("x1= "+res1);
        System.out.println("x2= "+res2);
    }

    private static void isZero(double b, double a) {
        double res1res2 = -b/2*a;
        System.out.println("x1 = x2 = "+res1res2);
    }
}
