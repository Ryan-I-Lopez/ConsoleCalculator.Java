import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the first number? ");
        double number1 = scan.nextDouble();
        scan.nextLine();

        System.out.println("What is the second number? ");
        double number2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("What operation do you want to perform(Sum, Sub, Mul, Div)?");
        String operation = scan.nextLine();
        operation = operation.toLowerCase();

        scan.close();
        switch (operation){
            case "sum":
                System.out.printf("%f + %f = %f",number1,number2, number1 + number2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f",number1,number2, number1 - number2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f",number1,number2, number1 * number2);
                break;
            case "div":
                if (number2 == 0){
                    System.out.printf("Can not divide a number by zero.");
                }else {
                    System.out.printf("%f / %f = %f",number1,number2, number1 / number2);
                }
        }

    }
}
