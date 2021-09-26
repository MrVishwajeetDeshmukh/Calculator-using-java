import java.util.Scanner;  //library to scan input given from user

class Main {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter arithmetic operator
    System.out.println("Choose an operator: Addition = [+], Substraction = [-], Multiplication = [*], or Division = [/]");
    operator = input.next().charAt(0);

    // ask users to enter first numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    // ask users to enter second numbers
    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      // to performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // to performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // to performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // to performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}