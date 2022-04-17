package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class calculator {

    public static final Logger logger = LogManager.getLogger(calculator.class);

    public calculator() {}

    public static void main(String[] args) {
        calculator cal = new calculator();
        Scanner scanner = new Scanner(System.in);
        double in1, in2;

        do{
            System.out.println("Calcuator");
            System.out.println("Available functions\n1 - Square Root of x\n2 - Factorial of x\n3 - Natural Log of x\n4 - x Power b\n5-multiplication\nAny other number to exit");
            int fun_input;

            try{
                fun_input = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            if (fun_input < 1 || fun_input > 5){
                return;
            }

            try{
                System.out.println("Enter x");
                in1 = scanner.nextDouble();
            } catch (InputMismatchException error) {
                return;
            }

            switch(fun_input){
                case 1:
                    System.out.println("Square root of x = " + calculator.sqt(in1));
                    break;
                case 2:
                    System.out.println("Factorial of x =" + calculator.factorial(in1));
                    break;
                case 3:
                    System.out.println("Natural log of x =" + calculator.log(in1));
                    break;
                case 4:
                    try {
                        System.out.print("Enter b");
                        in2 = scanner.nextDouble();
                    } catch (InputMismatchException error){
                        return;
                    }
                    System.out.println("x power b = " + calculator.power(in1, in2));
                    break;
                case 5:
                    try {
                        System.out.print("Enter b");
                        in2 = scanner.nextDouble();
                    } catch (InputMismatchException error){
                        return;
                    }
                    System.out.println("x product b = " + calculator.multiply(in1, in2));
                    break;
                default:
                    System.out.print("Closing");
                    return;
            }
        }while(true);
    }


    public static double sqt(double i){
        double ans = 0;
        try {
            logger.info("[SQRT] - " + i);
            if (i < 0) {
                ans = Double.NaN;
                throw new ArithmeticException("square root of -ve numbers is invalid");
            } else {
                ans = Math.sqrt(i);
            }
        } catch (ArithmeticException error){
            logger.error("[EXCEPTION - SQRT] - sqrt of -ve numbers is invalid");
        } finally {
            logger.info("[RESULT - SQRT] = " + ans);
        }
        return ans;
    }

    public static double factorial(double i){
        logger.info("[FACTORIAL] - " + i );
        double ans = 1.0;
        for (int t = 1; t<= i; t++){
            ans *= t;
        }
        logger.info("[RESULT - FACTORIAL] = " + ans);
        return ans;
    }
    public static double log(double i){
        Double ans = 0.0;
        try {
            logger.info("[LOG] - " + i);
            if (i < 0){
                ans = Double.NaN;
                throw new ArithmeticException("log of negative numbers is invalid");
            }
            else if (i == 0){
                ans = Double.NEGATIVE_INFINITY;
                throw new ArithmeticException("Log of 0 is negative infinity");
            }
            else {
                ans = Math.log(i);
            }
        } catch (ArithmeticException error){
            logger.error("[EXCEPTION - log] - input is less than or equal to zero");
        } finally {
            logger.info("[RESULT - LOG] = " + ans);
        }
        return ans;
    }
    public static double power(double i, double j){
        logger.info("[POWER] - " + i + ", " + j );
        double ans = Math.pow(i,j);
        logger.info("[RESULT - POWER] = " + ans);
        return ans;
    }
    public static double multiply(double i, double j){
        logger.info("[Product] - " + i + ", " + j );
        double ans = i*j;
        logger.info("[RESULT - Product] = " + ans);
        return ans;
    }

}
